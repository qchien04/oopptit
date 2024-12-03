/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author chien
 */
public class giao_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n];
        List<Integer> res = new ArrayList<>(); // Sử dụng generic type
        Map<Integer, Integer> mp = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            mp.put(a[i], 1);
        }
        
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            if (mp.get(s) != null && mp.get(s) == 1) {
                res.add(s);
                mp.remove(s); 
            }
        }
        
        Collections.sort(res);
        for (int x : res) {
            System.out.print(x+" ");
        }
        sc.close();
    }
}
