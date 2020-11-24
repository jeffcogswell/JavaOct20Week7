package co.grandcircus.newsdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class WebController {
	
	@GetMapping("/webnews")
	public String webnews(Model model) {
		String url = "https://newsapi.org/v2/everything?q=bitcoin&sortBy=publishedAt&apiKey=3ff75cfeb7aa47f598796bf6484d5f9b";
		RestTemplate restTemplate = new RestTemplate();
		
		// The next line connects to the remote server, gets back JSON (we don't see the JSON!)
		// and then converts it to NewsResponse. How does it know to convert to NewsResponse?
		// We told it to do so with the second parameter, "NewsResponse.class"
		NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
		
		// Now we have our NewsResponse object, which contains a list of articles.
		// Let's send it into the JSP to make some nice HTML		
		model.addAttribute("articles", response.getArticles());
		return "webnews";
		
		// After we make the nice HTML, we'll send that HTML back to the end user's browser
	}
}























