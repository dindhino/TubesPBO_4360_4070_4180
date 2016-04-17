/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.MenuDosen;

/**
 *
 * @author dindhino
 */
public class ControllerMenuDosen {
    Aplikasi model;
    MenuDosen view;

    public ControllerMenuDosen(Aplikasi model) {
        this.model = model;
        view = new MenuDosen();
        view.setVisible(true);
    }
    
    
    
}
