package FichaPratica02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario;

        System.out.println("Insira o salario: ");
        salario=input.nextDouble();

        if(salario<=15000) {
            System.out.println("taxa 20% " + (salario*0.2));

        } if(salario>15000) {
            System.out.println("taxa 30% " + (salario*0.3));
        }

    }
}
