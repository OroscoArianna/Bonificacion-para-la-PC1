/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Arianna
 */
//El programa debe solicitar por consola la tarifa por hora y la cantidad de horas trabajadas
// Las primeras 40 horas se pagan a la tarifa normal. • Toda hora trabajada por encima de las 40 horas se considera "hora extra" 
//se paga con un 50% de recargo (es decir, 1.5 veces la tarifa normal).
//Si el sueldo total calculado supera los S/ 1500, el trabajador recibe un bono adicional por concepto de movilidad de S/ 100
//Imprimir un recibo detallado, los montos monetarios se muestren con 2 decimales.

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese la tarifa");
        double tarifa = sc.nextInt();
        System.out.println("Ingrese las horas trabajadas");
        double horas = sc.nextDouble();
        
        double pagoNormal, pagoExtra, bono, horasExtra;
        
        if(horas<=40){
            pagoNormal = tarifa * horas;
            pagoExtra = 0;
            horasExtra = 0;
        }else{
            horasExtra = horas - 40;
            pagoNormal = tarifa * 40;
            pagoExtra = (tarifa * 1.5) * horasExtra;
            
        }
        
        double total = pagoNormal + pagoExtra;
        
        if (total>1500){
            bono = 100;
        }else{
            bono = 0;
        }
        
        System.out.println("---Boleta de pago---");
        System.out.printf("Sueldo por horas normales (%.2f): %.2f%n", horas, pagoNormal);
        System.out.printf("Sueldo por horas extras (%.2f): %.2f%n", horasExtra, pagoExtra);
        System.out.printf("Bono por movilidad: %.2f%n", bono);
        System.out.printf("Total neto a pagar: s/%.2f%n", total + bono);
    }
}
