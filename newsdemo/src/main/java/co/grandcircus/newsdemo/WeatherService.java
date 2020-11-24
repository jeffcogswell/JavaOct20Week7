package co.grandcircus.newsdemo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	public WeatherData getWeather(String latitude, String longitude) {
		String url = "https://forecast.weather.gov/MapClick.php?lat=" + latitude + "&lon=" + longitude + "&FcstType=json";
		RestTemplate restTemplate = new RestTemplate();
		WeatherData data = restTemplate.getForObject(url, WeatherData.class);
		return data;
	}
}

// 38.4247341
// -86.9624086