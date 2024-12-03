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
public class chuan_hoa_xau_ho_ten_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String a = sc.nextLine().trim();
            String[] s=a.split("\\s+");
            for(String i:s){
               String r=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase();
               System.out.print(r+" ");            
            }  
            System.out.println();
        }

        sc.close();
    }
}
