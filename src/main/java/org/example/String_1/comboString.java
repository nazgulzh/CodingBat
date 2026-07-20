package org.example.String_1;

public class comboString {
    public static void main(String[] args) {
        comboString obj = new comboString();
        System.out.println(obj.comboString("Hello", "hi"));
    }
    public String comboString(String a, String b){
        if(a.length()<b.length()){
            return a + b + a;
        }else {
            return b+a+b;
        }

    }
}
