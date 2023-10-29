package FichaPratica02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex_06 {

    //Escreva um programa que leia dois valores numéricos e apresente o maior e depois o menor.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //definir variavies

        int valor1, valor2;

        //ler valores

        System.out.println("valor1: ");
        valor1 = input.nextInt();

        System.out.println("valor2: ");
        valor2 = input.nextInt();

        if (valor1<valor2) {
            System.out.println(valor2+" "+valor1);

        }else{
            System.out.println(valor1+" "+valor2);
        }

    }

}