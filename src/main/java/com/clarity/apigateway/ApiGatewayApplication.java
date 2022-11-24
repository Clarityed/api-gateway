package com.clarity.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

/*    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // id 只要唯一就好了
                .route("path_route1", r -> r.path("/api/name/")
                        .uri("http://localhost:8082/api/name/"))
                .route("host_route2", r -> r.path("/get")
                        .uri("https://www.baidu.com"))
                .build();
    }*/

}
