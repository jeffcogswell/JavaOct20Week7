package co.grandcircus.newsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FinalController {
	
	@Autowired
	private NewsService newsService;

	@GetMapping("/finalnews")
	public String finalnews(Model model) {
		
		NewsResponse response = newsService.getNews();
		model.addAttribute("articles", response.getArticles());
		return "webnews";
	}
	
}
