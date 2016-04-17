/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Mahasiswa;
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
    Mahasiswa m;

    public ControllerMatkulMhs(Aplikasi model) {
        this.model = model;
        view = new Matkulmhs();
        view.setVisible(true);
        view.addListener(this);
    }
    
    public ControllerMatkulMhs(Aplikasi model, Mahasiswa m) {
        this.model = model;
        view = new Matkulmhs();
        view.setVisible(true);
        view.addListener(this);
        this.m = m;
        view.setLblForName(m.getName());
        view.setLblForID(m.getNIM());
        view.setLblForTipe(m.getTipe());
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
