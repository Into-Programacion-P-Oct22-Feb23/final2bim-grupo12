/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author oliver
 */
public class mensajeFinal {

    public static String obtenerMensaje(int a) {
        String[] mensajeFinal = {"Campaña con poca afluencia"
                                , "Campaña moderada siga adelante"
                                , "Excelente campaña"};
        String salida = "";

        for (int i = 0; i < mensajeFinal.length; i++) {
            if (a >= 1 && a <= 5) {
                salida = mensajeFinal[0];
            } else if (a >= 6 && a <= 15) {
                salida = mensajeFinal[1];
            } else if (a >= 16) {
                salida = mensajeFinal[2];
            }

        }
        return salida;

    }
}
