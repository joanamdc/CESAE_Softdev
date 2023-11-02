package FichaPratica01;

import java.util.Scanner;

public class Ex_02mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, mult, subt;

        System.out.print("Insira numero 1: ");
        num1= input.nextInt();

        System.out.print("Insira numero 2: ");
        num2= input.nextInt();

        subt=num1-num2;
        mult=subt*num1;

        System.out.println("Resultado: "+mult);


    }
}
