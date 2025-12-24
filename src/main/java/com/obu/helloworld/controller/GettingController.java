package com.obu.helloworld.controller;

import com.obu.helloworld.service.GettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/getting")
@RequiredArgsConstructor
public class GettingController {
    private final GettingService gettingService;
    @GetMapping
    public ResponseEntity<String> getting() {
        return ResponseEntity.ok(gettingService.getting());
    }
}
