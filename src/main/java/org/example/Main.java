package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Entradas
        Scanner leerDato = new Scanner(System.in);
        String nombreCliente;
        String paisCliente;
        int anoNacimientoCliente;
        int mesNacimientoCliente;
        int diaNacimientoCliente;

        //Pedimos los datos al usuario
        System.out.print("Ingrese su nombre: ");
        nombreCliente=leerDato.nextLine();

        System.out.print("Ingrese su pais: ");
        paisCliente=leerDato.nextLine();

        System.out.print("Ingrese su año de nacimiento: ");
        anoNacimientoCliente=leerDato.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        mesNacimientoCliente=leerDato.nextInt();

        System.out.print("Ingrese su dia de nacimiento: ");
        diaNacimientoCliente=leerDato.nextInt();

        //PROCESANDO LAS ENTRADAS

        //1. ¿Como calcular la edad del cliente?
        // restar el año actual menso el año de nacimiento
        int edadCliente=2024-anoNacimientoCliente;

        System.out.print("Su edad es: "+edadCliente);

        //2.Decidir con base en la edad si el cliente es mayor de edad
        if (edadCliente >= 18){
            System.out.print(" Usted es mayor de edad ");
            // Menu de licores
            System.out.println("MENU");
            System.out.println(" 1... Botella aguardiete antioqueña ---- $150 COP");
            System.out.println(" 2... Botella Don Julio --- $600 COP");
            System.out.println(" 3... Botella blue label ---- $1500 COP");
            System.out.println(" 4... Botella jagger ---- $200 COP");
            // botella de gauro --150
            // botella de don julio --600
            // botella de blue label --1500
            // botella de jagger --200
    }else {
            System.out.print(" Usted es un niño vayase a mimir ");
        }
    }
}