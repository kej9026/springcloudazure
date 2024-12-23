package com.example.spring_cloud_azure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudAzureApplication {
	@Value("${sampleProperty1}")
    private String sampleProperty1;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAzureApplication.class, args);
	}
    public void run(String[] args) {
        System.out.println("sampleProperty1: " + sampleProperty1);
    }
    
}
