package FichaPratica02;

import java.util.Scanner;

public class Ex_14 {

    // Escreva um programa que leia 3 números, seguidamente deve colocar os números no ecrã por ordem !!!crescente!!!

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.println("Inserir numero: ");
        a= input.nextInt();
        System.out.println("Inserir numero: ");
        b= input.nextInt();
        System.out.println("Inserir numero: ");
        c= input.nextInt();

        //ver logica no print que o vitor nos mandou

        if(a<b && a<c) { //a ... ... ja sabemos que o menor é o a, agora temos de decidir entre b e c
          if(b<c) {      // a b c
              System.out.println(a+" "+b+" "+c);
          }else{         // a c b
              System.out.println(a+" "+c+" "+b);
          }
        }
          if(b<a && b<c) { //b ... ... b é o menor
          if(a<c) {
           System.out.println(b+" "+a+" "+c);
        } else {
        System.out.println(b+" "+c+" "+a);
    }
}
          if(c<a && c<b) { //c ... ... c é o menor
          if(a<b){
        System.out.println(c+" "+a+" "+b);
          } else {
        System.out.println(c+" "+b+" "+a);
    }
}


    }
}
