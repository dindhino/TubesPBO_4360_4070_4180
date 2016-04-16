/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.Dorm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dindhino
 */
public class ControllerDorm implements ActionListener {
    Aplikasi model;
    Dorm view;

    public ControllerDorm(Aplikasi model) {
        this.model = model;
        view = new Dorm();
        view.setVisible(true);
        view.addListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = new Object();
        
        if (source.equals(view.getBtnDsn())) {
            new ControllerLoginDsn(model);
            view.dispose();
        } else if (source.equals(view.getBtnMhs())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
    }
    
}
