package FichaPratica01;

import java.util.Scanner;

public class Ex_03mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double comprimento, largura, area, perimetro; //area=compr*largur, perimetro é 2*(comprimento+largura)

        System.out.print("Comprimento do retangulo: ");
        comprimento= input.nextDouble();

        System.out.print("Largura do retangulo: ");
        largura= input.nextDouble();

        area=comprimento*largura;
        System.out.println("Area: "+area);

        perimetro=2*(comprimento+largura);
        System.out.println("Perimetro: "+perimetro);
    }
}
