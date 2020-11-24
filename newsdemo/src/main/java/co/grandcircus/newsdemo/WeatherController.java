package co.grandcircus.newsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;

	// Send a form to the browser
	@GetMapping("/weather")
	public String weather() {
		return "weather";
	}
	
	// Read the form and send the results
	@PostMapping("/weather")
	public String postweather(String latitude, String longitude, Model model) {
		System.out.println("Weather for:");
		System.out.println(latitude);
		System.out.println(longitude);
		WeatherData response = weatherService.getWeather(latitude, longitude);
		model.addAttribute("weather", response);
		return "weatherresults";
		
	}
	
}
