package com.example.API_Task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.API_Task.entity.Webtoon;

@Repository
public interface WebtoonRepository extends JpaRepository<Webtoon, Long> {
}
