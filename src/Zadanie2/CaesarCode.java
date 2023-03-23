package Zadanie2;

import java.util.HashMap;
import java.util.Map;

public class CaesarCode {
    private final String POLISH_ALPHABET_LOWERCASE = "aąbcćdeęfghijklłmnńoóprsŚtuwyzżź";
    private final String POLISH_ALPHABET_UPPERCASE = "AĄBCĆDEĘFGHIJKLŁMNŃOÓPRSŚTUWYZŻŹ";
    private Map<Character, Character> encodings = new HashMap<>();
    private Map<Character, Character> decodings = new HashMap<>();
    private int key;

    void initializeKey(int key) {
        this.key = key % 32;

        if(key < 0){
            for(int i = 0; i < 32; i++){
                encodings.put(POLISH_ALPHABET_LOWERCASE.charAt(i), POLISH_ALPHABET_LOWERCASE.charAt((i + this.key + 32) % 32));
                encodings.put(POLISH_ALPHABET_UPPERCASE.charAt(i), POLISH_ALPHABET_UPPERCASE.charAt((i + this.key + 32) % 32));
            }
        }else {
            for (int i = 0; i < 32; i++) {
                encodings.put(POLISH_ALPHABET_LOWERCASE.charAt(i), POLISH_ALPHABET_LOWERCASE.charAt((i + key) % 32));
                encodings.put(POLISH_ALPHABET_UPPERCASE.charAt(i), POLISH_ALPHABET_UPPERCASE.charAt((i + key) % 32));
            }
        }


        for (char c : encodings.keySet()) {
            decodings.put(encodings.get(c), c);
        }
    }

    public String encode(String message) {
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (encodings.containsKey(c)) {
                sb.append(encodings.get(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String decode(String message) {
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (decodings.containsKey(c)) {
                sb.append(decodings.get(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }


}
