package FichaPratica02;

import java.util.Scanner;

public class Ex_03mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.println("Insira o seu salario: ");
        salario= input.nextDouble();

        if(salario<=15000) {
            System.out.println("Paga taxa de 20%: "+(salario*0.2));

        } if(salario>15000 && salario<=20000) {
            System.out.println("Paga taxa de 30%: "+(salario*0.3));

        } if (salario>20000 && salario<=25000) {
            System.out.println("Paga taxa de 35%: "+(salario*0.35));

        } if (salario>25000) {
            System.out.println("Paga taxa de 40%: "+(salario*0.4));
        }
    }
}
