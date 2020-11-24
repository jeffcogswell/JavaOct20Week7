package co.grandcircus.spacexdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpacexService {

	private RestTemplate restTemplate = new RestTemplate();
	
	public Launch getLatestLaunch() {
		String url = "https://api.spacexdata.com/v4/launches/latest";
		return restTemplate.getForObject(url, Launch.class);
	}

	/*
	public Launch[] getLaunches() {
		String url = "https://api.spacexdata.com/v4/launches/";
		return restTemplate.getForObject(url, Launch[].class);
	}
	*/
	public List<Launch> getLaunches() {
		String url = "https://api.spacexdata.com/v4/launches/";
		return  Arrays.asList(  restTemplate.getForObject(url, Launch[].class)   )  ;
	}
	
	public Launch getLaunch(String id) {
		String url = "https://api.spacexdata.com/v4/launches/" + id;
		return restTemplate.getForObject(url, Launch.class);
	}
	
	public Rocket getRocket(String id) {
		String url = "https://api.spacexdata.com/v4/rockets/" + id;
		return restTemplate.getForObject(url, Rocket.class);		
	}
	
	/*
	public Launch[] searchByYear(String year) {
		String url = "https://api.spacexdata.com/v4/launches?launch_year=" + year;
		return restTemplate.getForObject(url, Launch[].class);		
	}
	*/
	public List<Launch> searchByYear(String year) {
		String url = "https://api.spacexdata.com/v4/launches?launch_year=" + year;
		return Arrays.asList(  restTemplate.getForObject(url, Launch[].class) );		
	}
	
	
}
