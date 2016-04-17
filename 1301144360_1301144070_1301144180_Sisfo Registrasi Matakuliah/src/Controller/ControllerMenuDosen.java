/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Dosen;
import View.MenuDosen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author dindhino
 */
public class ControllerMenuDosen implements ActionListener {
    Aplikasi model;
    MenuDosen view;
    Dosen d;

    public ControllerMenuDosen(Aplikasi model) {
        this.model = model;
        view = new MenuDosen();
        view.setVisible(true);
        view.addListener(this);
    }

    public ControllerMenuDosen(Aplikasi model, Dosen d) {
        this.model = model;
        view = new MenuDosen();
        view.setVisible(true);
        view.addListener(this);
        this.d = d;
        view.setLblForName(d.getName());
        view.setLblForID(d.getNIP());
        view.setLblForTipe(d.getTipe());
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
