package co.grandcircus.newsdemo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

	public NewsResponse getNews() {
		String url = "https://newsapi.org/v2/everything?q=bitcoin&sortBy=publishedAt&apiKey=3ff75cfeb7aa47f598796bf6484d5f9b";
		RestTemplate restTemplate = new RestTemplate();
		NewsResponse response = restTemplate.getForObject(url, NewsResponse.class);
		return response;
	}
	
}
