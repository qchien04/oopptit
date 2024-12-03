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
public class solama {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Map<Character,Integer> mp=new HashMap<>();
        
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        
        while(t-->0){
            String s=sc.next();
            long sum=0;
            for(int i=0;i<s.length()-1;i++){
                if(mp.get(s.charAt(i))>=mp.get(s.charAt(i+1))){
                    sum+=mp.get(s.charAt(i));
                }
                else{
                    sum-=mp.get(s.charAt(i));
                }
            }
            sum+=mp.get(s.charAt(s.length()-1));
            System.out.println(sum);
        }
        
        
              
    }
}
