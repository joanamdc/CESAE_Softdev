package FichaPratica02;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaPond;

        //ler notas:
        System.out.println("Nota1: ");
        nota1= input.nextDouble();

        System.out.println("Nota 2: ");
        nota2= input.nextDouble();

        System.out.println("Nota 3: ");
        nota3= input.nextDouble();

        //calcular media ponderada
        mediaPond=(nota1*0.25)+(nota2*0.35)+(nota3*0.4);

        //apresentar a media ponderada para nos certeficarmos se as contas estão a ser bem calculadas ou não
        System.out.println(" Media ponderada: "+ mediaPond);

        //Avaliar se está aprovado ou não
        if (mediaPond>9.5){
            System.out.println("Está aprovado!" );
        }else
            System.out.println("Está reprovado! ");




    }
}
