package org.example.String_1;

public class withoutEnd {
    public static void main(String[] args) {
        withoutEnd obj = new withoutEnd();
        System.out.println(obj.withoutEnd("hello"));
    }

    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

}
