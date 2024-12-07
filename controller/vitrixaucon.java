/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chien
 */
public class vitrixaucon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("STRING.in"));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a=sc.nextLine();
            String b=sc.nextLine();
            int i=0;
            while(i<=a.length()-b.length()){
                int x=a.indexOf(b,i);
                if(x>=0){
                    System.out.print(x+1+" ");
                }
                i=x+1;
                if(x<0) break;
            }
            System.out.println("");
            
        }
        
        
    }
}
