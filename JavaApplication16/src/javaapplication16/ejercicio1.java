/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Arianna
 */
//Escribir un programa en Java que lea las horas, minutos y segundos individualmente
//y calcula que hora seria en el siguiente segundo.
//Validar que los valores ingresados sean correctos: horas (0-23), minutos (0-59) y segundos (0-59).
//En caso de ingresar datos inválidos mostrar un error.
//Imprimir la hora resultante usando el formato de dos dígitos separados por dos puntos (Ejemplo: 08:00:00)

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese las horas (0-23): ");
        int horas = sc.nextInt();
        
        System.out.println("Ingrese los minutos (0-59): ");
        int minutos = sc.nextInt();
        
        System.out.println("Ingrese los segundos (0-59): ");
        int segundos = sc.nextInt();
        
        if (horas<0 && horas>23 && minutos<0 && minutos>59 && segundos<0 && segundos>59){
            System.out.println("Error");
            return;   
        }
        System.out.printf("Entrada: %02d:%02d:%02d ->", horas,minutos, segundos);
        segundos++;
        
        if(segundos >59){
            segundos = 0;
            minutos++;
            if (minutos>59){
                minutos = 0;
                horas++;
                if (horas>23){
                    horas = 0; 
                }
                
            }
        }
        
        System.out.printf("Salida: %02d:%02d:%02d%n", horas,minutos,segundos);
    }
}
