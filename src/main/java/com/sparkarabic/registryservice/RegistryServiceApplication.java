package com.sparkarabic.registryservice;

import com.sparkarabic.registryservice.config.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableEurekaServer
@EnableFeignClients
//@EnableConfigurationProperties
public class RegistryServiceApplication implements CommandLineRunner {

	@Value("${server.port}")
	String serverPort;

	@Autowired
	Data data;

	public static void main(String[] args) {
		SpringApplication.run(RegistryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("config msg>>>>>>>>>>>:" + data.getMessage());
		System.out.println("config port >>>>>>>>>>>:" + data.getPort());
		System.out.println("server port >>>>>>>>>>>:" + serverPort);
	}
}
