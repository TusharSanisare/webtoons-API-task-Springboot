package com.example.API_Task.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Entity
@Data
public class Webtoon {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "Title is mandatory")
  private String title;

  @NotBlank(message = "Description is mandatory")
  private String description;

  @NotBlank(message = "Writer is mandatory")
  private String writer;

  @NotBlank(message = "Created Date is mandatory")
  private String created_date;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "webtoon_id")
  private List<Subtitle> subtitles;

  // Getters, setters, and constructors
}
