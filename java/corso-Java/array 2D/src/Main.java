public class Main {
    public static void main(String[] args) {
        String[][] classi = new String[3][3];

        // array 0
        classi[0][0] = "Luca";
        classi[0][1] = "Anna";
        classi[0][2] = "Marco";

        // array 1
        classi[1][0] = "Edoardo";
        classi[1][1] = "Leonardo";
        classi[1][2] = "Antonio";

        // array 2
        classi[2][0] = "Giovanni";
        classi[2][1] = "Franco";
        classi[2][2] = "Davide";
        /*
                       0           1           2
        classe 0 --> Luca       Anna         Marco
        classe 1 --> Edoardo    Leonardo     Antonio
        classe 2 --> Giovanni   Franco       Davide

        
         */


        for (int classe = 0; classe < classi.length; classe++) {
            for (int studente = 0; studente < classi[classe].length; studente++) {
                System.out.print(classi[classe][studente] + " ");
            }
            System.out.println();
        }

        String [][] classi2 = {
                {"Luca", "Anna", "Marco"},
                {"Edoardo", "Leonardo", "Antonio"},
                {"Giovanni", "Franco", "Davide"},
        };

        System.out.println();
        for (int i = 0; i < classi2.length ; i++) {
            for (int j = 0; j < classi2[i].length; j++) {
                System.out.print(classi2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("con il for each è più semplice: ");


        for(String[] classe: classi){
            for(String studente: classe){
                System.out.print(studente + " ");
            }
            System.out.println();
        }




    }
}