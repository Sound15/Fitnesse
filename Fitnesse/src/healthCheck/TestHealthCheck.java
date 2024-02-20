package healthCheck;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import fit.ColumnFixture;

public class TestHealthCheck extends ColumnFixture{
	String urlGiven;
	URL url;
	HttpURLConnection connection;
	int responsecode;
	String responsemessage;

	public String getRequest() throws IOException {
		url=new URL(urlGiven);
		connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		
		return "URL HIT";		
		}
	
	public String getStatusMessage() throws IOException {
		responsemessage=connection.getResponseMessage();
		System.out.println(responsemessage);
		return responsemessage;
	}
	
	public int getStatusCode() throws IOException {
		responsecode=connection.getResponseCode();
		System.out.println(responsecode);	
		return responsecode;
	}
	
	 
}
