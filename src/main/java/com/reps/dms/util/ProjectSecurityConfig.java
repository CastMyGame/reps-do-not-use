package com.dms.reps.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//public class ProjectSecurityConfig {
//
//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain( http) throws Exception {
//
//        /**
//         *  Below is the custom security configurations
//         */
//
//        http
//                .authorizeHttpRequests()
//                .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
//                .requestMatchers("/notices", "/contact").permitAll()
//                .and()
//                .formLogin()
//                .and()
//                .httpBasic();
//        return http.build();
//    };
//}