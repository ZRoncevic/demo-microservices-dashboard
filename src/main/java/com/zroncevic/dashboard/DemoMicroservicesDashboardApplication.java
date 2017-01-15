package com.zroncevic.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import be.ordina.msdashboard.EnableMicroservicesDashboardServer;

@EnableDiscoveryClient
@EnableMicroservicesDashboardServer
@SpringBootApplication
public class DemoMicroservicesDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroservicesDashboardApplication.class, args);
	}
}
