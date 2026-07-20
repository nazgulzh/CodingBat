package org.example.String_1;

public class extraEnd {
    public static void main(String[] args) {
        extraEnd obj = new extraEnd();
        System.out.println(obj.extraEnd("hello"));
    }
    public String extraEnd(String str) {
        String word = str.substring(str.length()-2);
        return word+word+word;
    }

}
