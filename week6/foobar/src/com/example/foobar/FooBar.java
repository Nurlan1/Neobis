package com.example.foobar;

public class FooBar {
    public static void main(String args []) {
        if(Integer.valueOf(args[0])%2==0) System.out.println("foo"+args[0]);
        else System.out.println("bar"+args[0]);
    }
}
