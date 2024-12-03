/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author chien
 */
public class xulyvanban {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="";
        while(sc.hasNextLine()){
            String i=sc.nextLine();
            s+=i;
            
        }
        String[] ans=s.split("[.?!]");
        for(String i:ans){
            i=i.trim().toLowerCase();
            String tmp=(i.charAt(0)+"").toUpperCase()+i.substring(1);
            String[] a=tmp.split("\\s+");
            for(String j:a){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
        
        
    }
}
