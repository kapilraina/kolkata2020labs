package com.ms.boot.InitialDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InitialDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialDemoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner inspect(ApplicationContext ctx)
	{
		return (r) -> {
			int beanCount = ctx.getBeanDefinitionCount();
			String[] beans = ctx.getBeanDefinitionNames();
			System.out.println("Bean Count = "+beanCount);
			for(int i =0;i<beanCount;i++)
			{
				System.out.println(beans[i]);
			}
		};
	}

}
