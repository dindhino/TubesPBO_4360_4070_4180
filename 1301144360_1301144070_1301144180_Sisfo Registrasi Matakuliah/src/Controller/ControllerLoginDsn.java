/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.Database;
import Model.Aplikasi;
import Model.Dosen;
import View.LoginDsn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dindhino
 */
public class ControllerLoginDsn implements ActionListener {
    Aplikasi model;
    LoginDsn view;
    Dosen d;

    public ControllerLoginDsn(Aplikasi model) {
        this.model = model;
        view = new LoginDsn();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnLogin())) {
            String unm = view.getUsername();
            String pwd = view.getPassword();
            d = model.getDosenByUsrnm(unm);
            if (d != null) {
                new ControllerMenuDosen(model, d);
                view.dispose();
            } else {
                JOptionPane.showMessageDialog(view, "Username atau Password salah");
                view.setUsername("");
                view.setPassword("");
            }
        } else if (source.equals(view.getBtnCancel())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
    }
}
