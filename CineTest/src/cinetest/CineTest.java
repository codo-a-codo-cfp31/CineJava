/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinetest;

import java.net.URL;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author alumno
 */
public class CineTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cine Java");
        
        WebView myBrowser = new WebView();
        WebEngine myWebEngine = myBrowser.getEngine();
        myWebEngine.setJavaScriptEnabled(true);
        URL url = this.getClass().getResource("/Web/index.html");   
        
        //Load Page Status
        myWebEngine.getLoadWorker().stateProperty().addListener(
                (ObservableValue<? extends State> ov, State oldState,
                State newState) ->{
                    if(newState == State.SUCCEEDED)
                    System.out.println("test");
                }
        );
        
        
        myWebEngine.load(url.toString());       
        
        //BOTON TEST
        //myButton = new Button("Alert Box");
        //myButton.setOnAction(e-> AlertBox.display("Title", "Ventana Test"));
        
        Pane root = new Pane();
        root.getChildren().add(0, myBrowser);
        //root.getChildren().add(1, myButton);
       
        Scene scene = new Scene(root,640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    Button myButton;
    public static void main(String[] args) {
        launch(args);        
    }
    
}
