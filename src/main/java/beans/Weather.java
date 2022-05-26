package beans;

public class Weather {

	String name = "";
	String country = "";
	String lat = "";
	String lon = "";
	String temp = "";
	String temp_low = "";
	String temp_high = "";
	String feels_like = "";
	String humidity = "";
	String description = "";
	
	public Weather(){}
	
	public Weather(String name, String country, String lat, String lon
			,String temp, String temp_low, String temp_high, String feels_like,
			String humidity, String description)
	{
		this.name = name;
		this.country = country;
		this.lat = lat;
		this.lon = lon;
		this.temp = temp;
		this.temp_low = temp_low;
		this.temp_high = temp_high;
		this.feels_like = feels_like;
		this.humidity = humidity;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getTemp_low() {
		return temp_low;
	}

	public void setTemp_low(String temp_low) {
		this.temp_low = temp_low;
	}

	public String getTemp_high() {
		return temp_high;
	}

	public void setTemp_high(String temp_high) {
		this.temp_high = temp_high;
	}

	public String getFeels_like() {
		return feels_like;
	}

	public void setFeels_like(String feels_like) {
		this.feels_like = feels_like;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Weather [name=" + name + ", country=" + country + ", lat=" + lat + ", lon=" + lon + ", temp=" + temp
				+ ", temp_low=" + temp_low + ", temp_high=" + temp_high + ", feels_like=" + feels_like + ", humidity="
				+ humidity + ", description=" + description + "]";
	}
}
