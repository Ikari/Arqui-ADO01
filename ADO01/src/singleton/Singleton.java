/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author roger
 */
public class Singleton {
    public static void main(String[] args) {
        AppEnviroment.getInstance().imprimeDadosSistema();
        AppEnviroment.getInstance().imprimeDadosSistema();
        AppEnviroment.getInstance().imprimeDadosSistema();
    }
}
