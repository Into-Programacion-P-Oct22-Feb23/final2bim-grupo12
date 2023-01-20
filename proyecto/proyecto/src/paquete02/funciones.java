/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author OLIVER SARAGURO - - ROBERTO BUSTAMANTE
 */
public class funciones {

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String salida = "";
        System.out.println("Ingrese un nombre de Usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais: ");
        String pais = entrada.nextLine();
        System.out.println("Ingrese su correo electronico: ");
        String correoE = entrada.nextLine();

        salida = String.format("%s\n"
                + "DATOS INGRESADOS FACEBOOK\n"
                + "Nombre de Usuario: %s\n"
                + "Su edad: %d\n"
                + "Ciudad: %s\n"
                + "Pais: %s\n"
                + "Correo electronico%s\n",
                 salida,
                 usuario,
                 edad,
                 ciudad,
                 pais,
                 correoE);

        return salida;
    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String salida = "";
        System.out.println("Ingrese un nombre de Usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su telefono: ");
        int telefono = entrada.nextInt();
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais: ");
        String pais = entrada.nextLine();

        salida = String.format("%s\n"
                + "DATOS INGRESADOS WHATSAPP\n"
                + "Nombre de Usuario: %s\n"
                + "Telefono: %d\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "Pais%s\n",
                 salida,
                 usuario,
                 telefono,
                 edad,
                 ciudad,
                 pais);

        return salida;
    }

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String salida = "";
        System.out.println("Ingrese un nombre de Usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su telefono: ");
        int telefono = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais: ");
        String pais = entrada.nextLine();
        System.out.println("Ingrese su Hobby Principal: ");
        String hobby = entrada.nextLine();

        salida = String.format("%s\n"
                + "DATOS INGRESADOS SIGNAL\n"
                + "Nombre de Usuario: %s\n"
                + "Telefono: %d\n"
                + "Ciudad: %s\n"
                + "Pais%s\n"
                + "Hobby Principal: %s\n",
                 salida,
                 usuario,
                 telefono,
                 ciudad,
                 pais,
                 hobby);

        return salida;
    }

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String salida = "";
        System.out.println("Ingrese un nombre de Usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su Correo Electronico: ");
        String correoE = entrada.nextLine();

        salida = String.format("%s\n"
                + "DATOS INGRESADOS FLICKR\n"
                + "Nombre de Usuario: %s\n"
                + "Correo Electronico: %s\n"
                , salida
                , usuario
                , correoE);

        return salida;
    }
}
