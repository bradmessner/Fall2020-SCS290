import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class apiusage {
	 public static void main(String[] args) {
	        try {
	            URL queryUrl = new URL("https://api.livecoin.net/exchange/order_book?currencyPair=LTC/BTC");
	            HttpURLConnection connection = (HttpURLConnection)queryUrl.openConnection();
	            connection.setDoOutput(true);
	 
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
	}
