package FichaPratica01;

import java.util.Scanner;

public class Ex_07mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, pagamento, desconto;

        System.out.print("Insira Preço1: ");
        preco1= input.nextDouble();

        System.out.print("Insira Preço2: ");
        preco2= input.nextDouble();

        System.out.print("Insira Preço3: ");
        preco3= input.nextDouble();

        pagamento=preco1+preco2+preco3;
        System.out.println("Valor total a pagar: "+pagamento);

        desconto=pagamento*0.9;
        System.out.println("Desconto 10%: "+desconto);

}

}
