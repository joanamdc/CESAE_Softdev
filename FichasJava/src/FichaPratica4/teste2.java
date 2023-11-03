package FichaPratica4;

public class teste2 {
    public static void main(String[] args) {
        String opcao="1";

        switch (opcao) {

            case "1":
                if(opcao.equals("2")){
                    System.out.println("prim opca");
                }
                break;
            case "2":
                if(opcao.equals("1")){
                    System.out.println("seg opcao");
                }
                break;

            default:
                System.out.println("Invalida");
        }

    }
}
