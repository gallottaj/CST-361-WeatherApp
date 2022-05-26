package beans;

public class DisplayWeather implements Weather {

	@Override
	public void notifyUser() {
		System.out.println("Notifying the user of weather updates");
	}

}
