package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio, fim;

        //ler inicio
        System.out.println("Insira valor inicio: ");
        inicio = input.nextInt();

        //ler fim
        System.out.println("Insira valor final: ");
        fim = input.nextInt();

        while (inicio <= fim) {
            if(inicio%5==0) { //uma vez que nos pede para ser multiplo de 5, temos de utilizar o resto da divisão para
                               // nos calcular o valor multiplo de 5 mesmo que o utilizador defina com numeros impares
                System.out.println(inicio);
            }
            inicio++;
        }
        }
}
