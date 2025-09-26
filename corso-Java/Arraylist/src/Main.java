/* le arraylist sono array ridimensionabilli, accettano però solo reference (wrapper classes)
creare un Arraylist
aggiungere elementi add()
mandare a schermo elementi get()
modificare elementi set()
rimuovere elementi revove(), clear()
Arraylist 2D
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //creazione:
        ArrayList<String> persone = new ArrayList<String>();
        //aggiunta elementi:

        persone.add("Luca");
        persone.add("Marco");
        persone.add("Anna");
        //stampa a video elementi:


        System.out.println("for each:");

        for(String persona : persone){
            System.out.println(persona);
        }
        System.out.println();

        System.out.println("fori:");
        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));
        }
        System.out.println();

        //modifica elementi:

        persone.set(2, "Davide");     //indice, elemento con cui sostituire

        System.out.println(persone.get(2));
        System.out.println();


        //rimozione un elemento:

        persone.remove(0);
        for(String persona : persone){
            System.out.println(persona);
        }
        System.out.println();



        //pulizia arraylist da tutti gli elementi:

        persone.clear();

        //con altre reference, ad esempio Integer:
        Scanner in = new Scanner(System.in);

        ArrayList<Integer>numeri = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.println("insersici numero con indice " + i);
            numeri.add(in.nextInt());
        }

        for (Integer numero: numeri){
            System.out.println(numero);
        }

        System.out.println();
        System.out.println("con fori");


        //Arraylist 2D:

        ArrayList<ArrayList<String>> classi = new ArrayList<ArrayList<String>>();

        ArrayList <String> classe1 = new ArrayList<String>();

        classe1.add("Luca");
        classe1.add("Marco");

        ArrayList <String> classe2 = new ArrayList<String>();
        classe2.add("Anna");
        classe2.add("Orazio");

        classi.add(classe1);
        classi.add(classe2);

        //fori

        for (int i = 0; i < classi.size() ; i++) {
            for (int j = 0; j < classi.get(i).size() ; j++) {
                System.out.print(classi.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println();

        //foreach

        System.out.println("con foreach");

        for (ArrayList<String>classe: classi){
            for(String studente: classe){
                System.out.print(studente + " ");
            }
            System.out.println();
        }








    }
}