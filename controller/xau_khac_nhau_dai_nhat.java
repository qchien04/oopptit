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
public class xau_khac_nhau_dai_nhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String a=sc.next();
            String b=sc.next();
            if(!a.equals(b)) System.out.println(Math.max(a.length(), b.length()));
            else{
                System.out.println("-1");
            }
        }
    }       
}
