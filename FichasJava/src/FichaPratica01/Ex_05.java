package FichaPratica01;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3, media, mediaPon;

        System.out.print("Insira um numero: ");
        num1= input.nextDouble();

        System.out.print("Insira um numero: ");
        num2= input.nextDouble();

        System.out.print("Insira um numero: ");
        num3= input.nextDouble();

        // calcular media
        media = (num1+num2+num3)/3;

       //apresentar media
        System.out.println("Media " + media);

        // calcular media ponderada
        mediaPon = (num1*0.2)+(num2*0.3)+(num3*0.5);

        //apresentar media
        System.out.println("Media Ponderada " + mediaPon);

    }
}
