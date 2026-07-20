package org.example.String_1;

public class nonStart {
    public static void main(String[] args) {
        nonStart obj = new nonStart();
        System.out.println(obj.nonStart("hello", "there"));
    }
    public String nonStart(String a, String b){
        return a.substring(1).concat(b.substring(1));

    }
}
