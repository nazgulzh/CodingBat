package org.example.String_1;

public class makeAbba {
    public static void main(String[] args) {
        makeAbba obj = new makeAbba();
        System.out.println(obj.makeAbba("a","b"));
    }
    public String makeAbba(String a, String b) {
        return  a + b +b + a;
    }

}
