package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author chien
 */
public class kiem_tra_day_ngoac_dung {
    public static String kt(String s){
        StringBuilder sb=new StringBuilder(s);
        Deque<Character> deque=new ArrayDeque<>();
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(c=='['||c=='{'||c=='('){
                deque.addFirst(c);
            }
            else{
                if(c==')'){
                    Character head=deque.peekFirst();
                    if (head == null || head != '(') return "NO";
                    deque.pollFirst();
                }
                if(c==']'){
                    Character head=deque.peekFirst();
                    if(head == null ||head!='[') return "NO";
                    deque.pollFirst();
                }
                if(c=='}'){
                    Character head=deque.peekFirst();
                    if(head == null ||head!='{') return "NO";
                    deque.pollFirst();
                }
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            System.out.println(kt(s));
        }
    }
}
