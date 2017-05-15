package com.lailaidoutu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class LaiLaiDouTuApplication implements CommandLineRunner{

	private final static Logger logger = LoggerFactory.getLogger(LaiLaiDouTuApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(LaiLaiDouTuApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Date now = new Date();
		logger.info("application bootstrap at, {}", now);
	}
}
