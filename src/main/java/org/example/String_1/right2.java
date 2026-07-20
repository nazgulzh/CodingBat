package org.example.String_1;

public class right2 {
    public static void main(String[] args) {
        right2 obj = new right2();
        System.out.println(obj.right2("hello"));
    }
    public String right2(String str) {
        int str1 = str.length()-2;
        String lastTwo = str.substring(str1);
        String str2= str.substring(0,str1);
        return lastTwo + str2;
    }


}
