/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int a;
        System.out.println("a sayisini giriniz:");
        a=scan.nextInt();
        int x,y,z;
            x=a/100;
            y=a%10;
            z=(a-(x*100))/10;
    
             int toplam;
             toplam=x+y+z;
             toplam=toplam*toplam;
             
             if(a==toplam){
                 
                 System.out.println("neon sayidir");}
             
             else{
                 System.out.println("neon sayi degildir");}
    }
    
}
