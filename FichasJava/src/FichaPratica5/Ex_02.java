package FichaPratica5;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int[] vetor = new int[12];
        int somaTotalAnual;

        //ler vetor e fazer um for
        for (int indice = 0; indice < 12; indice++) {
            System.out.print("Insira comissão mensal[" + indice + "]: ");
            vetor[indice] = input.nextInt();

        }//Imprimir os vetores que o utilizador inseriu
        for (int indice = 1; indice < 12; indice++) {
            System.out.println("Vetor [" + indice + "]: "+vetor[indice]);

                    //calcular soma total anual
            somaTotalAnual=indice*12;
            System.out.println("Soma: "+somaTotalAnual);
        }
    }
}
