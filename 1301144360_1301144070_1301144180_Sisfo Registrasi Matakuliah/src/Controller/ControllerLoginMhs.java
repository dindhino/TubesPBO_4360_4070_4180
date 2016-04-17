/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Mahasiswa;
import View.LoginMhs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dindhino
 */
public class ControllerLoginMhs implements ActionListener {
    Aplikasi model;
    LoginMhs view;
    Mahasiswa m;

    public ControllerLoginMhs(Aplikasi model) {
        this.model = model;
        view = new LoginMhs();
        view.setVisible(true);
        view.addListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source.equals(view.getBtnLogin())) {
            String unm = view.getUsername();
            String pwd = view.getPassword();
            m = model.getMahasiswaByUsrnm(unm);
            if (m != null) {
                new ControllerMenuMahasiswa(model, m);
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
