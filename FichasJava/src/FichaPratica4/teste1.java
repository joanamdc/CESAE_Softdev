package FichaPratica4;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota;

        System.out.println("Insira nota: ");
        nota= input.nextDouble();

        if(nota>=18) {
            System.out.println("Excelente");
        }if (nota>=15){
            System.out.println("Muitob");
        }if(nota>=12) {
            System.out.println("bom");
        }if(nota>=9.5) {
            System.out.println("suf");
        }else {
            System.out.println("neg");




    }}}
