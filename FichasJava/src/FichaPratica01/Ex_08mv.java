package FichaPratica01;

import java.util.Scanner;

public class Ex_08mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutosTotais, segundosTotais, tempoTotal;

        System.out.println("Insira min musica 1: ");
        minutosTotais= input.nextInt();

        System.out.println("Insira seg musica 1: ");
        segundosTotais= input.nextInt();

        System.out.println("Insira min musica 2: ");
        minutosTotais= minutosTotais + input.nextInt();

        System.out.println("Insira seg musica 3: ");
        segundosTotais= segundosTotais+input.nextInt();

        System.out.println("Insira min musica 3: ");
        minutosTotais= minutosTotais+input.nextInt();

        System.out.println("Insira seg musica 1: ");
        segundosTotais= segundosTotais+ input.nextInt();

        System.out.println("Minutos Totais: "+minutosTotais);
        System.out.println("Segundos Totais: "+segundosTotais);

        //Calcular o total de segundos totais do album
        



    }
}
