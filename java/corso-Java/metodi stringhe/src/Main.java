/*metodi stringhe: equals, equalsIgnoreCase, length, charAt,
indexOf, isEmpty, toUpperCase, toLowerCase,
trim, replace*/
public class Main {
    public static void main(String[] args) {
        String nome = "Leonardo";
//        boolean risultato= nome.equals("Leonardo"); //case sensitive (Maiusc, Minusc)
//        boolean risultato = nome.equalsIgnoreCase("LEOnardo"); //non case sensitive
//        int risultato = nome.length(); //lunghezza
//        char risultato = nome.charAt(0); //carattere in posizione tra ()
//        int risultato = nome.indexOf('o'); //posizione del char tra ()
        int risultato = nome.indexOf('o', 4); //(char da cercare, indice da cui partire)-->
                                                           // ci sono 2 'o', se non avessi messo il secondo
                                                           // campo, ovvero il fromIndex, mi avrebbe
                                                           // restituito la prima occorrenza.
//        boolean risultato = nome.isEmpty(); //è una stringa vutoa ("")? true or false
//        String risultato = nome.toUpperCase(); //trasforma in maiuscolo
//        String risultato = nome.toLowerCase(); //trasforma in minuscolo
//        String risultato = nome.trim(); //elimina tutti gli spazi prima e dopo una stringa
//        String risultato = nome.replace('o', 'w'); //sostituisce tutte le occorrenze di un carattere
                                                     //leonardo-->lewnardw

        System.out.println(risultato);

    }
}