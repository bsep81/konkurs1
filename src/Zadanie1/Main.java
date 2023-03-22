package Zadanie1;

public class Main {
    public static void main(String[] args) {
        String input = "?abc DEF, ZYX. zxy!";
        System.out.println("String wejściowy:\n" + input);
        System.out.println("Pojedyncze szyfrowanie:");
        System.out.println(rot13(input));
        System.out.println("Podwójne szyfrowanie jednoznaczne z deszyfrowaniem:)");
        System.out.println(rot13(rot13(input)));
    }

    static String rot13(String input){
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < input.length(); i++ ){
            char c = input.charAt(i);
            if((c >= 65 && c <= 77)||(c >= 97 && c <= 109)){
                c += 13;
            } else if((c >= 78 && c <= 90)||(c >= 110 && c <= 122)){
                c -= 13;
            }
            output.append(c);
        }
        return output.toString();
    }
}
