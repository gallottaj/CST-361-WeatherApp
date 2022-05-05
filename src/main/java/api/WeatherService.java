package api;

import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("weather")
public class WeatherService {

	@GET
	@Path("current")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getWeatherByCity(@QueryParam("city") String city){
		
		System.out.println(city);
		WeatherDataService service = new WeatherDataService();		
		String weather = service.getWeatherByCity(city);

		return Response.ok(weather).build();
	}
	
	@GET
	@Path("coord")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getWeatherByCoord(@QueryParam("lat") String lat, @QueryParam("lon") String lon){
		
		WeatherDataService service = new WeatherDataService();
		String weather = service.getWeatherByCoordinates(lat, lon);
		
		return Response.ok(weather).build();
	}
}
