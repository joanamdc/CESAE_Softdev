package FichaPratica5;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        //ler vetor e fazer um for
        for (int indice = 0; indice < 10; indice++) {
            System.out.print("Insira o vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();

        }

        //encontrar o menor elemento no array
        int menorElemento = vetor[0];

        for (int indice=1; indice < 10; indice++) {
            if(vetor[indice]<menorElemento) {
                menorElemento=vetor[indice];
            }
        }
        System.out.println("Menor elemento: "+menorElemento);

    }
}


