/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author chien
 */
public class go_ban_phim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Stack<Character> st = new Stack<>();
        Stack<Character> tmp = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (c == '<') {
                if (!st.isEmpty()) {
                    char a = st.pop();
                    tmp.push(a);
                }
            } else if (c == '>') {
                if (!tmp.isEmpty()) {
                    char a = tmp.pop();
                    st.push(a);
                }
            } else {
                st.push(c);
            }
        }
        while (!tmp.isEmpty()) {
            char a = tmp.pop();
            st.push(a);
        }
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        System.out.println(res.reverse().toString());
        
        scanner.close();
    }
}
