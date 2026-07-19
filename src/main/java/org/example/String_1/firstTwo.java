package org.example.String_1;

public class firstTwo {
    public static void main(String[] args) {
        firstTwo obj = new firstTwo();
        System.out.println(obj.firstTwo("Hello"));
    }
    public String firstTwo(String str) {
        if (str.length()>2) {
            return str.substring(0, 2);
        }else {
            return str;
        }
    }
}
