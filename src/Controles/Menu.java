package Controles;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Menu extends Application {
    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Init");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Stop");
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("Start");
    
        Label dateLabel = new Label("Fecha:");
        DatePicker datePicker = new DatePicker();
        Label colorLabel = new Label("Seleccione el color:");
        ColorPicker colorPicker = new ColorPicker();
        Button confirmButton = new Button("Aceptar");
        HBox buttonBox = new HBox(confirmButton);
        buttonBox.setAlignment(Pos.CENTER); 
        confirmButton.setOnAction(event -> {
            
            String selectedDate = datePicker.getValue().toString();
            Color selectedColor = colorPicker.getValue();
            System.out.println("Fecha: " + selectedDate);
            System.out.println("Color: " + selectedColor);
        });
        VBox vbox = new VBox(10, dateLabel, datePicker, colorLabel, colorPicker, buttonBox);
        vbox.setSpacing(10);

        // Crear la escena y mostrarla
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DatePicker y ColorPicker");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}