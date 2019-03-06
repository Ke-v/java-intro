package com.kevin;

public class Functions {
    public double volumeSphere(double radius, double height){
        double volume = 22/7 * radius * radius * height;
        return volume;
    }
    public static double areaCircle(double radius){
        double area = 22/7 * radius * radius;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args) {
        //objects == variables
        Functions f = new Functions();
        System.out.println(f.volumeSphere(5,7));


        /*areaCircle(14);
        areaCircle(645123);
        areaCircle(534.564);

        double result = areaCircle(21.);
        System.out.println(result);
        System.out.println(Math.round(result));*/

    }
}
