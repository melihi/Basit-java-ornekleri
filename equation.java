package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner k =new Scanner(System.in);
        double  sonuc;
        System.out.println("ax^2+bx+c şeklindeki denkeliminiz olamlı");
        System.out.println("a degeri gir");
        double a = k.nextDouble();
        System.out.println("b degeri gir");
        double b = k.nextDouble();
        System.out.println("c degeri gir");
        double c =k.nextDouble();
        System.out.println("Hesaplanıyor");
        double delta=(b*b)-(4*a*c);
        //if (delta <0){
        //    System.out.println("Denklemde D<0 kok yok");
       // }
        if(delta ==0){
            sonuc =(-1*b)/2*a;
            System.out.println(sonuc);
        }
        if (delta >0){
            double x1,x2;
            x1 = (-1*b) - (Math.sqrt(delta)) / (2 * a);
            x2 = (-1*b) + (Math.sqrt(delta)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
        if (delta < 0){
            System.out.println("kok yok");
        }




    }
}
