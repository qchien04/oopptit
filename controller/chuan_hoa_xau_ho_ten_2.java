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
public class chuan_hoa_xau_ho_ten_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String a = sc.nextLine().trim();
            String[] s=a.split("\\s+");
            for(int j=1;j<s.length;j++){
               String i=s[j];
               String r=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase();
               System.out.print(r);
               if(j!=(s.length-1))System.out.print(" ");
            }
            String i=s[0];
            String r=i.toUpperCase();
            System.out.print(", "+r);
            System.out.println();
        }

        sc.close();
    }
}
