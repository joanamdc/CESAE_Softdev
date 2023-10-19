package FichaPratica01;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        // PRIMEIRO PASSO: Instanciar o scanner (obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // SEGUNDO PASSO: declarar variaveis
        int num1, num2, soma;

        // ler num1
        System.out.print("Insira um numero: ");
        num1= input.nextInt();

        // ler num2
        System.out.print("Insira um numero: ");
        num2= input.nextInt();

        // soma do num1 e num2
        soma = num1+num2;

        // apresentar soma: utilizar sempre a função de system.out.println
        System.out.println("soma: " + soma);


    }



}
