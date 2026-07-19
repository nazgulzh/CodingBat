package org.example.String_1;

public class makeOutWord {
    public static void main(String[] args) {
        makeOutWord obj = new makeOutWord();
        System.out.println(obj.makeOutWord("Woo", "hoo"));
    }
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);
    }

}
