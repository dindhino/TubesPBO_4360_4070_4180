/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.MainMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;

/**
 *
 * @author dindhino
 */
public class ControllerMainMenu implements ActionListener {
    Aplikasi model;
    MainMenu view;

    public ControllerMainMenu(Aplikasi model) {
        this.model = model;
        view = new MainMenu();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnLogin())) {
            new ControllerDorm(model);
            view.dispose();
        } else if (source.equals(view.getBtnReg())) {
            
        } else if (source.equals(view.getBtnExit())) {
            exit(0);
        }
    }
    
    
    
}
