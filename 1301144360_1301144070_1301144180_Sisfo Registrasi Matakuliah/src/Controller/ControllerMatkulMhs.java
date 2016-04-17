/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Matkulmhs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dindhino
 */
public class ControllerMatkulMhs implements ActionListener {
    
    Aplikasi model;
    Matkulmhs view;

    public ControllerMatkulMhs(Aplikasi model) {
        this.model = model;
        view = new Matkulmhs();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnLogout())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
    }
    
    
    
}
