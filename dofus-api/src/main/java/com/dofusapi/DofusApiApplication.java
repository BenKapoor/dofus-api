package com.dofusapi;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DofusApiApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DofusApiApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.servlet.context-path", "/dofus-api"));
        app.run(args);
	}

}
