import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.TreeMap;
import java.util.Map;

public class api2 {

	public static final java.lang.String HMAC_SHA256_ALGORITHM = "HmacSHA256";
	public static final java.lang.String UNICODE_CODE = "UTF-8";
	public static final String URL = "https://api.livecoin.net/exchange/buylimit";

	// your API key
	public static final String apiKey = "XXX";
	// your secret key
	public static final String secKey = "XXX";

	public static void main(String[] args) {
		try {
			Map<String, String> postData = new TreeMap<>();
			postData.put("currencyPair", "BTC/USD");
			postData.put("price", "60");
			postData.put("quantity", "1");
			String queryString = buildQueryString(postData);
			String signature = createSignature(queryString, secKey);

			URL queryUrl = new URL(URL);
			HttpURLConnection connection = (HttpURLConnection)queryUrl.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Api-Key", apiKey);
			connection.setRequestProperty("Sign", signature);
			connection.getOutputStream().write(queryString.getBytes());

			BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line + '\n');
			}
			System.out.println(sb.toString());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static String buildQueryString(Map<String, String> args) {
		StringBuilder result = new StringBuilder();
		for (String hashKey : args.keySet()) {
			if (result.length() > 0) result.append('&');
			try {
				result.append(URLEncoder.encode(hashKey, "UTF-8"))
				.append("=").append(URLEncoder.encode(args.get(hashKey), "UTF-8"));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return result.toString();
	}

	private static String createSignature(String paramData, String plainSecretKey) {
		try {
			SecretKeySpec secretKey = new SecretKeySpec(plainSecretKey.getBytes(UNICODE_CODE), HMAC_SHA256_ALGORITHM);
			Mac mac = Mac.getInstance(HMAC_SHA256_ALGORITHM);
			mac.init(secretKey);
			byte[] hmacData = mac.doFinal(paramData.getBytes(UNICODE_CODE));
			return byteArrayToHexString(hmacData).toUpperCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String byteArrayToHexString(byte[] bytes) {
		final char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] hexChars = new char[bytes.length * 2];
		int v;
		for (int j = 0; j < bytes.length; j++) {
			v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}
}