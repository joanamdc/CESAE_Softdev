package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    //faça um programa que leia um numero inteiro de 0 até este numero
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, inicial=0;

        System.out.println("Numero inteiro: ");
        numero= input.nextInt();

        while(inicial<=numero){
            System.out.println(inicial);
            inicial=inicial+1;
        }


    }

}
