package com.weather.app;

import java.util.Scanner;

import org.json.JSONObject;

import com.squareup.okhttp.*;

public class WeatherForecast {

	public static void main(String[] args) throws Exception{
		
		String apiKey = "fbb859fb6592a2b1a50d567dd57fcd10";
		
		System.out.println("Please enter a city to find it's weather");
		
		Scanner scan = new Scanner(System.in);
		
		String city = scan.nextLine();
		
		String endpoint = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=" + apiKey;
		
		OkHttpClient httpClient = new OkHttpClient();
		
		Request weatherRequest = new Request.Builder().url(endpoint).build();
		
		Response weatherResponse = httpClient.newCall(weatherRequest).execute();
		
		JSONObject json = new JSONObject(weatherResponse.body().string());
		
		System.out.println(json.toString(4));
		
	}

}
