package ru.mirea.inbo02.laba2;

public class testball {
    public static void main(String[] args) {
        ball b1 = new ball(50, 50);
        System.out.println(b1);
        b1.move(25, 10);
        System.out.println(b1);
    }
}