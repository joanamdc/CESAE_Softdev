package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor, quantidadeNotas;

        System.out.println("Introduzir valor: ");
        valor= input.nextInt();



        if(valor%5==0) { //multiplo de 5
            quantidadeNotas = valor/200;
            System.out.println("Quantidade de notas de 200: "+quantidadeNotas);
            valor=valor%200;

            quantidadeNotas = valor/100;
            System.out.println("Quantidade de notas de 100: "+quantidadeNotas);
            valor=valor%100;

            quantidadeNotas = valor/50;
            System.out.println("Quantidade de notas de 50: "+quantidadeNotas);
            valor=valor%50;

            quantidadeNotas = valor/20;
            System.out.println("Quantidade de notas de 20: "+quantidadeNotas);
            valor=valor%20;

            quantidadeNotas = valor/10;
            System.out.println("Quantidade de notas de 10: "+quantidadeNotas);
            valor=valor%10;

            quantidadeNotas = valor/5;
            System.out.println("Quantidade de notas de 5: "+quantidadeNotas);
            valor=valor%5;

        }else{
            System.out.println("Valor"+" "+ valor +" "+"nao e multiplo de 5");
        }
    }
}
