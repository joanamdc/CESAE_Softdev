package FichaPratica03;

import java.util.Scanner;

//fazer um programa que imprima os numeros de a 100 inclusive, e no final imprima tambem o valor do seu somatorio

public class Ex_06 {
    public static void main(String[] args) {

        int valor=1, soma=0;

        while(valor<=100){
            System.out.println(valor);

            soma=valor+soma;
            valor=valor+1; //quando nos pede para imprimir um numero até determinado valor, temos obrigatoriamente que fazer uma soma
        }

        System.out.println("Soma: "+soma);
    }

}
