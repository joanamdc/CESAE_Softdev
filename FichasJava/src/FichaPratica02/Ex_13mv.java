package FichaPratica02;

import java.util.Scanner;

public class Ex_13mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.print("Introduza as horas: ");
        horas= input.nextInt();

        System.out.print("Introduza os minutos: ");
        minutos= input.nextInt();

        if(horas<=12){
            System.out.println(horas+":"+minutos+"AM");
        }else{
            horas=horas-12;
            System.out.println(horas+":"+minutos+"PM");
        }
    }
}
