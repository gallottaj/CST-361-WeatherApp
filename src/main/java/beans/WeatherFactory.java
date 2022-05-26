package beans;

public class WeatherFactory {

	public Weather createWeather(String weather) {
		if (weather == null || weather.isEmpty())
			return null;
		switch (weather) {
			case "DISPLAY":
				return new DisplayWeather();
			default:
				throw new IllegalArgumentException("Unknown weather " + weather);
		}
	}

}
