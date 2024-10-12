package com.example.API_Task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_Task.entity.Webtoon;
import com.example.API_Task.repository.WebtoonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WebtoonService {

  @Autowired
  private WebtoonRepository webtoonRepository;

  public List<Webtoon> getAllWebtoons() {
    return webtoonRepository.findAll();
  }

  public Optional<Webtoon> getWebtoonById(Long id) {
    return webtoonRepository.findById(id);
  }

  public Webtoon addWebtoon(Webtoon webtoon) {
    return webtoonRepository.save(webtoon);
  }

  public Long deleteWebtoon(Long id) {
    webtoonRepository.deleteById(id);
    return id;
  }
}
