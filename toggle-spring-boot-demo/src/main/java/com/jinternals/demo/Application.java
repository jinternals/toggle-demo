package com.jinternals.demo;

import com.jinternals.toggle.api.decider.ToggleDecider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.cloud.example.toggle.Toggles.DEMO_ADVANCED;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ToggleDecider toggleDecider;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void run(String... args) throws Exception {

        System.out.println("Toggle "+ DEMO_ADVANCED+" : ");
        System.out.print(toggleDecider.isToggleOn(DEMO_ADVANCED));

    }
}
