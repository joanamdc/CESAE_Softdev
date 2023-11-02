package FichaPratica01;

import java.util.Scanner;

public class Ex_06mv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2, troca;

        System.out.print("Insira valor 1: ");
        valor1= input.nextInt();

        System.out.print("Insira valor 2: ");
        valor2= input.nextInt();

        System.out.println("\nValor 1: "+valor1);
        System.out.println("Valor 2: "+valor2);

        valor1=valor1+valor2;
        valor2=valor1-valor2;
        valor1=valor1-valor2;

        System.out.println("\nValor1: "+valor1);
        System.out.println("Valor2: "+valor2);
    }
}





