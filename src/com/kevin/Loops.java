package com.kevin;

public class Loops {
    public static void main(String[] args) {
        //for while do-while foreach
        for (int i = 0; i < 100; i++){
            System.out.println(i * i);
        }
        ////
        int z = 1;
        while (z<=100)
        {
            System.out.println(z * z);
            z+=5;
        }
        ////
        int k = 100;
        do {
            System.out.println(k);
            k-=5;
        }while (k>0);
        ////
        String [] names = {"John","James","Peter","Jeremy","Pauletta"};
        for (String jina : names)
        {
            System.out.println(jina);
        }
    }
}
