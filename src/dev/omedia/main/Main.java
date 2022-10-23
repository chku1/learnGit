package dev.omedia.main;

public class Main {
    public static void main(String[] args) {
        System.out.println(max('x','y')=='y');
    }

    static char max(char a, char b) {
        return a > b ? a : b;
    }
}
