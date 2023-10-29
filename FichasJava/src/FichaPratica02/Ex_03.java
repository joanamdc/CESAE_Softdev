package FichaPratica02;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declarar variavies
        double salario;

        //ler salario
        System.out.println("Introduz salario: ");
        salario=input.nextDouble();


        if(salario<=15000) {
            System.out.println("taxa 20%: " + (salario*0.2)); //salario ate 15000

        } if(salario>15000 && salario<=20000) { //salario entre 15000 e 20000
            System.out.println("taxa 30%: "+(salario*0.3));

        } if(salario>=20000 && salario<=25000) { //salario entre 20000 e 25000
            System.out.println("taxa 35%: "+(salario*0.35));

        }if(salario>25000) {
            System.out.println("taxa 40%: "+(salario*0.4)); //salario superior ou igual a 25k
        }
    }
}


