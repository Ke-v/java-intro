package com.kevin;

public class Conditions {
    public static void main(String[] args) {
        int age = 46;
        if(age < 13)
        {
            System.out.println("You're a kid");
        }
        else if (age>=13 && age<=19)
        {
            System.out.println("You're a teenager");
        }
        else if (age>=20 && age<=35)
        {
            System.out.println("You're a youth");
        }
        else if (age>=36 && age<=55)
        {
            System.out.println("You are middle age");
        }
        else{
            System.out.println("You are old");
        }

    }
}
