package com.jinternals.demo.service.impl;

import com.jinternals.demo.service.DemoService;
import com.jinternals.toggle.annotation.Toggle;
import org.springframework.stereotype.Service;

import static com.cloud.example.toggle.Toggles.DEMO_ADVANCED;

@Service
@Toggle(name = DEMO_ADVANCED,expectedToBeOn = true)
public class AdvancedDemoService implements DemoService {

    public String doDemo() {
        return "Advance Demo";
    }

}