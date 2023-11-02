package FichaPratica02;

import java.util.Scanner;

public class Ex_16mv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, qtdNotas;

        System.out.println("Insira um valor em €: ");
        valor = input.nextInt();

        if (valor%5==0) {
            qtdNotas=valor/200;
            System.out.println("Quantidade de notas de 200: "+qtdNotas);
            valor=valor%200;

            qtdNotas=valor/100;
            System.out.println("Quantidade de notas de 100: "+qtdNotas);
            valor=valor%100;

            qtdNotas=valor/50;
            System.out.println("Quantidade de notas de 50: "+qtdNotas);
            valor=valor%50;

            qtdNotas=valor/20;
            System.out.println("Quantidade de notas de 20: "+qtdNotas);
            valor=valor%20;

            qtdNotas=valor/10;
            System.out.println("Quantidade de notas de 10: "+qtdNotas);
            valor=valor%10;

            qtdNotas=valor/5;
            System.out.println("Quantidade de notas de 5: "+qtdNotas);
            valor=valor%5;

        }else{
            System.out.println("Valor"+" "+valor+"Não é multiplo de 5");
        }

    }
}
