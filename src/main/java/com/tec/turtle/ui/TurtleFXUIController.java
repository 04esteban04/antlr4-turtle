package com.tec.turtle.ui;

import com.tec.antlrturtle.LogoLexer;
import com.tec.antlrturtle.LogoParser;
import com.tec.turtle.ErrorListener;
import com.tec.turtle.LogoListener;
import com.tec.turtle.LogoVisitor;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * Clase que se encarga del controller de la interfaz grafica
 */
public class TurtleFXUIController {

    /**
     * Boton que se encarga de la accion de ejecutar el programa
     */
    public Button botonEjecutar;
    /**
     * Boton que se encarga de la accion de compilar el programa
     */
    public Button botonCompilar;
    /**
     * Boton que se encarga de mostrar el AST del programa
     */
    public Button botonAST;
    /**
     * Panel principal de la interfaz grafica
     */
    public BorderPane borderPane;

    /**
     * Animacion del boton ejecutar
     */
    FadeTransition fadeTransitionEjecutar;
    /**
     * Animacion del boton compilar
     */
    
    FadeTransition fadeTransitionCompilar;
    /**
     * Animacion del boton AST
     */
    FadeTransition fadeTransitionAST;

    /**
     * Variable que contiene el editor de texto de la ventana principal
     */
    @FXML
    private TextArea editorDeTexto;

    /**
     * Variable que almacena la velocidad de la animacion de dibujo mediante un slider
     */
    @FXML
    private Slider velocidadDeAnimacion;

    /**
     * Variable para el canvas de dibujo
     */
    @FXML
    private Group logoCanvas;

    /**
     * Variable que almacena el painter (se encarga de dibujar en el canvas)
     */
    private TurtleFXCanvasPainter painter;

    /**
     * Variable utilizada para manejar threads en segundo plano
     */
    private final Executor backgroundThread = Executors.newSingleThreadExecutor();

    /**
     * Variable utilizada para validacion en ventana de error
     */
    public static boolean boolError = false;
    /**
     * Variable utilizada para validacion en ventana de exito
     */
    public static boolean boolExito = false;

    /**
     * Metodo que se encarga de inicializar el programa
     */
    public void initialize() {
        /*
        backgroundThread.execute(() -> {
            try (final BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/Prueba-H.logo")))) {
                final String demoProg = reader.lines().collect(Collectors.joining("\n"));
                JavaFXThreadHelper.runOrDefer(() -> this.editorDeTexto.setText(demoProg));
            } catch (final IOException e) {
                JavaFXThreadHelper.runOrDefer(() -> this.editorDeTexto.setText("ERROR"));
            }

        });
         */

        this.painter = new TurtleFXCanvasPainter(this.logoCanvas);

        this.painter.setDuracionAnimacion(this.velocidadDeAnimacion.valueProperty().longValue());
        this.velocidadDeAnimacion.valueProperty().addListener((observable, oldValue, newValue) -> this.painter.setDuracionAnimacion(newValue.longValue()));

        fadeTransitionEjecutar = new FadeTransition(Duration.seconds(0.9), botonEjecutar);
        fadeTransitionEjecutar.setFromValue(1.0);
        fadeTransitionEjecutar.setToValue(0.1);
        fadeTransitionEjecutar.setAutoReverse(true);
        fadeTransitionEjecutar.setCycleCount(Animation.INDEFINITE);

        fadeTransitionCompilar = new FadeTransition(Duration.seconds(0.9), botonCompilar);
        fadeTransitionCompilar.setFromValue(1.0);
        fadeTransitionCompilar.setToValue(0.1);
        fadeTransitionCompilar.setAutoReverse(true);
        fadeTransitionCompilar.setCycleCount(Animation.INDEFINITE);

        fadeTransitionAST = new FadeTransition(Duration.seconds(0.9), botonAST);
        fadeTransitionAST.setFromValue(1.0);
        fadeTransitionAST.setToValue(0.1);
        fadeTransitionAST.setAutoReverse(true);
        fadeTransitionAST.setCycleCount(Animation.INDEFINITE);

        botonEjecutar.setOnMouseEntered(mouseEvent -> {
            fadeTransitionEjecutar.pause();
            botonEjecutar.setOpacity(1.0);

        });

        botonEjecutar.setOnMouseExited(mouseEvent -> fadeTransitionEjecutar.play());

        botonCompilar.setOnMouseEntered(mouseEvent -> {
            fadeTransitionCompilar.pause();
            botonCompilar.setOpacity(1.0);

        });

        botonCompilar.setOnMouseExited(mouseEvent -> fadeTransitionCompilar.play());

        botonAST.setOnMouseEntered(mouseEvent -> {
            fadeTransitionAST.pause();
            botonAST.setOpacity(1.0);

        });

        botonAST.setOnMouseExited(mouseEvent -> fadeTransitionAST.play());

        borderPane.setOnMouseEntered(mouseEvent -> {
            fadeTransitionEjecutar.play();
            fadeTransitionCompilar.play();
            fadeTransitionAST.play();
        });

        borderPane.setOnMouseExited(mouseEvent -> {
            fadeTransitionEjecutar.play();
            fadeTransitionCompilar.play();
            fadeTransitionAST.play();
        });
    }

