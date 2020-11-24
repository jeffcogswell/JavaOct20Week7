package co.grandcircus.newsdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "{ temperature: 75 }";
	}
	
	@GetMapping("/test")
	public List<String> test() {
		List<String> result = new ArrayList<String>();
		result.add("Hello");
		result.add("World");
		result.add("Greetings");
		return result;
	}
	
	@GetMapping("/todaynews")
	public String todaynews() {
		String url = "https://newsapi.org/v2/everything?q=bitcoin&sortBy=publishedAt&apiKey=3ff75cfeb7aa47f598796bf6484d5f9b";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		String result = response.getBody();
		return result;
	}

}







