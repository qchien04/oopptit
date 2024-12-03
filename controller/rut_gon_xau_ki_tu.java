/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
/**
 *
 * @author chien
 */
public class rut_gon_xau_ki_tu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Deque<Character> st = new ArrayDeque<>();
         String s=sc.next();
         st.addFirst(s.charAt(0));
         for(int i=1;i<s.length();i++){
             if(!st.isEmpty()){
                 char stCharTop=st.peekFirst();
                 char c=s.charAt(i);
                 if(c==stCharTop) st.pollFirst();
                 else st.addFirst(c);
             }
             else st.addFirst(s.charAt(i));
         }
         if(st.isEmpty()) System.out.println("Empty String");
         else{
             while(!st.isEmpty()){
                 char c=st.pollLast();
                 System.out.print(c);
             }
             System.out.println();
         }
    }
}
