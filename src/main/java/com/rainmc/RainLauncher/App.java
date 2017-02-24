package com.rainmc.RainLauncher;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("[APP] Application startup...");
        System.out.println("[APP] Application started.");
    }
}
