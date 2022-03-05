
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author makra
 */
public class BMIkalk {
    public static void main(String[] args) {
        kiir();
        double tomegkg = bekert();
        double magassagcm = bekerm();
        double BMI = szamol(magassagcm, tomegkg);
        ertekel(magassagcm, tomegkg, BMI);
    }

   static void kiir() {
        System.out.println("Ez a program BMI-t kalkulál");    
    }
   static double bekert() {
      Scanner sc = new Scanner(System.in);
      System.out.print("tömeg kg: ");
      double tomegkg = sc.nextDouble();
      return tomegkg;
    }
    static double bekerm() {
    Scanner sc = new Scanner(System.in);
    System.out.print("magasság cm: ");
    double magassagcm = sc.nextDouble();     
    return magassagcm;
    }
    
    static double szamol(double magassagcm, double tomegkg) {
        double magassagm = magassagcm/100;
//        System.out.println(magassagm);
        double BMI = tomegkg / (magassagm * magassagm);
        
         
        return BMI;
        
    }

    static void ertekel(double magassagcm, double tomegkg, double BMI) {
//        System.out.println("A testmagassság "+ magassagcm + " cm, a testtömeg " + tomegkg +" kg ez alapján a BMI: " + Math.round(BMI) + " .");
        System.out.println("A testmagassság "+ magassagcm + " cm, a testtömeg " + tomegkg +" kg ez alapján a BMI: " + String.format("%.2f", BMI));
        if (BMI < 16) {System.out.println("Ön súlyosan sovány");}
        if (BMI > 16 && BMI < 16.99) {System.out.println("Ön súlyosan sovány");}
        if (BMI > 17 && BMI < 18.49) {System.out.println("Ön mérsékelten sovány");}
        if (BMI > 18.5 && BMI < 24.99) {System.out.println("Ön enyhén sovány");}
        if (BMI < 29.99 && 25 < BMI) {System.out.println("Ön normális");}
        if (BMI < 34.99 && BMI > 30) {System.out.println("Ön I. fokú túlsúlyos");}
        if (BMI < 39.99 && 35 < BMI) {System.out.println("Ön II. fokú túlsúlyos");}
        if (BMI > 40) {System.out.println("Ön III. fokú túlsúlyos");}
    }
}
    


