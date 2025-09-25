//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("riga " + i );
            for (int j = 0; j < 5; j++) {
                System.out.println("colonna " + j);
            }
        }

        System.out.println();
        System.out.println();

        //for enanched/ for each
        //numeri è un array di numero

        int[] numeri = {10, 20, 30, 40, 50};
        for (int numero : numeri){
            System.out.println(numero);
        }

        System.out.println();
        System.out.println();

        // break termina il ciclo, continue salta l'iterazione

        for (int i = 0; i < 10 ; i++) {
            if (i==4){
                continue;    // se ì == 4 --> i++, senza eseguire ciò che c'è nel resto del ciclo for
                             // in questo caso i=4 --> ì++ --> i non viene stampata
            }
            System.out.println("i = " + i);

        }

    }
}