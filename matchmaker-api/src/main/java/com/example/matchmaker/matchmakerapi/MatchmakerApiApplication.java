package com.example.matchmaker.matchmakerapi;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class MatchmakerApiApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(MatchmakerApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
