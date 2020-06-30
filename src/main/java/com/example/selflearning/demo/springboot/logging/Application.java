package com.example.selflearning.demo.springboot.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application extends SpringBootServletInitializer {


		Logger logger = LoggerFactory.getLogger(Application.class);

		@GetMapping("/")
		public String index() {
			logger.trace("A TRACE Message");
			logger.debug("A DEBUG Message");
			logger.info("An INFO Message");
			logger.warn("A WARN Message");
			logger.error("An ERROR Message");

			return "Howdy! Check out the Logs to see the output...";
		}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

}
