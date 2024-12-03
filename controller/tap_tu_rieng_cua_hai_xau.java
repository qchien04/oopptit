/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author chien
 */
public class tap_tu_rieng_cua_hai_xau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String[] s1=sc.nextLine().split("\\s+");
            String[] s2=sc.nextLine().split("\\s+");
            Set<String> se= new TreeSet<>();
            List<String> l1=new ArrayList<>(Arrays.asList(s1));
            List<String> l2=new ArrayList<>(Arrays.asList(s2));
            for(String s:l1){
                if(!l2.contains(s)) se.add(s);
            }
            for(String s:se){
                System.out.print(s+" ");
            }
            System.out.println();
        }
        
    }
}
