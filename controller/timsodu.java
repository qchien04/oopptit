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
public class timsodu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Số lần lặp

        while (t-- > 0) {
            String s = sc.next(); // Chuỗi đầu vào
            int n;

            if (s.length() <= 2)
                n = Integer.parseInt(s);
            else
                n = Integer.parseInt(s.substring(s.length() - 2));

            n %= 4; // Tính n mod 4
            int sum = 0;

            // Tính tổng i^n với i từ 1 đến 4
            for (int i = 1; i < 5; i++) {
                sum += (int) Math.pow(i, n);
            }

            // In kết quả sum mod 5
            System.out.println(sum % 5);
        }
    }
}
