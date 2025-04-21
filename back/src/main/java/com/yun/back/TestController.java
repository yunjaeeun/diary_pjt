package com.yun.back;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/health-check")
    public String healthCheck() {
        return "OK";
    }
}
