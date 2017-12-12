/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejavaapp.controller;

import java.util.Stack;
import javafx.stage.Stage;

/**
 *
 * @author alumno
 */
public class MasterController {

    protected Stack<controller> stack;
    
    private static MasterController instance = null;
    
     public MasterController(Stage primaryStage) {
        stack = new Stack<>();
        controller controller = new controller(primaryStage);
        stack.add(controller);
    }
     
     public static MasterController getInstance() {
         if (instance == null) {
             instance = new MasterController(null);
         }
         return instance;
     }

    public void push(controller controller) {
        stack.peek().hide();
        stack.add(controller);
        controller.show();
    }

    public void pop() {
        stack.peek().hide();
        stack.pop();
        stack.peek().show();
    }

    public boolean empty() {
        if (stack.empty() == true){
            return true;
        }else{
            return false;
    }
        
    }
    
    public int search(controller controller) {
        int index = stack.indexOf(controller);
        return index;
    }
}
