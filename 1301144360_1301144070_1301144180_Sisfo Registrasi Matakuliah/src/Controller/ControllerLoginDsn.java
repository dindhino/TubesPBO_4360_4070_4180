/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.LoginDsn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author dindhino
 */
public class ControllerLoginDsn implements ActionListener {

    Aplikasi model;
    LoginDsn view;

    public ControllerLoginDsn(Aplikasi model) {
        this.model = model;
        view = new LoginDsn();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = new Object();

        if (source.equals(view.getBtnLogin())) {
            view.dispose();
        } else if (source.equals(view.getBtnCancel())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
    }
}
