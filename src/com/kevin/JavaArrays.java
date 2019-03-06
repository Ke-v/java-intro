package com.kevin;

public class JavaArrays {
    public static void main(String[] args) {
        //immutable --cannot be added to or removed from
        int marks[] = {78,44,89,23,55,66,33,44,55,52,22,44,88,66,55};
        String names[] = {"Kim","Jim","Joan","Jack","Jerry"};
        System.out.println(marks[9]);
        try{
            System.out.println(names[50]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error while fetching the name");
        }

    }
}
