package FichaPratica01;

import java.util.Scanner;

public class Ex_04mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

double pi=3.14, area, raio;

        System.out.print("Insira o raio: ");
        raio= input.nextDouble();

        area=pi*(raio*raio);
        System.out.print("Area: "+ area);

    }

}
