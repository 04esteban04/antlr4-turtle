package com.tec.turtle.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Clase que se encarga de inicializar la interfaz grafica
 */
public class TurtleFXUI extends Application {

    /**
     * Metodo que establece las condiciones para iniciar la aplicacion
     * @param primaryStage Escenario principal de la aplicacion
     * @throws Exception Excepcion generada en caso de no poder iniciarse
     */
    @Override
    public void start(final Stage primaryStage) throws Exception {
        final FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/LogoTurtle.fxml"));

        final Parent parent = fxmlLoader.load();

        final Scene primaryScene = new Scene(parent, 1400, 720);
        primaryScene.getStylesheets().add("LogoTurtle.css");

        primaryStage.setTitle("Logo Turtle TEC");
        primaryStage.centerOnScreen();
        primaryStage.setOnCloseRequest(windowEvent -> System.exit(0));
        primaryStage.setScene(primaryScene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }
}
