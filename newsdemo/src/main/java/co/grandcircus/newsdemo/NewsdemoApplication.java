package co.grandcircus.newsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsdemoApplication.class, args);
		System.out.println("NEWS DEMO Port 8091");
	}

}
