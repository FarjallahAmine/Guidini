package netlinks.mobile.services.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import netlinks.mobile.config.config;
import netlinks.mobile.metier.Restaurant;
import netlinks.mobile.service.RestaurantService;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class RestaurantServImplement implements RestaurantService
{
	String result = "";
	List<Restaurant> restaurants;

		public List<Restaurant> getAll() {
		
			restaurants = new ArrayList<Restaurant>();
			
			HttpClient httpClient = new DefaultHttpClient();
			HttpGet request = new HttpGet(config.service);
			
			ResponseHandler<String> handler = new BasicResponseHandler();
			try{
				result = httpClient.execute(request,handler);
				httpClient.getConnectionManager().shutdown();
				
				Gson gson = new Gson();
				JsonParser jsonParser = new JsonParser();
				JsonArray userArray = jsonParser.parse(result).getAsJsonArray();
				
				for( JsonElement uneAnnonce : userArray)
				{
					Restaurant a = gson.fromJson(uneAnnonce, Restaurant.class);
					restaurants.add(a);
				}
				return restaurants;
			}catch(ClientProtocolException e)
			{
				e.printStackTrace();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			
			return restaurants;
		}
	}