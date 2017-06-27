package com.devix.www;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int nombre;
        int numeroEmpleado, sueldo, masueldo = 0, manumero = 0;

        System.out.println("Ingresa numero de empleados ");
        numeroEmpleado = teclado.nextInt();

        for (int i = 0; i < numeroEmpleado; i++) {

            System.out.println("Ingresa el numero del empleado ");
            nombre = teclado.nextInt();

            System.out.println("Ingresa el sueldo del empleado");
            sueldo = teclado.nextInt();

            if (sueldo > masueldo) {
                masueldo = sueldo;
                manumero = nombre;
            }
        }
        System.out.println("\n el empleado con mayor sueldo fue: \n numero: "+manumero+"\nsueldo: "+masueldo);



    }
}
