package FichaPratica02;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Insere numero: ");
        numero=input.nextInt();

        //avaliar se é par

        if(numero % 2==0) {                     //temos que ver sempre o resto da divisão, porque no caso de ser numero par dá sempre
                                                // para dividir por duas pessoas. bem como da para fazer os multiplos dos numeros.
            System.out.println("É par! ");      // temos sempre de utilizar o 2
        } else
            System.out.println("É impar! ");
    }
}
