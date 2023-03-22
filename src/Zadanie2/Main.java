package Zadanie2;

public class Main {
    public static void main(String[] args) {

        CaesarCode caesarCode = new CaesarCode();
        String message = "ABCD, abcd, XYZA, xyza";
        System.out.println("Oryginalna wiadomość: " + message);
        String encoded = caesarCode.encode(-2, message);
        System.out.println("Po zaszyfrowaniu: " + encoded);
        String decoded = caesarCode.decode(-2, encoded);
        System.out.println("Po odszyfrowaniu: " + decoded);

    }
}
