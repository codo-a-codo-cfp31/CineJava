/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejavaapp.view;



import javafx.scene.web.WebEngine;
import org.w3c.dom.html.HTMLInputElement;

/**
 * @author alumno
 */

public class JavaHelper {
    private String userName;
    private String pass;
    
    private WebEngine myWebEngine;
    
    public void PrintFromJS(String s){
        System.out.println(s);
        SetUserName((HTMLInputElement)myWebEngine.getDocument().getElementById("user_name")); 
        SetPassword((HTMLInputElement)myWebEngine.getDocument().getElementById("password"));
        
    }
    
    public JavaHelper(WebEngine myWebEngine) {
        this.myWebEngine = myWebEngine;
    }
    
    public void SetUserName(HTMLInputElement element){
        userName = element.getValue();
        System.out.println("User Name: " + userName);
    }
    
    public String GetUserName(){
        return userName;
    }
    
    public void SetPassword(HTMLInputElement element){
        pass = element.getValue();
        System.out.println("pass: " + pass);
    }
    
    public String GetPassword(){
        return pass;
    }
}
