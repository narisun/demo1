package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Demo1Application {

        @Override
        public void run(String... args) throws Exception {
		
                int i=0;
                for(;;)
		{
                        System.out.println("Application running ... count - "+(i++));
                        Thread.sleep(1000);
                }
        }

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}
