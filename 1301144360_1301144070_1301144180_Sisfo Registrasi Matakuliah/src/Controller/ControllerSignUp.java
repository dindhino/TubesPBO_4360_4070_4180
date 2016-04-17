/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.MainMenu;
import View.SignUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author dindhino
 */
public class ControllerSignUp extends MouseAdapter implements ActionListener{
    Aplikasi model;
    SignUp view;
    
    public ControllerSignUp(Aplikasi model){
        this.model = model;
        view = new SignUp();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnSignup())) {
            new ControllerMainMenu(model);
            view.dispose();
        } else if (source.equals(view.getBtnCancel())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
    }
    
}
