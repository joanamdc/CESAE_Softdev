package FichaPratica02;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("valor 1: ");
        valor1=input.nextInt();

        System.out.println("valor 2: ");
        valor2=input.nextInt();

        if (valor1>valor2) {
            System.out.println(valor2+" "+valor1);

        }else{
            System.out.println(valor1+" "+valor2);
        }


    }
}