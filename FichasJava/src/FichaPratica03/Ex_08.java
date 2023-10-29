package FichaPratica03;

import java.util.Scanner;

public class Ex_08 {

    //escreve um programa que vai pedir numeros ao utilizador ate que este introduza o numer -1. o computador deve dizer a
    //média dos numeros introduzidos

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, total, media;
        

            System.out.println("Introduz numero: ");
            numero = input.nextInt();


            while (numero!=-1) {
                System.out.println("Introduz numero: ");
                numero = input.nextInt();
            }

        total=numero;
            media=total/numero;

        System.out.println(media);
        media= input.nextInt();



        //enquanto não introduzir o numero -1 vai estar sempre a pedir para introduzir numeros
        //temos que fazer o total da soma dos numeros introduzidos a dividir pela quantidade de vezes que tiveram de introduzir






    }
}
