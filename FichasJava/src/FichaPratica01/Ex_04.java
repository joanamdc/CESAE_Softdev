package FichaPratica01;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, pi, area;
        pi = 3.14;


        System.out.print("Insira o raio: ");
        raio= input.nextDouble();

        //calcular area circunf
        area = 2 * pi * raio;

        // apresentar area circ
        System.out.println("Area Circunferencia: " + area);






    }
}
