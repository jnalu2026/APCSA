package com.mycompany.radiuscalc;

/**
 *
 * @author JNalu2026
 */
import java.util.Scanner;

public class RadiusCalc {

    /**
     * @param args the command line arguments
     */
    //carry out calculations or circular items
    //such as a circle, a sphere, a cone, a column
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("""
                           This program calculates round item numbers such as 
                           1 - Area of a circle (pi r^2)
                           2 - Volume of a sphere (4/3 pi r^3)
                           3 - Volume of a cone (pi r^2 h/3)
                           4 - Volume of a column (pi r^2 h)""");
        System.out.println("Type the number for which one you want to calculate");
        int i = s.nextInt();
        switch (i) {
            case 1 -> cCalc();
            case 2 -> sCalc();
            case 3 -> cCalc2();
            case 4 -> cCalc3();
            default -> {
            }
        }
    }
    
    public static void cCalc3(){
        Scanner s2 = new Scanner(System.in);
        System.out.println("enter the radius of your column: ");
        int r = s2.nextInt();
        System.out.println("enter the height now: ");
        Scanner s6 = new Scanner(System.in);
        int h = s6.nextInt();      
        double result = (Math.PI * Math.pow(r, 2) * h);
        System.out.println(result);
    }
    
    public static void cCalc2(){
        Scanner s3 = new Scanner(System.in);
        System.out.println("enter the radius of your cone:");
        int r = s3.nextInt();
        System.out.println("Enter the height now: ");
        Scanner s7 = new Scanner (System.in);
        int h = s7.nextInt();
        double result = (Math.PI * Math.pow(r, 2) * h/3);
        System.out.println(result);
    }
    
    public static void cCalc(){
        Scanner s4 = new Scanner(System.in);
        System.out.println("enter the radius of your circle");
        int r = s4.nextInt();
        double result = Math.PI * Math.pow(r, 2);
        System.out.println(result);
    }
    
    public static void sCalc(){
        Scanner s5 = new Scanner(System.in);
        System.out.println("enter the radius of your circle");
        int r = s5.nextInt();
        double result = (4/3) * Math.PI * Math.pow(r, 3);
        System.out.println(result);
    }
}
