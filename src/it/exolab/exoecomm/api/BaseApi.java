package it.exolab.exoecomm.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;


public class BaseApi {
	
	
	private static final String API_URL = "http://localhost:8080/exoecommRest/api/";

	protected String doGet(String apiURL) throws Exception {
		
	
            URL url = new URL(API_URL +apiURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) { // codice 200
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

               
                String json =response.toString();
                
                return json;
                
            } else {
                throw new Exception("errore sconosciuto");
            }
       
		
		
		
	}
	protected String doPost(String apiURL,String data) throws Exception {
		
		 URL url = new URL(API_URL +apiURL);
		 System.out.println(url.toString());
         HttpURLConnection connection = (HttpURLConnection) url.openConnection();

         connection.setRequestMethod("POST");
         connection.setRequestProperty("Content-Type", "application/json");
         connection.setDoOutput(true);

         //String jsonInputString = "{ \"key\": \"value\" }";
         

         try (OutputStream os = connection.getOutputStream()) {
             byte[] input = data.getBytes("utf-8");
             os.write(input, 0, input.length);
         }

         int responseCode = connection.getResponseCode();
         System.out.println("Response Code: " + responseCode);

         if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_CREATED) {
             System.out.println("POST request successful");
             
             BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             String inputLine;
             StringBuilder response = new StringBuilder();

             while ((inputLine = in.readLine()) != null) {
                 response.append(inputLine);
             }
             in.close();

             String json =response.toString();
             
             return json;
             
         } else {
        	 throw new Exception("errore sconosciuto");
         }
     
		
	}

}
