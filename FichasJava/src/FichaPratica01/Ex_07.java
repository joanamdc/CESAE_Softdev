package FichaPratica01;

import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, precoTotal, desconto;

        System.out.print("Insira preco1: ");
        preco1= input.nextDouble();

        System.out.print("Insira preco2: ");
        preco2= input.nextDouble();

        System.out.print("Insira preco3: ");
        preco3= input.nextDouble();

        precoTotal = (preco1+preco2+preco3);

        System.out.println("Preco Total " + precoTotal);

        desconto = precoTotal * 0.9;

        System.out.println("Desconto " + desconto);








    }
}
