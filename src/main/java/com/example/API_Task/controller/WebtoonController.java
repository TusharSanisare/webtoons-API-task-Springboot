// package com.example.API_Task.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import com.example.API_Task.entity.Webtoon;
// import com.example.API_Task.service.WebtoonService;

// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/api/webtoons")
// public class WebtoonController {

//   @Autowired
//   private WebtoonService webtoonService;

//   @GetMapping
//   public List<Webtoon> getAllWebtoons() {
//     return webtoonService.getAllWebtoons();
//   }

//   @GetMapping("/{id}")
//   public ResponseEntity<Webtoon> getWebtoonById(@PathVariable Long id) {
//     Optional<Webtoon> webtoon = webtoonService.getWebtoonById(id);
//     return webtoon.map(ResponseEntity::ok)
//         .orElse(ResponseEntity.notFound().build());
//   }

//   @PostMapping
//   public Webtoon addWebtoon(@RequestBody Webtoon webtoon) {
//     return webtoonService.addWebtoon(webtoon);
//   }

//   @DeleteMapping("/{id}")
//   public Long deleteWebtoon(@PathVariable Long id) {
//     return webtoonService.deleteWebtoon(id);
//   }
// }
// ----------------------------------
package com.example.API_Task.controller;

import com.example.API_Task.entity.Webtoon;
import com.example.API_Task.service.WebtoonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/webtoons")
public class WebtoonController {

  @Autowired
  private WebtoonService webtoonService;

  @PostMapping
  public Webtoon addWebtoon(@Valid @RequestBody Webtoon webtoon) {
    return webtoonService.addWebtoon(webtoon);
  }

  @GetMapping
  public List<Webtoon> getAllWebtoons() {
    return webtoonService.getAllWebtoons();
  }

  @DeleteMapping("/{id}")
  public void deleteWebtoon(@PathVariable Long id) {
    webtoonService.deleteWebtoon(id);
  }
}
