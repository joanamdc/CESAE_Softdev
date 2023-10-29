package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {

    //Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
    //(montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
    //mantém positivo depois da operação

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, movimento, saldoFinal;

        //ler saldo
        System.out.println("Saldo: ");
        saldo = input.nextDouble();

        // Ler montante a movimentar
        System.out.println("Movimento: ");
        movimento = input.nextDouble();

        // Calcular saldo final, saldo apos movimento
        saldoFinal = saldo + movimento;

        if (saldoFinal >= 0) {
            System.out.println("Operação é valida. Saldo final: " + saldoFinal);
        } else {
            System.out.println("Operação final é invalida. Saldo Final: " + saldo);

        }
    }
}