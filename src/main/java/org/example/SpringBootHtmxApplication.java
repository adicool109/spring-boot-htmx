package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootHtmxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHtmxApplication.class, args);
	}

}

/*@RestController
class DemoController {
	@GetMapping("/test")
	public String testUrl(){
		return "successfully loaded api";
	}
}*/
