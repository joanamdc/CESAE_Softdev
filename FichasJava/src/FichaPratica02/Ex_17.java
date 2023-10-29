package FichaPratica02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoMedio;

        System.out.println("Saldo Medio: ");
        saldoMedio= input.nextDouble();

        if(saldoMedio<=2000) {
            System.out.println("Nenhum crédito");

        } if(saldoMedio>2000 && saldoMedio<=4000) {
            System.out.println("Credito 20%: "+(saldoMedio*0.2));

        } if(saldoMedio>4000 && saldoMedio<=6000) {
            System.out.println("Credito 30%: " + (saldoMedio * 0.3));

        } if(saldoMedio>6000) {
            System.out.println("Credito 40%: " + (saldoMedio * 0.4));
        }
    }
}


