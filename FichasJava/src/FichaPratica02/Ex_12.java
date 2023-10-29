package FichaPratica02;

import java.util.Scanner;

public class Ex_12 {
    //Implemente um programa de menu (opções do menu: 1. Criar 2. Atualizar 3. Eliminar 4. Sair). Se uma das opções
    //1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada. Caso a opção for
    //inválida, deve informar o utilizado

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        //imprimir as opçoes
        System.out.println("1. Criar");
        System.out.println("2. Atualizar");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair");

        //ler opçao

        System.out.println("Opçao: ");
        opcao= input.nextInt();

        // fazer um switch case

        switch (opcao){
            case 1:
                System.out.println("*****Criar*****");
                break;
            case 2:
                System.out.println("*****Atualizar*****");
                break;
            case 3:
                System.out.println("*****Eliminar*****");
                break;
            case 4:               // sair - mesmo que no exercicio nos diga que se utilizador carregar no 4 e nao fizer nada,
                                    // temos de colocar porque faz parte da equação, senão vai-nos passar um valor para default
                break;

            default:
                System.out.println("Opçao Invalida");

        }








    }
}
