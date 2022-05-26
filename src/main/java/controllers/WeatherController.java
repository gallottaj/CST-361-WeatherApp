package controllers;

import api.WeatherService;

public class WeatherController {

	private WeatherService service;
	
	public WeatherController()
	{
		service = new WeatherService();
	}
	
	
}
