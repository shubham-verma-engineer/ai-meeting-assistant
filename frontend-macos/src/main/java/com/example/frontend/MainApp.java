package com.example.frontend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) {
        Label lbl = new Label("AI Meeting Assistant - macOS");
        Button b = new Button("Fetch Meetings");
        ListView<String> list = new ListView<>();
        b.setOnAction(e -> list.getItems().add("Stub meeting - replace with REST call"));
        VBox root = new VBox(10, lbl, b, list);
        Scene s = new Scene(root, 400, 300);
        stage.setScene(s);
        stage.setTitle("AI Meeting Assistant");
        stage.show();
    }

    public static void main(String[] args){ launch(); }
}
