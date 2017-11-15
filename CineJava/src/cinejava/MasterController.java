/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejava;

import java.util.Stack;

/**
 *
 * @author alumno
 */
public class MasterController {

    protected Stack<controller> stack;

    MasterController() {
        stack = new Stack<>();
        controller controller = new controller();
        stack.add(controller);
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
