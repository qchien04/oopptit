/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author chien
 */
public class dia_chi_email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Set<String> se=new LinkedHashSet<>();
        while (t-- > 0) {
            String a = sc.nextLine().trim();
            String[] s=a.split("\\s+");
            String e="";
            int dem=0;
            e+=s[s.length-1].toLowerCase();
            for(int j=0;j<s.length-1;j++){
                String d=s[j].charAt(0)+"";
                e+=d.toLowerCase();
            }
            if(se.contains(e)){
                dem+=2;
                while(se.contains(e+dem)){
                    dem++;
                }
                e=e+dem;
            }
            se.add(e);
            System.out.println(e+"@ptit.edu.vn");
        }
        sc.close();
    }
}
