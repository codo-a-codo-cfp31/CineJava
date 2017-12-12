/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinetest;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.stage.Stage;



/**
 *
 * @author alumno
 */
public class CineTest extends Application {
    
         @Override
        public void start(Stage primaryStage) {
        Controller myController = new Controller(primaryStage); 
    }
        
        //final BooleanProperty loginAttempted = new SimpleBooleanProperty(false);
            
        
        /*
        //TEST
        myWebEngine.documentProperty().addListener(new ChangeListener<Document>(){
        @Override
        public void changed(ObservableValue<? extends Document> ov, Document oldDoc, Document doc) {
        if (doc != null && !loginAttempted.get()) {
            if (doc.getElementsByTagName("form").getLength() > 0) {
                HTMLFormElement form = (HTMLFormElement) doc.getElementsByTagName("form").item(0);
                System.out.println(form.getAttribute("action"));
                if ("/Web/index.html".equals(form.getAttribute("action"))) {
                    HTMLInputElement username = null;
                    HTMLInputElement password = null;
                    NodeList nodes = form.getElementsByTagName("input");
                    //TODO: inyectar elementos de una lista a la lista de nodos
                    NodeTest();
                    for (int i = 0; i < nodes.getLength(); i++) {
                        HTMLInputElement input = (HTMLInputElement) nodes.item(i);
                        switch (input.getName()) {
                            case "user_name":
                                username = input;
                                break;
                            case "password":
                                password = input;
                                break;
                        }
                    }
                    
                    
                    if (username != null && password != null && username.getValue()!= null && password.getValue()!=null) {
                        loginAttempted.set(true);
                        form.submit();
                        System.out.println("user name: " + username.getValue());
                        System.out.println("passwod: " + password.getValue());
                        
                    }
                }
            }
        }}});    
        
        
        
        */       

    /**
     * @param args the command line arguments
     */
    public void NodeTest(){
    
    }

    public static void main(String[] args) {
        launch(args);        
    }
}
