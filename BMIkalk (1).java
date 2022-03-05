
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
      if (BMI < 20) {System.out.println("sovány");}
        if (BMI > 20 && BMI < 25) {System.out.println("normál");}
        if (BMI > 25 && BMI < 30) {System.out.println("túlsúlyos");}
        if (BMI > 30 && BMI < 35) {System.out.println("elhízott");}
        if (BMI > 35) {System.out.println("kórosan elhízott");}
    }
}
    


