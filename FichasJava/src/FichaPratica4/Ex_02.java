package FichaPratica4;

import java.util.Scanner;

public class Ex_02 {

    //implemente um programa que leia as opçoes do menu desejadas(opçoes: 1. criar. 2. atualizar, 3. eliminar, 4.sair)
    //se uma das opçoes 1,2 e 3 for escolhida, devera apresentar um tecto com a opçao escolhida. caso a escolha esteja
    //fora das opçoes validas, devera informar o utilizador. De seguida devera apresentar novamente o menu para poder
    // selecionar novas opçoes ate que a opçao escolhida seja a 4.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcoes;

        do {
            System.out.println("1. Criar ");
            System.out.println("2. Atualizar ");
            System.out.println("3. Eliminar ");
            System.out.println("4. Sair ");

            //LER OPÇAO
            System.out.println("Insira uma opção: ");
            opcoes = input.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("Escolheu a opçao Criar");
                    break;

                case 2:
                    System.out.println("Escolheu a opçao Atualizar");
                    break;

                case 3:
                    System.out.println("Escolheu a opçao Eliminar");
                    break;

                case 4:
                    System.out.println("Escolheu a opçao Sair");
                    break;

                default:
                    System.out.println("Opção Invalida");


                    //a partir daqui se a opção 1, 2 ou 3 for escolhida temos de apresentar um teto com a opçao de escolha

            }

        }while (opcoes!=4);
    }
}



