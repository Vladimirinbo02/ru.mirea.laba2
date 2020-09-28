package ru.mirea.inbo02.laba2;

public class testauthor {
    public static void main(String[] args) {
        author ahTeck = new author("Tan Ah Teck", "teck@nowhere.com", 'm');
        System.out.println(ahTeck); // toString()
//Tan Ah Teck (m) at teck@nowhere.com

// Test Setters and Getters
        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck); // toString()
//Tan Ah Teck (m) at teck@somewhere.com
        System.out.println("name is: " + ahTeck.getName());
//name is: Tan Ah Teck
        System.out.println("gender is: " + ahTeck.getGender());
//gender is: m
        System.out.println("email is: " + ahTeck.getEmail());
//email is: teck@somewhere.com
    }
}