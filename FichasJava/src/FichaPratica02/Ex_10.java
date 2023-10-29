package FichaPratica02;

import java.util.Scanner;

public class Ex_10 {
    //Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
    //realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
    //a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, resultado;
        String operacao;

        System.out.println("numero 1: ");
        num1= input.nextInt();

        System.out.println("numero 2: ");
        num2= input.nextInt();

        System.out.println("Operação aritmetica (+-/*): ");
        operacao= input.next();    //como é uma string, não utilizamos nem double nem int

        switch (operacao) {
            case "+":
                resultado=num1+num2;
                System.out.println(resultado); //este resultado diz respeito ao resultado que o utilizador vai utilizar dos
                                               // valores que vai introduzir, caso escolha soma, subt, divisao ou multipl
                break;

            case "-":
                resultado=num1-num2;
                System.out.println(resultado);
                break;

            case "*":
                resultado=num1*num2;
                System.out.println(resultado);
                break;

            case"/":
                resultado=num1/num2;
                System.out.println(resultado);
                break;

            default:
                System.out.println("Operação aritmetica não reconhecida");
        }

    }
}
