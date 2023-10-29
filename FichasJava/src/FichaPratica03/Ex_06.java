package FichaPratica03;

import java.util.Scanner;

//fazer um programa que imprima os numeros de 1 a 100 inclusive, e no final imprima tambem o valor do seu somatorio

public class Ex_06 {
    public static void main(String[] args) {

        int valor=1, soma=0;

        while(valor<=100){
            System.out.println(valor);

            soma=valor+soma;
            valor=valor+1;


        }


    }
}
