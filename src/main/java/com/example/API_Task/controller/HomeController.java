package com.example.API_Task.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
  @GetMapping("/")
  public String Home(HttpServletRequest req) {
    return "Home Page is this " + req.getSession().getId();
  }

  @GetMapping("/csrf-token")
  public CsrfToken get_csrf_token(HttpServletRequest req) {
    return (CsrfToken) req.getAttribute("_csrf");
  }
}
