/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author Emilio
 */

public class CalculadoraMatematica {

    private double numero1;
    private double numero2;

    public void insertarNumeros(double num1, double num2) {
        numero1 = num1;
        numero2 = num2;
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }

        return numero1 / numero2;
    }

    public static void mostrarMenu() {
        System.out.println("\n----CALCULADORA-----");
        System.out.println("1. Ingresar números");
        System.out.println("2. Sumar");
        System.out.println("3. Restar");
        System.out.println("4. Multiplicar");
        System.out.println("5. Dividir");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
