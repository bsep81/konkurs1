package Zadanie2;

public class CaesarCode {

    public String encode(int key, String message){
        key = key % 26;
        if (key > 0){
            message = positiveKey(key, message);
        }else if(key < 0 ){
            message = negativeKey(key, message);
        }
        return message;
    }

    public String decode(int key, String message){
        key = key % 26;
        if (key > 0){
            message = negativeKey(-key, message);
        }else if(key < 0 ){
            message = positiveKey(-key, message);
        }
        return message;
    }

    private String positiveKey(int key, String message){
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < message.length(); i++ ){
            char c = message.charAt(i);
            if((c >= 65 && c <= 90 - key)||(c >= 97 && c <= 122 - key)){
                c += key;
            } else if((c > 90 - key && c <= 90)||(c >= 122 - key && c <= 122)){
                c =(char)(c - 26 + key);
            }
            output.append(c);
        }
        return output.toString();
    }

    private String negativeKey(int key, String message){
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < message.length(); i++ ){
            char c = message.charAt(i);
            if((c >= 65 - key && c <= 90)||(c >= 97 - key && c <= 122)){
                c += key;
            } else if((c >= 65 && c < 65 - key)||(c >= 97 && c < 97 - key)){
                c =(char)(c + 26 + key);
            }
            output.append(c);
        }
        return output.toString();
    }
}
