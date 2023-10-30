package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {

    //fazer um programa que leia um numero inteiro e imprima os numeros pares entre 2 e o numero lido inclusive.
    //Suponha que o numero lido da entrada será maior que 2

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador=2, limite;

        System.out.println("Insira o limite: ");
        limite= input.nextInt();

        while(contador<=limite) {
            System.out.println(contador);
            contador=contador+2;
        }
    }
}
