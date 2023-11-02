package FichaPratica01;

import java.util.Scanner;

public class Ex_05mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2, valor3, mediaArit, mediaPond;

        System.out.print("Insira valor 1: ");
        valor1= input.nextDouble();

        System.out.print("Insira valor 2: ");
        valor2= input.nextDouble();

        System.out.print("Insira valor 3: ");
        valor3= input.nextDouble();

        mediaArit=(valor1+valor2+valor3)/3;
        System.out.println("Media aritmetica: "+mediaArit);

        mediaPond=(valor1*0.2)+(valor2*0.3)+(valor3*0.5);
        System.out.println("Media Ponderada: "+mediaPond);
    }
}
