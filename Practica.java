/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;
import java.util.Scanner;
/**
 *
 * @author Emilio
 */

public class Practica {

   public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        CalculadoraMatematica calculadora = new CalculadoraMatematica();

        int opcion = -1;
        boolean hayNumeros = false;

        do {
            CalculadoraMatematica.mostrarMenu();

            try {
                opcion = Integer.parseInt(teclado.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opción válida.");
                continue;
            }

            // Evita operar antes de ingresar los números
            if (opcion >= 2 && opcion <= 5 && !hayNumeros) {
                System.out.println("Primero debe ingresar los números.");
                continue;
            }

            switch (opcion) {

                case 1 -> {
                    try {
                        System.out.print("Ingrese el primer número: ");
                        double num1 = Double.parseDouble(
                            teclado.nextLine().trim().replace(',', '.'));

                        System.out.print("Ingrese el segundo número: ");
                        double num2 = Double.parseDouble(
                            teclado.nextLine().trim().replace(',', '.'));

                        calculadora.insertarNumeros(num1, num2);
                        hayNumeros = true;

                        System.out.println("Números ingresados correctamente.");

                    } catch (NumberFormatException e) {
                        System.out.println("Debe ingresar números válidos.");
                    }
                }

                case 2 -> System.out.println(
                    "Resultado de la suma: " + calculadora.sumar());

                case 3 -> System.out.println(
                    "Resultado de la resta: " + calculadora.restar());

                case 4 -> System.out.println(
                    "Resultado de la multiplicación: " + calculadora.multiplicar());

                case 5 -> {
                    try {
                        System.out.println(
                            "Resultado de la división: " + calculadora.dividir());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 0 -> System.out.println(
                    "¡Gracias por usar la calculadora!");

                default -> System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);

        teclado.close();
    }
}
