package FichaPratica02;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira um numero: ");
        num1=input.nextInt();

        System.out.println("Insira um numero: ");
        num2=input.nextInt();

        if(num1>num2){
            System.out.println("Primeiro valor é maior");

        } if(num1==num2){
            System.out.println("Os valores são iguais");

        } if(num1<num2){
            System.out.println("Segundo valor é maior");

        }






    }
}
