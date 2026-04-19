package TP1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;

        System.out.println("--- SISTEMA DE CALIFICACIONES ---");
        System.out.print("Ingrese la nota del alumno: ");


        if (leer.hasNextInt()) {
            nota = leer.nextInt();


            if (nota < 1 || nota > 10) {
                System.out.println("Error: La nota debe estar entre 1 y 10.");
            } else {
                verificarCondicion(nota);
            }
        } else {
            System.out.println("Error: No ingresaste un número válido.");
        }

        leer.close();
    }


    public static void verificarCondicion(int n) {
        if (n == 10) {
            System.out.println("Resultado: SOBRESALIENTE.");
        } else if (n >= 4) {
            System.out.println("Resultado: APROBÓ.");
        } else {

            System.out.println("Resultado: EL ALUMNO DESAPROBÓ. Tiene que volver a rendir el exámen.");
        }
    }
}