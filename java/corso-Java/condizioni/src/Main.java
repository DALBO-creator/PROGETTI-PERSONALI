//IF
//ELSE
//ELSE IF
//IF ANNIDATI
//TERNARY OPERATOR
public class Main {
    public static void main(String[] args) {
        // con BOOL
        boolean isOnline = true;
        boolean PrivacyRistretta = false;


        String nome = "Giovanni";
        if (!isOnline) { // if isOnline == false
            System.out.println("non è online");
        } else {
            System.out.println("è online");
        }

        // con INT

        if (33 < 10) {
            System.out.println("33 è minore di 10");
        } else {
            System.out.println("33 è maggiore di 10");
        }

        // con  STRING


        if (nome == "Luca") {
            System.out.println("è Luca");
        } else if (nome == "Marco") {
            System.out.println("Marco");
        } else {
            System.out.println("è qualcun altro");
        }

        // IF ANNIDATI

        PrivacyRistretta = true;
        isOnline = false;

//        if (isOnline) {
//            if (!PrivacyRistretta) {
//                System.out.println("è online");
//            } else {
//                System.out.println("accesso di recente");
//            }
//        }

        // OPPURE

        if (isOnline==true && PrivacyRistretta == false){
            System.out.println("è online");
        } else if (isOnline==true && PrivacyRistretta == true) {
            System.out.println("accesso di recente");
        }else {
            System.out.println("non è online");
        }



        // TERNARY OPERATOR

        // 3 è minore di 10? sì--> x="ciao", no-->x="buongiorno"
        String x = 3 < 10 ? "ciao" : "buongiorno";
        System.out.println(x);
        //3 è minore di 10, quindi x="ciao"


        // OPPURE
//        String x;
//        if (3<10){
//            x = "ciao";
//        } else {
//            x = "buongiorno";
//            }
//        System.out.println(x);



    }
}
