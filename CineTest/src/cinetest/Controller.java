/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinetest;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author alumno
 */
public class Controller implements IViewEventListener{
    protected MainView view;

    public Controller(Stage primaryStage) {
        view = new MainView();
        view.AddToList(this);
        Pane root = new Pane();
        root.getChildren().add(0, view.getMyBrowser());
        
        primaryStage.setTitle("Cine Java");
        
        Scene scene = new Scene(root,640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
       
    }
    
    
    @Override
    public void listen(Event event) {
        //Event ae = (Event)event.getTarget();
        String email = view.GetElementByID("user_name");
    }
    
}
