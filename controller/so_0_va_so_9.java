/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class so_0_va_so_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            Queue<String> queue = new LinkedList<>();
            queue.add("9");
            int n = scanner.nextInt();
            String res = "";
            
            while (!queue.isEmpty()) {
                String s = queue.poll();
                if (Long.parseLong(s) % n == 0) {
                    res = s;
                    break;
                }
                queue.add(s + "0");
                queue.add(s + "9");
            }
            
            System.out.println(res);
        }

        scanner.close();
    }
}
