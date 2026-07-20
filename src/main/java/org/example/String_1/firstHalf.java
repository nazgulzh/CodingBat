package org.example.String_1;

public class firstHalf {
    public static void main(String[] args) {
        firstHalf obj = new firstHalf();
        System.out.println(obj.firstHalf("HelloThere"));
    }
    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }

}
