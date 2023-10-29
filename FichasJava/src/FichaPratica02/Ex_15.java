package FichaPratica02;

import java.util.Scanner;

public class Ex_15 {
    //Escreva um programa que leia 3 números, seguidamente deve perguntar ao utilizador se quer ordem crescente
    //‘C’ ou decrescente ‘D’, e deve colocar os números no ecrã por ordem decrescente ou crescente de acordo com a
    //escolha.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            int a,b,c;
            String ordem;

            System.out.println("Inserir numero: ");
            a= input.nextInt();

            System.out.println("Inserir numero: ");
            b= input.nextInt();

            System.out.println("Inserir numero: ");
            c= input.nextInt();

            System.out.println("Crescente (C) ou Decrescente (D) ");
            ordem=input.next();

            switch (ordem){
            case "C": //Crescente

                if(a<b && a<c) {
                    if(b<c) {
                        System.out.println(a+" "+b+" "+c);
                    }else{
                        System.out.println(a+" "+c+" "+b);
                    }
                }
                if(b<a && b<c) {
                    if(a<c) {
                        System.out.println(b+" "+a+" "+c);
                    }else{
                        System.out.println(b+" "+c+" "+a);
                    }
                }
                if(c<a && c<b) {
                    if(a<b) {
                        System.out.println(c+" "+a+" "+b);
                    }else{
                        System.out.println(c+" "+b+" "+a);
                    }
                }
                break;

                case "D": //Decrescente
                    if(a<b && a<c) {
                        if(b<c) {
                            System.out.println(c+" "+b+" "+a);
                        }else{
                            System.out.println(b+" "+c+" "+a);
                        }
                    }
                    if(b<a && b<c) {
                        if(a<c) {
                            System.out.println(c+" "+a+" "+b);
                        }else{
                            System.out.println(a+" "+c+" "+b);
                        }
                    }
                    if(c<a && c<b) {
                        if(a<b) {
                            System.out.println(b+" "+a+" "+c);
                        }else{
                            System.out.println(a+" "+b+" "+c);
                        }
                    }

                    break;

                default:
                    System.out.println("escolha invalida! C para decrescente ou D para decrescente.");
                    break;



        }
    }

}
