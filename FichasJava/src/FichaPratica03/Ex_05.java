package FichaPratica03;

import java.util.Scanner;

public class Ex_05 {
    //faz um programa que leia os numeros inteiros, representando os valores inicio e fim de um intervalo e imprima os
    //numeros inteiros neste intervalo

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vI, vF;

        System.out.println("Insira valor inicial: ");
        vI=input.nextInt();

        System.out.println("Insira valor final: ");
        vF=input.nextInt();

        while(vI<=vF) {
        System.out.println(vI);
        vI=vI+1; }


    }
}
