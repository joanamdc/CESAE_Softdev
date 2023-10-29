package FichaPratica02;

import java.util.Scanner;

public class Ex_09 {

    //Crie um programa que mostre o menor de três números inteiros lidos

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, valor3;

        //ler valores
        System.out.println("Insira um valor: ");
        valor1= input.nextInt();

        System.out.println("Insira um valor: ");
        valor2= input.nextInt();

        System.out.println("Insira um valor: ");
        valor3= input.nextInt();

        //imprimir o menor numero deles

        if(valor1<valor2 && valor1<valor3) {
            System.out.println("Menor: "+valor1);

        } if(valor2<valor1 && valor2<valor3) {
            System.out.println("Menor: " +valor2);

        } if(valor3<valor1 && valor3<valor2) {
            System.out.println("Menor: " +valor3);
        }

    }
}
