
package com.example.API_Task.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.http.HttpMethod;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .csrf().disable() // Disable CSRF for simplicity
        .authorizeHttpRequests((authz) -> authz
            // Allow GET requests for everyone
            .requestMatchers(HttpMethod.GET, "/api/webtoons/**").permitAll()
            // Restrict POST, PUT, DELETE requests to ADMIN only
            .requestMatchers(HttpMethod.POST, "/api/webtoons/**").hasRole("ADMIN")
            .requestMatchers(HttpMethod.DELETE, "/api/webtoons/**").hasRole("ADMIN")
            .requestMatchers(HttpMethod.PUT, "/api/webtoons/**").hasRole("ADMIN")
            .anyRequest().authenticated() // Ensure all other requests are authenticated
        )
        .httpBasic(); // Enable basic authentication

    return http.build();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    UserDetails admin = User.withDefaultPasswordEncoder()
        .username("admin")
        .password("admin@123")
        .roles("ADMIN")
        .build();

    return new InMemoryUserDetailsManager(admin);
  }
}
