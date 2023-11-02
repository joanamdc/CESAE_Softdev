package FichaPratica02;

import java.util.Scanner;

public class Ex_08mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaPond;

        System.out.print("Insira Nota 1: ");
        nota1= input.nextDouble();

        System.out.print("Insira Nota 2: ");
        nota2= input.nextDouble();

        System.out.print("Insira Nota 3: ");
        nota3= input.nextDouble();

        mediaPond= (nota1*0.25)+(nota2*0.35)+(nota3*0.4);
        System.out.println("Media Ponderada: "+mediaPond);

        if(mediaPond>=9.5 && mediaPond<=20){
            System.out.println("Está Aprovade! Parabuens!");
        }else{
            System.out.println("Reprovado!");
        }






    }
}
