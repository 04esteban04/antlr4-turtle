package com.tec.turtle.ui;

import com.tec.antlrturtle.LogoLexer;
import com.tec.antlrturtle.LogoParser;
import com.tec.turtle.ErrorListener;
import com.tec.turtle.LogoListener;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class TurtleFXUIController {

    @FXML
    private TextArea codeEditor;

    @FXML
    private Slider animationSpeed;

    @FXML
    private Group logoCanvas;

    private TurtleFXCanvasPainter painter;

    private Executor backgroundThread = Executors.newSingleThreadExecutor();

    public void initialize() {
        backgroundThread.execute(() -> {
            try (final BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/Prueba-H.logo")))) {
                final String demoProg = reader.lines().collect(Collectors.joining("\n"));
                JavaFXThreadHelper.runOrDefer(() -> this.codeEditor.setText(demoProg));
            } catch (final IOException e) {
                JavaFXThreadHelper.runOrDefer(() -> this.codeEditor.setText("ERROR"));
            }

        });

        this.painter = new TurtleFXCanvasPainter(this.logoCanvas);

        this.painter.setAnimationDurationMs(this.animationSpeed.valueProperty().longValue());
        this.animationSpeed.valueProperty().addListener((observable, oldValue, newValue) -> this.painter.setAnimationDurationMs(newValue.longValue()));
    }

    @FXML
    public void ejecutarPrograma(ActionEvent event) {
        try {
            this.painter.cls();
            this.backgroundThread.execute(() -> {
                final LogoLexer lexer = new LogoLexer(CharStreams.fromString(this.codeEditor.getText()));
                final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
                final LogoParser parser = new LogoParser(tokenStream);

                final ParseTree tree = parser.prog();

                final ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
                final LogoListener logoListener = new LogoListener(this.painter);
                parseTreeWalker.walk(logoListener, tree);
            });
        } catch (Exception e){
            error(e);
        }
    }

    @FXML
    public void compilarPrograma(ActionEvent event) {
        try {

            LogoLexer lexer = new LogoLexer(CharStreams.fromString(this.codeEditor.getText()));
            lexer.removeErrorListeners();
            lexer.addErrorListener(ErrorListener.INSTANCE);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            LogoParser parser = new LogoParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ErrorListener.INSTANCE);

            ParserRuleContext tree = parser.prog();

            exito();

        } catch (Exception e){
            error(e);
        }
    }

    /**
     * Metodo que muestra la ventana de error en caso de alguna excepcion generada por el programa
     */
    public static void error(Exception e){
        Stage stage = new Stage();
        VBox vBox = new VBox();
        Rectangle rect = new Rectangle(500, 280);
        TextArea textoError = new TextArea();
        Label labelInformacion = new Label("Se detectó un error en el programa:");
        labelInformacion.setFont(new Font("Sylfaen", 18));

        Button botonAceptar = new Button("Aceptar");
        botonAceptar.setFont(new Font("Sylfaen", 14));
        botonAceptar.setOnAction(actionEvent -> {
            stage.close();
        });

        rect.setArcHeight(60.0);
        rect.setArcWidth(60.0);

        textoError.setText("Excepción encontrada en: \n\n" + e.getMessage());
        textoError.setPrefSize(420,150);
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
    }

    /**
     * Metodo que muestra la ventana de exito en caso de que el programa se ejecute correctamente
     */
    public void exito() {
        Stage stage = new Stage();
        VBox vBox = new VBox();
        Rectangle rect = new Rectangle(300, 120);
        Label labelInformacion = new Label("El programa se compiló correctamente!");
        labelInformacion.setFont(new Font("Sylfaen", 16));

        Button botonAceptar = new Button("Aceptar");
        botonAceptar.setFont(new Font("Sylfaen", 14));
        botonAceptar.setOnAction(actionEvent -> {
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
    }
    
    @FXML
    public void onOpen() {
        final FileChooser logoFileChooser = new FileChooser();
        logoFileChooser.setTitle("Select Logo File");
        logoFileChooser.getExtensionFilters().add(new ExtensionFilter("Logo Files", "*.logo"));
        final File logoFile = logoFileChooser.showOpenDialog(null);
        if (Objects.nonNull(logoFile)) {
            try (final BufferedReader fileReader = new BufferedReader(new FileReader(logoFile))) {
                final String logoProgram = fileReader.lines().collect(Collectors.joining("\n"));
                JavaFXThreadHelper.runOrDefer(() -> this.codeEditor.setText(logoProgram));
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
    }
}