    /**
     * Metodo que se encarga de la accion de ejecutar un programa Logo
     */
    @FXML
    public void ejecutarPrograma() {
        this.painter.cls();
        this.backgroundThread.execute(() -> {
            try {
                LogoLexer lexer = new LogoLexer(CharStreams.fromString(this.editorDeTexto.getText()));
                lexer.removeErrorListeners();
                lexer.addErrorListener(ErrorListener.errorListener);

                CommonTokenStream tokens = new CommonTokenStream(lexer);

                LogoParser parser = new LogoParser(tokens);
                parser.removeErrorListeners();
                parser.addErrorListener(ErrorListener.errorListener);

                ParseTree tree = parser.prog();

                //Visitor
                LogoVisitor eval = new LogoVisitor(this.painter);
                eval.visit(tree);

                //Listener
                ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
                LogoListener logoListener = new LogoListener(this.painter);

                parseTreeWalker.walk(logoListener, tree);



            } catch (Exception exception){
                if (!boolError) {
                    error(exception.getMessage(), "excepcion");
                }
            }
        });
    }

    /**
     * Metodo que se encarga de la accion de compilar un programa Logo
     */
    @FXML
    public void compilarPrograma() {
        try {
            LogoLexer lexer = new LogoLexer(CharStreams.fromString(this.editorDeTexto.getText()));
            lexer.removeErrorListeners();
            lexer.addErrorListener(ErrorListener.errorListener);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            LogoParser parser = new LogoParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ErrorListener.errorListener);

            ParseTree tree = parser.prog();

        } catch (Exception e) {
            boolExito = true;
            if (!boolError) {
                error(e.getMessage(), "excepcion");
            }
        } finally {
            if(!boolExito && !boolError) {
                exito();
            }
        }
    }

    /**
     * Metodo que se encarga de la accion de visualizar el AST de un programa Logo
     */
    @FXML
    public void verAST(){
        try {
            LogoLexer lexer = new LogoLexer(CharStreams.fromString(this.editorDeTexto.getText()));
            lexer.removeErrorListeners();
            lexer.addErrorListener(ErrorListener.errorListener);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            LogoParser parser = new LogoParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ErrorListener.errorListener);

            ParseTree tree = parser.prog();

            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
            viewer.open();

        } catch (Exception e) {
            boolExito = true;
            if (!boolError) {
                error(e.getMessage(), "excepcion");
            }
        }
    }

    /**
     * Metodo que muestra la ventana de error en caso de alguna excepcion generada por el programa
     */
    public static void error(String excepcion, String error){ 
        boolError = true;
        if(error.equals("excepcion")) {
            Platform.runLater(() -> {
                Stage stage = new Stage();
                VBox vBox = new VBox();
                Rectangle rect = new Rectangle(500, 280);
                TextArea textoError = new TextArea();
                Label labelInformacion = new Label("Se detectó un error en el programa:");
                labelInformacion.setFont(new Font("Sylfaen", 18));

                Button botonAceptar = new Button("Aceptar");
                botonAceptar.setFont(new Font("Sylfaen", 14));
                botonAceptar.setOnAction(actionEvent -> {
                    boolError = false;
                    stage.close();
                });

                rect.setArcHeight(60.0);
                rect.setArcWidth(60.0);

                textoError.setText("Excepción encontrada en: \n\n" + excepcion);
                textoError.setPrefSize(420, 150);
                textoError.setMaxWidth(420);
                textoError.setMaxHeight(150);
                textoError.setEditable(false);
                textoError.setStyle("-fx-control-inner-background:#000000;" +
                        " -fx-font-family: Consolas;" +
                        " -fx-highlight-fill: #ff0000; " +
                        "-fx-highlight-text-fill: #000000; " +
                        "-fx-text-fill: #ff0000; " +
                        "-fx-font-size: 12pt ;");

                vBox.getChildren().addAll(labelInformacion, textoError, botonAceptar);
                vBox.setSpacing(20);
                vBox.setAlignment(Pos.CENTER);
                vBox.setClip(rect);
                vBox.setBackground(new Background(new BackgroundFill(Color.rgb(240, 150, 100), CornerRadii.EMPTY, Insets.EMPTY)));

                Scene scene = new Scene(vBox);
                scene.setFill(Color.TRANSPARENT);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.TRANSPARENT);
                stage.setScene(scene);
                stage.setX(500);
                stage.setY(250);
                stage.setWidth(500);
                stage.setHeight(280);
                stage.setResizable(false);

                // Transicion
                FadeTransition fadeInTransition = new FadeTransition(Duration.millis(250), rect);
                fadeInTransition.setFromValue(0.0);
                fadeInTransition.setToValue(1.0);
                fadeInTransition.setCycleCount(5);
                fadeInTransition.setAutoReverse(true);
                fadeInTransition.play();

                stage.showAndWait();
            });
        } else if (error.equals("abrirArchivo")){
            Platform.runLater(() -> {
                Stage stage = new Stage();
                VBox vBox = new VBox();
                Rectangle rect = new Rectangle(500, 280);
                TextArea textoError = new TextArea();
                Label labelInformacion = new Label("Se detectó un error en el programa:");
                labelInformacion.setFont(new Font("Sylfaen", 18));

                Button botonAceptar = new Button("Aceptar");
                botonAceptar.setFont(new Font("Sylfaen", 14));
                botonAceptar.setOnAction(actionEvent -> {
                    boolError = false;
                    stage.close();
                });

                rect.setArcHeight(60.0);
                rect.setArcWidth(60.0);

                textoError.setText("Error al abrir el archivo: \n\n" + excepcion);
                textoError.setPrefSize(420, 150);
                textoError.setMaxWidth(420);
                textoError.setMaxHeight(150);
                textoError.setEditable(false);
                textoError.setStyle("-fx-control-inner-background:#000000;" +
                        " -fx-font-family: Consolas;" +
                        " -fx-highlight-fill: #ff0000; " +
                        "-fx-highlight-text-fill: #000000; " +
                        "-fx-text-fill: #ff0000; " +
                        "-fx-font-size: 12pt ;");

                vBox.getChildren().addAll(labelInformacion, textoError, botonAceptar);
                vBox.setSpacing(20);
                vBox.setAlignment(Pos.CENTER);
                vBox.setClip(rect);
                vBox.setBackground(new Background(new BackgroundFill(Color.rgb(240, 150, 100), CornerRadii.EMPTY, Insets.EMPTY)));

                Scene scene = new Scene(vBox);
                scene.setFill(Color.TRANSPARENT);
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.initStyle(StageStyle.TRANSPARENT);
                stage.setScene(scene);
                stage.setX(500);
                stage.setY(250);
                stage.setWidth(500);
                stage.setHeight(280);
                stage.setResizable(false);

                // Transicion
                FadeTransition fadeInTransition = new FadeTransition(Duration.millis(250), rect);
                fadeInTransition.setFromValue(0.0);
                fadeInTransition.setToValue(1.0);
                fadeInTransition.setCycleCount(5);
                fadeInTransition.setAutoReverse(true);
                fadeInTransition.play();

                stage.showAndWait();
            });
        }
    }

    /**
     * Metodo que muestra la ventana de exito en caso de que el programa se ejecute correctamente
     */
    public void exito() {
        boolExito = true;
        Platform.runLater(() -> {
            Stage stage = new Stage();
            VBox vBox = new VBox();
            Rectangle rect = new Rectangle(300, 120);
            Label labelInformacion = new Label("El programa se compiló correctamente!");
            labelInformacion.setFont(new Font("Sylfaen", 16));

            Button botonAceptar = new Button("Aceptar");
            botonAceptar.setFont(new Font("Sylfaen", 14));
            botonAceptar.setOnAction(actionEvent -> {
                boolExito = false;
                stage.close();
            });

            rect.setArcHeight(60.0);
            rect.setArcWidth(60.0);

            vBox.getChildren().addAll(labelInformacion, botonAceptar);
            vBox.setSpacing(20);
            vBox.setAlignment(Pos.CENTER);
            vBox.setClip(rect);
            vBox.setBackground(new Background(new BackgroundFill(Color.rgb(240, 150, 100), CornerRadii.EMPTY, Insets.EMPTY)));

            Scene scene = new Scene(vBox);
            scene.setFill(Color.TRANSPARENT);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);
            stage.setX(500);
            stage.setY(350);
            stage.setWidth(300);
            stage.setHeight(120);
            stage.setResizable(false);

            // Transicion
            FadeTransition fadeInTransition = new FadeTransition(Duration.millis(250), rect);
            fadeInTransition.setFromValue(0.0);
            fadeInTransition.setToValue(1.0);
            fadeInTransition.setCycleCount(5);
            fadeInTransition.setAutoReverse(true);
            fadeInTransition.play();

            stage.showAndWait();
        });
    }

    /**
     * Metodo que se encarga de abrir un archivo en el editor de texto
     */
    @FXML
    public void abrirArchivo() {
        final FileChooser selectorDeArchivo = new FileChooser();
        selectorDeArchivo.setTitle("Seleccione un archivo Logo");
        selectorDeArchivo.getExtensionFilters().add(new ExtensionFilter("Archivos Logo", "*.logo"));

        final File archivoLogo = selectorDeArchivo.showOpenDialog(null);

        if (Objects.nonNull(archivoLogo)) {
            try (final BufferedReader fileReader = new BufferedReader(new FileReader(archivoLogo))) {
                final String programaLogo = fileReader.lines().collect(Collectors.joining("\n"));
                JavaFXThreadHelper.runOrDefer(() -> this.editorDeTexto.setText(programaLogo));
            } catch (final IOException e) {
                error(e.getMessage(),"abrirArchivo");
            }
        }
    }

    /**
     * Metodo que se encarga de cerrar la ventana principal
     */
    @FXML
    public void cerrar(){
        System.exit(0);
    }

}
