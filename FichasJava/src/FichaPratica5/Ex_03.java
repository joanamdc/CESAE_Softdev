package FichaPratica5;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        //ler vetor e fazer um for
        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Insira o vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();

        }

        //encontrar o maior elemento no array
        int maiorElemento = vetor[0];

        for (int indice=1; indice < 10; indice++) {
            if(vetor[indice]>maiorElemento) {
                maiorElemento=vetor[indice];
            }
        }
        System.out.println("Maior elemento: "+maiorElemento);

    }
}
