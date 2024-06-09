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

        // Crear los controles
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();

        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();

        Button confirmButton = new Button("Aceptar");

        // Crear un HBox para alinear el botón
        HBox buttonBox = new HBox(confirmButton);
        buttonBox.setAlignment(Pos.CENTER); // Inicialmente centrado

       

        // Etiquetas para mostrar las selecciones
        Label selectedDateLabel = new Label("Fecha seleccionada: ");
        Label selectedColorLabel = new Label("Color seleccionado: ");

        // Acción del botón de confirmación
        confirmButton.setOnAction(event -> {
            // Obtener la fecha y el color seleccionados
            String selectedDate = datePicker.getValue() != null ? datePicker.getValue().toString() : "No seleccionada";
            Color selectedColor = colorPicker.getValue();

            // Mostrar la fecha y el color en las etiquetas
            
            selectedDateLabel.setText("Fecha seleccionada:\n " + selectedDate);
            selectedColorLabel.setText("Color seleccionado:\n " + selectedColor.toString());
        });

        // Crear el layout y añadir los controles
        VBox vbox = new VBox(10, dateLabel, datePicker, colorLabel, colorPicker, buttonBox, selectedDateLabel, selectedColorLabel);
        vbox.setSpacing(10);

        // Crear la escena y mostrarla
        Scene scene = new Scene(vbox, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DatePicker y ColorPicker");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}