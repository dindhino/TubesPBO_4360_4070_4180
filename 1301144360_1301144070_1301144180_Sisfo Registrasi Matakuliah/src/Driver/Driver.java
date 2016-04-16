/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.ControllerMainMenu;
import Model.Aplikasi;
import Model.AplikasiAwal;

/**
 *
 * @author dindhino
 */

public class Driver {

    public static void main(String[] a) {
        //AplikasiAwal app = new AplikasiAwal();
        //app.mainMenu();
        Aplikasi model = new Aplikasi();
        new ControllerMainMenu(model);
    }

}

