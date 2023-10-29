package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {

    //Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.
    //Exemplo: Valores Lidos: 22 32 Resultado: 10 32 PM
    //Valores Lidos: 10 44 Resultado: 10 44 AM

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horas, minutos;

        //ler horas
        System.out.println("Introduza horario em 24h");
        System.out.println("Horas: ");
        horas= input.nextInt();

        //ler minutos
        System.out.println("Minutos: ");
        minutos= input.nextInt();

        if(horas<=12){ //AM
            System.out.println(horas+":"+minutos+"AM");
        }else{ //PM
            horas=horas-12;
            System.out.println(horas+":"+minutos+"PM");
        }
    }
}
