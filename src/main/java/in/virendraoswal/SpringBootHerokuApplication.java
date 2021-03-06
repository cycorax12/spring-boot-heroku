package in.virendraoswal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHerokuApplication.class, args);
	}

}

@RestController
class RandomResource {

	@GetMapping(path = "/greet")
	public String greet() {
		return String.format("%s says Hello from %s!", "Spring Boot", "Heroku");
	}
}
