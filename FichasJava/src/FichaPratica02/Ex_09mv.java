package FichaPratica02;

import java.util.Scanner;

public class Ex_09mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Insira numero 1: ");
        num1= input.nextInt();

        System.out.print("Insira numero 2: ");
        num2= input.nextInt();

        System.out.print("Insira numero 3: ");
        num3= input.nextInt();

        if(num1<num2 && num1<num3){
            System.out.println(num1);

        }if(num2<num1 && num2<num3) {
            System.out.println(num2);

        }if(num3<num1 && num3<num2) {
            System.out.println(num3);
        }
    }
}
