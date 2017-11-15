/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinejava;

/**
 *
 * @author alumno
 */
public class controller implements IController {

    private vista vista;

    controller() {
        vista = new vista();
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
