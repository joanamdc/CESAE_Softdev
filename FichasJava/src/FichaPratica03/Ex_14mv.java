package FichaPratica03;

import java.util.Scanner;

public class Ex_14mv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, fatorial=1;

        System.out.println("Insira um numero: ");
        numero= input.nextInt();

        fatorial=numero;
        numero--;

        while(numero>0){
            fatorial=fatorial*(numero);
            numero--;


        }
        System.out.println("Fatorial= "+fatorial);
    }
}
