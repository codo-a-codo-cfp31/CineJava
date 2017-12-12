/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejavaapp.controller;
import cinejavaapp.view.*;
import cinetest.IViewEventListener;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author alumno
 */
public class controller implements IController, IViewEventListener {

    private vista vista;

    controller(Stage primaryStage) {
        vista = new vista(this.getClass().getResource("/Web/LogIn.html"));
        
        vista.AddToList((IViewEventListener) this);
        Pane root = new Pane();
        root.getChildren().add(0, vista.getMyBrowser());
        
        primaryStage.setTitle("Cine Java");
        
        Scene scene = new Scene(root,640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
       
    }
    
    
    @Override
    public void listen(Event event) {
        //Event ae = (Event)event.getTarget();
        String email = vista.GetElementByID("user_name");
    }
    

    @Override
    public void show() {
        System.out.println("muestra " + this);
    }

    @Override
    public void hide() {
        System.out.println("esconde " + this);
    }

}
