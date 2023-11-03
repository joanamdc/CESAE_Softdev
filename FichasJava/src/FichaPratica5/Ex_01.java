package FichaPratica5;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Neste exercicio quero implementar um programa que permita adicionar 10 numeros inteiros um array(vetor)
        //e que os imprima pela ordem de inserção.

        //Declarar variáveis
        int[] vetor = new int[10];

        //As variaveis colocam-se sempre entre parenteses retos[]. Portanto queremos verificar os numeros que o utilizador
        //vai inserir nos arrays do indice 0 até 10.


        //ler vetor e fazer um for
        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Insira um numero de Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();

        }
        //Imprimir os vetores que o utilizador inseriu
        for (int indice = 0; indice < 10; indice++) {
            System.out.println("Vetor[" + indice + "]: "+vetor[indice]);

        }
    }
}
