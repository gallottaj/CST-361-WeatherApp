package api;

import java.util.Map;

import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;

import beans.Weather;

@Path("weather")
public class WeatherService {
	
	public WeatherService(){}

	@GET
	@Path("current")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getWeatherByCity(@QueryParam("city") String city) {

		System.out.println(city);
		WeatherDataService service = new WeatherDataService();
		String weather = service.getWeatherByCity(city);
		System.out.println(weather);
		JSONObject j = new JSONObject(weather);
		JSONObject sys = j.getJSONObject("sys");
		JSONObject coord = j.getJSONObject("coord");
		JSONObject main = j.getJSONObject("main");
		System.out.println(sys.get("country"));
		
		
		System.out.println(j.get("visibility"));
		
		/* Testing */
		Weather w = new Weather();
		w.setName((String)j.get("name"));
		w.setCountry((String)sys.get("country"));
		w.setLat((String)coord.get("lat").toString());
		w.setLon((String)coord.get("lon").toString());
		w.setTemp((String)main.get("temp").toString());
		w.setTemp_high((String)main.get("temp_max").toString());
		w.setTemp_low((String)main.get("temp_min").toString());
		w.setFeels_like((String)main.get("feels_like").toString());
		w.setHumidity((String)main.get("humidity").toString());
		w.setDescription("Test Description");
		System.out.println(w.toString());
		/* END of Testing */

		return Response.ok(weather).build();
	}

	@GET
	@Path("coord")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getWeatherByCoord(@QueryParam("lat") String lat, @QueryParam("lon") String lon) {

		WeatherDataService service = new WeatherDataService();
		String weather = service.getWeatherByCoordinates(lat, lon);

		return Response.ok(weather).build();
	}
	
	public Weather getWeatherByCityy(@QueryParam("city") String city)
	{
		WeatherDataService service = new WeatherDataService();		
		String weather = service.getWeatherByCity(city);
		
		JSONObject j = new JSONObject(weather);
		
		Weather w = new Weather();
		w.setName((String)j.get("name"));
		w.setCountry((String)j.get("country"));
		w.setLat((String)j.get("lat"));
		w.setLon((String)j.get("lon"));
		w.setTemp((String)j.get("temp"));
		w.setTemp_high((String)j.get("temp_max"));
		w.setTemp_low((String)j.get("temp_min"));
		w.setFeels_like((String)j.get("feels_like"));
		w.setHumidity((String)j.get("humidity"));
		w.setDescription((String)j.get("description"));
		System.out.println(w.toString());
		
		return null;
	}
}
