// array
public class Main {
    public static void main(String[] args) {
//        dichiarazione: tipo degli elementi dell' array (int) + nome dell' array (numeri) + [] =
//        new + tipo degli elementi (int) + [dimensione]

        // creazione array vuoto con scelta della dimensione

        int[] numeri = new int[3];
        numeri [0] = 10;
        numeri [1] = 20;
        numeri [2] = 30;
        System.out.println("con for each:");

        for (int numero:numeri) {
            System.out.println(numero);
        }

        //OPPURE

        System.out.println();
        System.out.println("con fori:");




        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        System.out.println();
        System.out.println();

        // creazione array con elementi

        String[] giochi = {"minecraft", "fortnite", "rocket league", "fifa"};
        System.out.println("giochi:");
        for (int i = 0; i < giochi.length; i++) {
            System.out.println(i + ") " + giochi[i]);
        }

        System.out.println();

        System.out.println("ultimo elemnto dell' array: ");
        System.out.println(giochi[giochi.length-1]);


    }
}