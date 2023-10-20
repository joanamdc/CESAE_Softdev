package FichaPratica01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, area, perimetro;

        System.out.print("Insira a altura: ");
        num1= input.nextInt();

        System.out.print("Insira a largura: ");
        num2= input.nextInt();

        //calcular area
        area = num1*num2;

        // apresentar area
        System.out.println("area: " + area);

        //calcular perimetro
        perimetro = 2 * (num1+num2);

        // apresentar perimetro
        System.out.println("perimetro: " + perimetro);




    }
}
