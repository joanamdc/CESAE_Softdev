package FichaPratica03;

public class Ex_02 {
    public static void main(String[] args) {

        int numeroPar=1;


        while (numeroPar <= 400) {
            if(numeroPar%2==0){
                System.out.println(numeroPar);
            }

            numeroPar = numeroPar + 1;
        }

        // OU PODEMOS FAZER NUMA FORMA MAIS SIMPLES QUE É:
        // public static void main(String[] args) {
        //        Scanner input = new Scanner(System.in);
        //        int numeroPar=2;
        //   while (numeroPar <= 400) {
        // System.out.println(numeroPar);
        // numeroPar = numeroPar + 2;




    }
}
