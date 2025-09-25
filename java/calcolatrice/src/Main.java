import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("Scegli un'operazione:");
            System.out.println("1. Somma");
            System.out.println("2. Sottrazione");
            System.out.println("3. Moltiplicazione");
            System.out.println("4. Divisione");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");
            scelta = in.nextInt();

            if (scelta >= 1 && scelta <= 4) {
                System.out.print("Inserisci il primo numero: ");
                double a = in.nextDouble();
                System.out.print("Inserisci il secondo numero: ");
                double b = in.nextDouble();

                switch (scelta) {
                    case 1:
                        System.out.println("Risultato: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Risultato: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Risultato: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Risultato: " + (a / b));
                        } else {
                            System.out.println("Errore: divisione per zero!");
                        }
                        break;
                }
            } else if (scelta != 5) {
                System.out.println("Scelta non valida.");
            }

        } while (scelta != 5);

        System.out.println("Programma terminato.");
        in.close();
    }
}
