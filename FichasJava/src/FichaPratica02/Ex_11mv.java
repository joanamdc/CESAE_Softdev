package FichaPratica02;

import java.util.Scanner;

public class Ex_11mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int saldo, movimento, saldoFinal;

        System.out.println("Introduza saldo: ");
        saldo= input.nextInt();

        System.out.println("Valor a movimentar: ");
        movimento= input.nextInt();

        saldoFinal=saldo+movimento;

        if(saldo>=movimento){
            System.out.println("Operação válida! Saldo final: "+saldoFinal);
        }if(saldo<movimento){
            System.out.println("Operação Invalida. Saldo Insuficiente. Saldo atual: "+saldo);
        }



    }
}
