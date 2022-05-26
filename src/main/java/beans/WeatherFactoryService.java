package beans;

public class WeatherFactoryService {

	public static void main(String[] args) {
		WeatherFactory weatherFactory = new WeatherFactory();
		Weather weather = weatherFactory.createWeather("DISPLAY");
		weather.notifyUser();
	}
}