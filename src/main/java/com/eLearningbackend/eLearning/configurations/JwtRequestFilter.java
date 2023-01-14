package com.eLearningbackend.eLearning.configurations;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
     
       final String header = request.getHeader(ALREADY_FILTERED_SUFFIX);
       String jwtToken = null;
       if (header != null && header.startsWith("Bearer ")) {
        jwtToken = header.substring(7);
        try {
            
        } catch (IllegalArgumentException e) {
            System.out.println("Unable to get JWT token");
        } catch (ExpiredJwtException e) {
            System.out.println("Token expired");

        }
       }
    }

}