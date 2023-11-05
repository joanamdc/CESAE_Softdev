package FichaPratica5;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        //ler vetor e fazer um for
        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Insira o vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();

        }
        //calcular a soma para dividir por 10
        //Calcular a media
        int media= vetor[0];


}}
