package co.grandcircus.spacexdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@Autowired
	SpacexService spacex;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("launches", spacex.getLaunches());
		return "index";
	}
	
	@GetMapping("/latest")
	public String latest(Model model) {
		Launch launch = spacex.getLatestLaunch();
		System.out.println(launch.getDetails());
		model.addAttribute("launch", launch);
		return "latest";
	}
	
	@GetMapping("/launch/{id}")
	public String launch(@PathVariable String id, Model model) {
		Launch launch = spacex.getLaunch(id);
		model.addAttribute("launch", launch);
		return "launch";
	}
	
	@GetMapping("/rocket/{id}")
	public String rocket(@PathVariable String id, Model model) {
		Rocket rocket = spacex.getRocket(id);
		model.addAttribute("rocket", rocket);
		return "rocket";
	}
	
	@PostMapping("/byyear")
	public String byyear(String launch_year, Model model) {
		System.out.println("SEARCH BY YEAR");
		System.out.println(launch_year);
		List<Launch> launches = spacex.searchByYear(launch_year);
		model.addAttribute("year", launch_year);
		model.addAttribute("launches", launches);
		return "byyear";
	}
	
}








