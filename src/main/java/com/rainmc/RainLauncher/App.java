package com.rainmc.RainLauncher;

import com.jfoenix.controls.JFXDecorator;
import com.jfoenix.svg.SVGGlyphLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        System.out.println(getClass().getResource("."));
        primaryStage.initStyle(StageStyle.UNDECORATED); // Remove window decoration
        BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("view/MainPane.fxml"));
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("css/style.css").toString());
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println("[APP] Application startup...");
    }
}
