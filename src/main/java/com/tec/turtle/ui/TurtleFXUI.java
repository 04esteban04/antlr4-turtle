package com.tec.turtle.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TurtleFXUI extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("Logo Turtle TEC");
        primaryStage.centerOnScreen();
        primaryStage.setOnCloseRequest(windowEvent -> System.exit(0));

        final FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/LogoTurtle.fxml"));
        final Parent parent = fxmlLoader.load();
        final Scene primaryScene = new Scene(parent, 1000, 620);
        primaryScene.getStylesheets().add("LogoTurtle.css");

        primaryStage.setScene(primaryScene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }
}
