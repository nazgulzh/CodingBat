package org.example.String1;

public class helloName {
    public static void main(String[] args) {
        helloName obj = new helloName();
        System.out.println(obj.helloName("Bob"));

    }
    public String helloName(String name) {
        return "Hello " + name + "!";

    }
}
