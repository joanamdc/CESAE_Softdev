package FichaPratica02;

import java.util.Scanner;

public class Ex_06mv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Valor 1: ");
        num1= input.nextInt();

        System.out.println("Valor 2: ");
        num2= input.nextInt();

        if(num1>num2){
            System.out.println(num1+" "+num2);
        }else{
            System.out.println(num2+" "+num1);
        }






}}
