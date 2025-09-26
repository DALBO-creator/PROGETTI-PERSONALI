//        SWITCH
public class Main {
    public static void main(String[] args) {
        String nome = "francesco";
        switch(nome) {
            case "Luca":
                System.out.println("Ciao Luca");
                break;
            case "Marco":
                System.out.println("Ciao Marco");
                break;
            case "Anna":
                System.out.println("Ciao Anna");
                break;
            case "Antonio":
                System.out.println("Ciao Antonio");
                break;
            case "Edoardo":
                System.out.println("Ciao Edoardo");
                break;
            default:
                System.out.println("Ciao chiunque tu sia");

                // default: qualsiasi altro caso diverso da quelli elencati
        }
    }
}
