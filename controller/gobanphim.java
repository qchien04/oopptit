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
public class gobanphim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='<'){
                if(!st.empty()){
                    st2.push(st.pop());
                }
            }
            else if(i=='>'){
                if(!st2.empty()){
                    st.push(st2.pop());
                }
            }
            else if(i=='-'){
                if(!st.empty()) st.pop();
            }
            else st.push(i);
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.empty()){
            st2.push(st.pop());
        }
        while(!st2.empty()){
            System.out.print(st2.pop());
        }
    }
}
