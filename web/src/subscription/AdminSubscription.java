package subscription;
import web.Form;
import web.Form.thehandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;





public class AdminSubscription{
	
	private final String USER_AGENT = "Mozilla/5.0";
		
	thehandler form = new Form.thehandler();
	
private final String PAID_URL = ("http://127.0.0.1:11088/testpfsapi/test?cmd=registrationRequest&1=91" +form.s1 + "&2=true&3=" +form.s6);


public void activation() throws IOException {
		PaidActivation();
		System.out.println(PAID_URL);
		System.out.println("Activation DONE");
	
	 }


private void PaidActivation() throws IOException {
	URL obj = new URL(PAID_URL);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	con.setRequestMethod("GET");
	con.setRequestProperty("User-Agent", USER_AGENT);
	int responseCode = con.getResponseCode();
	System.out.println("GET Response Code :: " + responseCode);
	if (responseCode == HttpURLConnection.HTTP_OK) { // success
		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());
	} else {
		System.out.println("GET request not worked");
	}

}

}

