/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author MATHIAS
 */
//Construya un programa que funcione como una calculadora de áreas.
//1. Área de un Círculo (Fórmula: 3.1416 * radio * radio)
//2. Área de un Cuadrado (Fórmula: lado * lado)
//3. Área de un Triángulo (Fórmula: (base* altura) / 2)
//4. Área de un Rectángulo (Fórmula: base * altura)

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1. Area del circulo");
        System.out.println("2. Area del cuadrado");
        System.out.println("3. Area del triangulo");
        System.out.println("4. Area del rectangulo");
        
        double rpta;
        
        System.out.println("Ingresa de que figura ingresara el area");
        int variable = sc.nextInt();
        
        switch (variable){
            case 1:
                System.out.println("Ingrese radio");
                double radio = sc.nextDouble();
                rpta = 3.1416 * radio * radio;
                System.out.printf("El area del circulo es de: %.2f%n", rpta);
                break;
             case 2:
                 System.out.println("Ingrese el lado");
                 double lado = sc.nextDouble();
                 rpta = lado * lado;
                 System.out.printf("El area del cuadrado es de: %.2f%n", rpta);
                 break;
             case 3:
                 System.out.println("Ingrese base");
                 double base = sc.nextDouble();
                 System.out.println("Ingrese altura");
                 double altura = sc.nextDouble();
                 rpta = (base * altura)/2;
                 System.out.printf("El area del triangulo es de: %.2f%n",rpta);
                break;
             case 4:
                 System.out.println("Ingrese base");
                 double baseR = sc.nextDouble();
                 System.out.println("Ingrese altura");
                 double alturaR = sc.nextDouble ();
                 rpta = baseR * alturaR;
                 System.out.printf("El area del rectangulo es de: %.2f%n",rpta);
                 break;
                 
        }
    }
}
