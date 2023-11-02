package FichaPratica02;

import java.util.Scanner;

public class Ex_10mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        String operacao;

        System.out.print("Insira n1: ");
        num1= input.nextInt();

        System.out.print("Insira n2: ");
        num2= input.nextInt();

        System.out.println("Insira um simbolo (+-*/): ");
        operacao= input.next();

        switch (operacao){
            case "+":
                System.out.println("Resultado: "+(num1+num2));
                break;

            case "-":
                System.out.println("Resultado: "+(num1-num2));
                break;

            case "*":
                System.out.println("Resultado: "+(num1*num2));
                break;

            case "/":
                System.out.println("Resultado: " +(num1/num2));
                break;

            default:
                System.out.println("Operação não é valida!");

        }


    }
}
