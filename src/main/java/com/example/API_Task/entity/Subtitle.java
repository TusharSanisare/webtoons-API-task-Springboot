package com.example.API_Task.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Subtitle {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Subtitle is mandatory")
  private String subtitle;

  private String image;

  @NotBlank(message = "Description is mandatory")
  private String description;

  // Getters, setters, and constructors
}
