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
public class so_dep_2 {
    private static boolean ktra(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)-'0');
        }
        return sum%10==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            StringBuilder sb=new StringBuilder(s);
            String s2=sb.reverse().toString();
            if(s.charAt(0)=='8'&&s.equals(s2)&&ktra(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
