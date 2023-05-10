package com.example.demo;

import com.example.demo.application.HelloWorldApp;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Application.launch(HelloWorldApp.class, args);
    }

}
