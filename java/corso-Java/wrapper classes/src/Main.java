/*
le wrapper classes permettono di utilizzare dei dati primitivi come reference
boolean --> Boolean
char --> Character
int --> Integer
double --> Double
i primitivi non fanno utilizzare i metodi, a differenza delle reference

wrapper classes: primitive impacchettate come reference, così che siano utilizzabili
i metodi; quando è necessario effettuate delle operazioni, queste vegnono spacchettate
e trattate com evere e proprie primitive.
svantaggio: reference sono molto più lente delle primitive;
*/

/*spacchetta per operazioni, rimpacchetta quando servono i metodi*/
public class Main {
    public static void main(String[] args) {

        Boolean vero = true;
        Character carattere = 'a';
        Integer numero = 5;
        Double virgola = 5.23;
        String stringa = "hello world";

        boolean a = true;
        char b = 'a';
        int c = 5;
        double d = 5.23;

        if (vero==a) {
            /*java prende il Boolean (vero), lo rende (spacchetta)
             un boolean e lo confronta con a;
             sono uguali e questo vale con tutte le wrapped classes;
             */

            System.out.println("prova");
        }


    }
}