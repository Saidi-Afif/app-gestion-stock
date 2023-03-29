package com.sip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class CampSpringApplication {


	
	public static void main(String[] args) throws IOException{
		SpringApplication.run(CampSpringApplication.class, args);
		//new File(ArticleController.uploadDirectory).mkdir();


		//System.out.println("Couche Data");
		//Provider p1 = new Provider();
	   // Provider p2 = new Provider();
		
		 	
	}

}
