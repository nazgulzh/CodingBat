package org.example.String_1;

public class left2 {
    public static void main(String[] args) {
        left2 obj = new left2();
        System.out.println(obj.left2("hello"));
    }
    public String left2 (String str){
        String str1 = str.substring(2);
        String str2 = str.substring(0,2);
        return str1 + str2;
    }
}
