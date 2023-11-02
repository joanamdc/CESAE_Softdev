package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, fim;

        // Ler inicio
        System.out.print("Insira o inicio: ");
        inicio=input.nextInt();

        // Ler fim
        System.out.print("Insira o fim: ");
        fim=input.nextInt();

        while (inicio<=fim){
            if(inicio%5==0){
                System.out.println(inicio);
            }
            inicio++;
        }
    }
}

  //uma vez que nos pede para ser multiplo de 5, temos de utilizar o resto da divisão para
                               // nos calcular o valor multiplo de 5 mesmo que o utilizador defina com numeros impares
