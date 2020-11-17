package com.example.ConsumeNYT_TopStories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeNytTopStoriesApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumeNytTopStoriesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumeNytTopStoriesApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			TopStories topStories = restTemplate.getForObject(
					"https://api.nytimes.com/svc/topstories/v2/home.json?api-key=GADsM9EQPG3gz0A36IGbPflnlreNUE7U", TopStories.class);
			log.info(topStories.toString());
		};
	}
}
