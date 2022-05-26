package api;

import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class WeatherDataService {
	
	public WeatherDataService(){
		
	}

	//Gets API weather data with City Name
	public String getWeatherByCity(String key){
		
		Client client = ClientBuilder.newBuilder().build();
		WebTarget target = client.target("https://api.openweathermap.org/data/2.5/weather?q=" + key + "&appid=75b5a45fe3c22f478a2199b9a43a69ac&units=imperial");
		Response response = target.request().get();
		
		String value = response.readEntity(String.class);
		
		return value;
	}
	
	//Get API Weather data with lat long coordinates
	public String getWeatherByCoordinates(String lat, String lon){
		
		Client client = ClientBuilder.newBuilder().build();
		WebTarget target = client.target("https://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon + "&appid=75b5a45fe3c22f478a2199b9a43a69ac&units=imperial");
		Response response = target.request().get();
		
		String value = response.readEntity(String.class);
		
		return value;
	}
}
