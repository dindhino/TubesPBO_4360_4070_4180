/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.MenuMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dindhino
 */
public class ControllerMenuMahasiswa implements ActionListener {

    Aplikasi model;
    MenuMahasiswa view;

    public ControllerMenuMahasiswa(Aplikasi model) {
        this.model = model;
        view = new MenuMahasiswa();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(view.getBtnAdd())) {
            new ControllerMenuMahasiswa(model);
            view.dispose();
        } else if (source.equals(view.getBtnRemove())) {
            new ControllerMenuMahasiswa(model);
            view.dispose();
        } else if (source.equals(view.getBtnSubmit())) {
            new ControllerMatkulMhs(model);
            view.dispose();
        } else if (source.equals(view.getBtnLogout())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
    }

}
