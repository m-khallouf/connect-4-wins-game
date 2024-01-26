package com.example.connect4;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.event.MouseListener;

/*
 * The HelloApplication class extends javafx.application.Application, serving as the main entry point for the Connect 4 game.
 * The main method calls launch(), initiating the JavaFX application lifecycle.
 */
public class Main extends Application {
    public static void main(String[] args) {
         launch();
    }

    // The start method is called to initialize the JavaFX application
    @Override
    public void start(Stage stage) throws Exception {
        // Create a root group and a scene with a light blue background
        Group root = new Group();
        //scene is a drawing surface for graphical content and a container for various nodes
        //Scene scene = new Scene(root, Color.LIGHTSKYBLUE);

        // Set the application icon
        Image icon = new Image("File:///C:\\games\\connect4\\src\\main\\java\\com\\example\\connect4\\logo.jpg");
        stage.getIcons().add(icon);

        // Set the stage title
        stage.setTitle("Connect four game");

        // Set the stage dimensions and make it non-resizable
        stage.setResizable(false);

        //RightSideBox.setResizable(false);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("GameView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());


        Controller controller = fxmlLoader.getController();
        scene.addEventFilter(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                controller.updateColumnVisibilityOnMouseEnter(event);
            }
        });
        Circle currentCircle = new Circle();

        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int columnIndex = controller.updateColumnVisibilityOnMouseEnter(event);
                if (columnIndex != -1) {
                    controller.addCircle(columnIndex, currentCircle);
                }
            }
        });

        // Set the scene and display the stage
        stage.setScene(scene);
        stage.show();
    }
}