package com.cybertek.utilities;

public class Example {

    public static void main(String[] args) {
        String one = Singleton.get();
        System.out.println("one = " + one);

        String two = Singleton.get();

        System.out.println("two = " + two);

        String tree = Singleton.get();
        System.out.println("tree = " + tree);


    }

}
