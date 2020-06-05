package com.spinshock.readerforreddit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ReaderForRedditApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReaderForRedditApplication.class, args);
	}

	@Value("${spring.application.name}")
	private String name;

	@Value("${server.port}")
	private Number port;

	@RequestMapping(value = "/")
	public String name() {
		return name + port;
	}
}
