package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {

    //Escreva um algoritmo que leia uma quantidade desconhecida de numeros inteiros positivos
    //fornecidos pelo utilizador e conte quantos deles estao nos intervalos. A entrada de dados
    //deve terminar
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0, int1 = 0, int2 = 0, int3 = 0, int4 = 0;

        /*int1=[0,25];
        int2=[26,50];
        int3=[51,75];
        int4=[76,100]*/

        //tenho que fazer Ifs dentro do while


        while (num >= 0) {
            System.out.print("Insira o numero: ");
            num = input.nextInt();

            if (num >= 0 && num <= 25) {
                int1++; // intervalo=intervalo+1;
            }
            if (num >= 26 && num <= 50) {
                int2++;
            }
            if (num >= 51 && num <= 75) {
                int3++;
            }
            if (num >= 76 && num <= 100) {
                int4++;
            }
        } System.out.println("Intervalo [0,25]= "+int1);


        System.out.println("Intervalo [26,50]= "+int2);


        System.out.println("Intervalo [51,75]= "+int3);


        System.out.println("Intervalo [76,100]= "+int4);


    }
}