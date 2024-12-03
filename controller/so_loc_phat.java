/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class so_loc_phat {
    private static class CustomComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            if (a.length() != b.length()) {
                return Integer.compare(b.length(), a.length());
            }
            return b.compareTo(a);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            List<String> ans = new ArrayList<>();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            
            int n = scanner.nextInt();
            ans.add("6");
            ans.add("8");
            
            while (!q.isEmpty()) {
                String s = q.poll();
                if (s.length() == n) {
                    break;
                }
                
                String s6 = s + "6";
                String s8 = s + "8";
                
                ans.add(s6);
                ans.add(s8);
                
                q.add(s6);
                q.add(s8);
            }
            
            System.out.println(ans.size());
            ans.sort(new CustomComparator());
            
            for (String str : ans) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
