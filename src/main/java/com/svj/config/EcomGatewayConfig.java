package com.svj.config;

import com.svj.filter.AuthenticationFilter;
import jakarta.validation.constraints.AssertFalse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EcomGatewayConfig {
//    @Autowired
//    private AuthenticationFilter authenticationFilter;

//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route("oder-service", r->r.path("/orders/**")
////                        .filters(f->f.filter(authenticationFilter.apply(new Object())))
//                        .and()
//                        .uri("lb://ORDER-SERVICE"))
//                .route("payment-service", r->r.path("/payments/**")
//                        .and()
//                        .uri("lb://PAYMENT-SERVICE"))
//                .route("user-service", r->r.path("/users/**")
//                        .and()
//                        .uri("lb://USER-SERVICE"))
//                .route("identity-service", r->r.path("/auth/**")
//                        .and()
//                        .uri("lb://IDENTITY-SERVICE"))
//
//                .build();
//    }
}
