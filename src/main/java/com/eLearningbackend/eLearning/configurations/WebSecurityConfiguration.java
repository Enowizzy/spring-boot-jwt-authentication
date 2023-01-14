package com.eLearningbackend.eLearning.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration
        extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration {

            @Autowired
            private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

            @Autowired
            private JwtRequestFilter jwtRequestFilter;

            // @Bean
            // @Override
            // public AuthenticationManager authenticationManagerBean() throws Exception {
            //     return super.authenticationManagerBean();
            // }

            protected void configure(HttpSecurity httpSecurity) throws Exception{
            
            }

            @Bean
            public PasswordEncoder passwordEncoder(){
                return new BCryptPasswordEncoder();
            }

            public void configureGblobal(){

            }
}
