package FichaPratica01;

import java.util.Scanner;

public class Ex_02mv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2, soma, subt, multip, divisao;

        System.out.print("Insira valor 1: ");
        valor1= input.nextInt();

        System.out.print("Insira valor 2: ");
        valor2= input.nextInt();

        soma=valor1+valor2;
        System.out.println("Soma: "+soma);

        subt=valor1-valor2;
        System.out.println("Subtração: "+subt);

        multip=valor1*valor2;
        System.out.println("Multiplicação: "+multip);

        divisao=valor1/valor2;
        System.out.println("Divisão: "+divisao);







    }

}
