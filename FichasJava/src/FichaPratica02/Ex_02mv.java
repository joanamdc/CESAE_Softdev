package FichaPratica02;

import java.util.Scanner;

public class Ex_02mv {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario;

        System.out.println("Introduza o seu salario: ");
        salario= input.nextDouble();

        if (salario<=15000) {
            System.out.println("Paga taxa de 20%:"+" "+(salario*0.2));

        }else{
            System.out.println("Paga taxa de 30%:"+" "+(salario*0.3));

        }



    }
}
