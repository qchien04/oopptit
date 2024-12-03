/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class cap_so_co_tong_bang_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt(); 
            long k=sc.nextLong();
            long[] a = new long[n]; 
            for (int i=0;i<n;i++) {
                a[i]=sc.nextLong();
            }
            Map<Long, Integer> mp = new HashMap<>();
            long ans = 0;
            for (int i = 0; i < n; i++) {
                long e=k-a[i];
                if (mp.containsKey(e)) {
                    ans += mp.get(e);
                }
                mp.put(a[i], mp.getOrDefault(a[i], 0)+1);
            }
            System.out.println(ans);
        }
    }
}
