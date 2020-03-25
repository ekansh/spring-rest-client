package com.example.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableFeignClients
@Controller
public class SpringRestClientApplication implements CommandLineRunner {
	@Autowired
	private GreetingClient greetingClient;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String greeting = greetingClient.greeting();
		System.out.println("response received :" +greeting);
		new Scanner(System.in).nextLine();
	}

}
