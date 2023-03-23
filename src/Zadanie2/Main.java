package Zadanie2;

public class Main {
    public static void main(String[] args) {

        CaesarCode caesarCode = new CaesarCode();
        String message = "Borysław Sęp zżź";
        caesarCode.initializeKey(-321);
        System.out.println("Oryginalna wiadomość: " + message);
        String encoded = caesarCode.encode(message);
        System.out.println("Po zaszyfrowaniu: " + encoded);
        String decoded = caesarCode.decode(encoded);
        System.out.println("Po odszyfrowaniu: " + decoded);

    }
}
