/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agarciam.a03;
import java.util.Scanner;

/**
 *
 * @author alejandromonroy
 */
public class SPPAGarciaMA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double c;

Scanner sc= new Scanner (System.in);
System.out.println("Ingrese un cateto");
double a= sc.nextDouble();
System.out.println("Ingrese el otro cateto");
double b= sc.nextDouble();
c= Math.sqrt (Math.pow (a,2) + Math.pow(b,2));
System.out.println(c);
    }
    
}
