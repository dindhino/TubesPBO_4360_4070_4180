/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Mahasiswa;
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
    Mahasiswa m;

    public ControllerMenuMahasiswa(Aplikasi model) {
        this.model = model;
        view = new MenuMahasiswa();
        view.setVisible(true);
        view.addListener(this);
    }
    
    public ControllerMenuMahasiswa(Aplikasi model, Mahasiswa m) {
        this.model = model;
        view = new MenuMahasiswa();
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

        if (source.equals(view.getBtnAdd())) {
            new ControllerMenuMahasiswa(model, m);
            view.dispose();
        } else if (source.equals(view.getBtnRemove())) {
            new ControllerMenuMahasiswa(model, m);
            view.dispose();
        } else if (source.equals(view.getBtnSubmit())) {
            new ControllerMatkulMhs(model, m);
            view.dispose();
        } else if (source.equals(view.getBtnLogout())) {
            new ControllerMainMenu(model);
            view.dispose();
        }
    }

}
