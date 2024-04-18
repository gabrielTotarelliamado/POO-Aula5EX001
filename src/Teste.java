public class Teste {
    public static void main(String[] args) {

        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Início do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    public static void metodo2() {
        System.out.println("Início do método 2");
        int[] vetor = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                vetor[i] = i;
                System.out.println(i);
                if (i == 9) {
                    try{
                        int vlr = vetor[i] / vetor[0];
                        System.out.println(vlr);
                    } catch(ArithmeticException e){
                        // System.err.println(e.getMessage());
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            // System.err.println(e.getMessage());
        }
        System.out.println("Fim do método 2");
    }
}