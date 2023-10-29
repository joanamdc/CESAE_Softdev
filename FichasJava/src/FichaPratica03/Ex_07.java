package FichaPratica03;

import java.util.Scanner;

public class Ex_07 {
    //Faça um programa que leia um numero inteiro e imprima os 5 anteriores e os 5 seguintes
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, diminui, aumenta;

        System.out.println("Numero inteiro: ");
        numero= input.nextInt(); //no caso de ser 20, vai ter de me apresentar 15, 16,17,18,19...,21,22,23,24,25
               //20

        diminui=numero-5;
        aumenta=numero+5;

        while (diminui < numero ) {
            System.out.println(diminui);
            diminui=diminui+1;
        }

        numero=numero+1;

        while (numero <= aumenta ) {
            System.out.println(numero);
            numero=numero+1;
        }
    }
}
