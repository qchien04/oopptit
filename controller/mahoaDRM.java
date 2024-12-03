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
public class mahoaDRM {
    
    public static String rotate(String s) {
        int val=0;
        for(char i:s.toCharArray()){
            val+=i;
        }
        String res="";
        for(char i:s.toCharArray()){
            res+=((char)((i-'A'+val)%26+'A')+"");
        }
        return res;
    }
    public static String merge(String s1,String s2) {
        String res="";
        for(int j=0;j<s1.length();j++){
            char i=s1.charAt(j);
            res+=((char)((i-'A'+(s2.charAt(j)-'A'))%26+'A')+"");
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            int len=s.length()/2;
            
            System.out.println(merge(rotate(s.substring(0,len)),rotate(s.substring(len))));
            
            
        }
        
    }
}
