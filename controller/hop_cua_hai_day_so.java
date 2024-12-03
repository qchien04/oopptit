/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chien
 */
public class hop_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> se = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            se.add(s);
        }
        
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            se.add(s);
        }
        for (int x : se) {
            System.out.print(x+" ");
        }
        sc.close();
    }
}
