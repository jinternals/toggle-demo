package com.jinternals.demo.controllers;

import com.cloud.example.toggle.Toggles;
import com.jinternals.demo.service.DemoService;
import com.jinternals.toggle.annotation.Toggle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/demo")
    public String demo() {

        return demoService.doDemo();

    }

    @GetMapping("/demo/toggle")
    @Toggle(name = Toggles.DEMO_TOGGLE)
    public String toggledApi() {

        return demoService.doDemo();

    }
}
