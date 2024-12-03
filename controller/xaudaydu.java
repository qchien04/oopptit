/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author chien
 */
public class xaudaydu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            Set<Character> se=new HashSet<>();
            for(char i:s.toLowerCase().toCharArray()){
                se.add(i);
            }
            System.out.println(se.size());
            int k=Integer.parseInt(sc.nextLine());
            if(s.length()<27){
                System.out.println("NO");
                continue;
            }
            if(k>=(27-se.size())){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
