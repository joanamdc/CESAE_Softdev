package FichaPratica4;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, resultado;
        String caracter, continuar;

        do {
            System.out.println("Insira valor 1: ");
            valor1 = input.nextInt();

            System.out.println("Insira valor 2: ");
            valor2 = input.nextInt();

            System.out.println("Insira um destes caracteres (+,-,*,/): ");
            caracter= input.next();


            switch (caracter) {
                case "+":
                    resultado = valor1 + valor2;
                    System.out.println("Resultado da operação: "+resultado);
                    break;

                case "-":
                    resultado = valor1 - valor2;
                    System.out.println("Resultado da operação: "+resultado);
                    break;

                case "*":
                    resultado = valor1 * valor2;
                    System.out.println("Resultado da operação: "+resultado);
                    break;

                case "/":
                   resultado = valor1 / valor2;
                    System.out.println("Resultado da operação: "+resultado);
                    break;

                default:
                    System.out.println("Operação inválida... tente novamente");

            }  //perguntar se quer fazer novas contas
            do {
                System.out.println("Deseja continuar? (s/n):");
                continuar = input.next();

            }while (!continuar.equals("s") && !continuar.equals("n")); //fazemos o equals porque é uma string

        }while (!continuar.equals("n"));
    }

}



