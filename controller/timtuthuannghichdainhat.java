/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.util.*;
public class timtuthuannghichdainhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> mp=new LinkedHashMap<>();
        int max=-1;
        while(sc.hasNext()){

            String s=sc.next();
            StringBuilder sb=new StringBuilder(s);
            String tmp=sb.reverse().toString();
            if(s.equals(tmp)){
                max=Math.max(max, tmp.length());
                if(tmp.length()<max) continue;
                if(mp.containsKey(tmp)){
                    mp.put(tmp, mp.get(tmp)+1);
                }
                else{
                    mp.put(tmp, 1);
                }
            }
        }
        for(String i:mp.keySet()){
            if(i.length()==max){
                System.out.println(i+" "+mp.get(i));
            }
        }
    }
}
