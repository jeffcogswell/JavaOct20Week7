package co.grandcircus.spacexdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpacexdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpacexdemoApplication.class, args);
		System.out.println("SpaceX app PORT 8095");
	}

}
