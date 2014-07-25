package net.bearsoft.pokeassistant.api;
/**
 * @author Michael Cohen
 *
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.json.JSONObject;

import android.os.AsyncTask;



/**
 * @author root
 *
 */
public abstract class ModelClass {
	
	protected String Name, URI;
	protected int ID;
	protected Date Created, Modified;
	
	

	protected JSONObject parse(String data) {
		JSONObject root;
		try {
		root = new JSONObject(data);		
		return root;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	protected String get(String urlAddress) {
		String data = "";
		try {
			data = new AsyncTask<String, String, String>() {

				@Override
				protected String doInBackground(String... params) {
					DefaultHttpClient   httpclient = new DefaultHttpClient(new BasicHttpParams());
					HttpPost httppost = new HttpPost("http://pokeapi.co/api/v1/" + params[0]);
					// Depends on your web service
					httppost.setHeader("Content-type", "application/json");

					InputStream inputStream = null;
					String result = null;
					try {
					    HttpResponse response = httpclient.execute(httppost);           
					    HttpEntity entity = response.getEntity();

					    inputStream = entity.getContent();
					    // json is UTF-8 by default
					    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);
					    StringBuilder sb = new StringBuilder();

					    String line = null;
					    while ((line = reader.readLine()) != null)
					    {
					        sb.append(line + "\n");
					    }
					    result = sb.toString();
					} catch (Exception e) { 
					    // Oops
					}
					finally {
					    try{if(inputStream != null)inputStream.close();}catch(Exception squish){}
					}
					return result;
				}
				
				
			}.execute(urlAddress).get();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return data;
	}
	
	/**
	 * @return String Name: Name representation of object
	 */
	public String getName(){ return Name;}
	
	
	/**
	 * @return String URI: URI to the specific Object
	 */
	public String getURI(){ return URI;}
	
	
	/**
	 * @return Date Modified: A date object representing the last time said API was updated
	 */
	public Date getModified(){return Modified;}
	
	
	/**
	 * @return Date Created: A date object representing the API's creation
	 */
	public Date getCreated(){ return Created;}
	
	
	/**
	 * @return int ID: ID number of the object within the pokeapi database
	 */
	public int getID(){return ID;}
	
	public String toString(){
		String data = this.getClass().getSimpleName() + ": " + Name + "\nID: " + ID;
		return data;
	}
	
	/**
	 * Prints the toString() of the object to the console
	 */
	public void printInfo(){
		System.out.println(toString());
	}
}
