/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;
import paquete01.*;
import paquete02.*;
import paquete03.*;

/**
 *
 * @author OLIVER SARAGURO - - ROBERTO BUSTAMANTE (GRUPO 12)
 */
public class Solucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        boolean bandera = true;
        int cont = 0;
        while (bandera) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("+Ingresa 1 para crear un cuenta en Facebook.\n"
                    + "+Ingresa 2 para crear un cuenta en Twitter.\n"
                    + "+Ingresa 3 para crear un cuenta en Whatsapp.\n"
                    + "+Ingresa 4 para crear un cuenta en Telegram.\n"
                    + "+Ingresa 5 para crear un cuenta en Signal.\n"
                    + "+Ingresa 6 para crear un cuenta en Instagram.\n"
                    + "+Ingresa 7 para crear un cuenta en Flickr.\n");
            int op = entrada.nextInt();

            String salida;
            if (op == 1) {
                salida = funciones.crearFacebook();
                cont = cont + 1;
                System.out.printf("%s\n", salida);

            } else if (op == 2) {
                procedimientos.crearTwitter();
                cont = cont + 1;
            } else if (op == 3) {
                salida = funciones.crearWhatsapp();
                cont = cont + 1;
                System.out.printf("%s\n", salida);
            } else if (op == 4) {
                procedimientos.crearTelegram();
                cont = cont + 1;
            } else if (op == 5) {
                salida = funciones.crearSignal();
                cont = cont + 1;
                System.out.printf("%s\n", salida);
            } else if (op == 6) {
                procedimientos.crearInstagram();
                cont = cont + 1;
            } else if (op == 7) {
                salida = funciones.crearFlickr();
                cont = cont + 1;
                System.out.printf("%s\n", salida);
            } else {
                    System.out.println("ERROR opcion no existente.");
                    cont = cont + 0;
            }

            System.out.println("Ingrese 0 si desea terminar el proceso  de "
                    + "no ser asi ingrese cualquier numero: ");
            
            int indice = entrada.nextInt();
            if (indice == 0) {
                bandera = false;
            }
            
            System.out.println(mensajeFinal.obtenerMensaje(cont));
            System.out.println("Número total de cuentas creadas: "+cont);
        }

    }

}
