/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author OLIVER SARAGURO - - ROBERTO BUSTAMANTE
 */
public class procedimientos {

    public static void crearTwitter() {
        Scanner entrada = new Scanner(System.in);
        String salida = "";
        System.out.println("Ingrese un Nombre de Usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su Nombres completos: ");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese sus Apellidos completos: ");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais: ");

        String pais = entrada.nextLine();
        System.out.println("Ingrese su Idioma: ");
        String idioma = entrada.nextLine();
        System.out.println("Ingrese su correo electronico: ");
        String correoE = entrada.nextLine();

        salida = String.format("%s\n"
                + "DATOS INGRESADOS TWITTER\n"
                + "Nombre de Usuario: %s\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "Pais: %s\n"
                + "Idioma: %s\n"
                + "Correo Electronico: %s\n",
                 salida,
                 usuario,
                 nombres,
                 apellidos,
                 edad,
                 ciudad,
                 pais,
                 idioma,
                 correoE);
        System.out.printf("%s\n", salida);

    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String salida = "";
        System.out.println("Ingrese un nombre de Usuario: ");
        String usuario = entrada.nextLine();
        System.out.println("Ingrese su telefono: ");
        int telefono = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su pais: ");
        String pais = entrada.nextLine();
        System.out.println("Ingrese su Area de Interes: ");
        String areaI = entrada.nextLine();

        salida = String.format("%s\n"
                + "DATOS INGRESADOS TELEGRAM\n"
                + "Nombre de Usuario: %s\n"
                + "Telefono: %d\n"
                + "Ciudad: %s\n"
                + "Pais: %s\n"
                + "Area de Interes: %s\n",
                 salida,
                 usuario,
                 telefono,
                 ciudad,
                 pais,
                 areaI);

        System.out.printf("%s\n", salida);
    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String salida = "";
        System.out.println("Ingrese un nombre de Usuario: ");
        String usuario = entrada.nextLine();

        System.out.println("Ingrese su ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese su Edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su Correo Electronico: ");
        String correoE = entrada.nextLine();

        salida = String.format("%s\n"
                + "DATOS INGRESADOS INSTAGRAM\n"
                + "Nombre de Usuario: %s\n"
                + "Ciudad: %s\n"
                + "Edad: %s\n"
                + "Correo Electronico: %s\n",
                 salida,
                 usuario,
                 ciudad,
                 edad,
                 correoE);

        System.out.printf("%s\n", salida);
    }
}
