package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by WorkDay on 8/11/16.<br>
 * <br>
 * HelloWorld is a javaFX app that needs parameters that are real objects
 */

class AppParameterLauncher {
    public static void main(String[] args) {
        Main.launch(new ObjectThatContainsData("brave"), new ObjectThatContainsData("new"));
    }
}


public class Main extends Application {

    private static ObjectThatContainsData staticData1 = null;
    private static ObjectThatContainsData staticData2 = null;


    public static void launch(ObjectThatContainsData data1, ObjectThatContainsData data2) {
        Main.staticData1 = data1;
        Main.staticData2 = data2;
        Application.launch(Main.class);
    }

    private final ObjectThatContainsData data1 = Main.staticData1;
    private final ObjectThatContainsData data2 = Main.staticData2;

    @Override
    public void start(Stage primaryStage) {

        String Text = "Hello "+data1+" "+data2+" World!";
        primaryStage.setTitle(Text);
        Button btn = new Button();
        btn.setText("Say '"+Text+"'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setX(0);
        primaryStage.setY(0);
        primaryStage.show();
    }
}

class ObjectThatContainsData {
    public final String data;

    ObjectThatContainsData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }
}