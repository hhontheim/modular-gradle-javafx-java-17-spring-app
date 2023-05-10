package com.example.demo.application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.example.greeting.Greeter;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {
    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();

        String greeting = new Greeter().composeGreeting("User");
        stage.setTitle(greeting);

        stage.setScene(new Scene(new Pane(), 800, 600));

        stage.show();
    }
}
