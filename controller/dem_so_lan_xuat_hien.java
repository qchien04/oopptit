/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            Map<Integer,Integer> mp= new LinkedHashMap();
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                int s=sc.nextInt();
                if(mp.containsKey(s)){
                    mp.put(s, mp.get(s)+1);        
                }
                else{
                    mp.put(s, 1);
                } 
            }
            System.out.println("Test "+(i+1)+": ");
            for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
                System.out.println(entry.getKey()+" xuat hien "+entry.getValue()+" lan");
            }
        }
    }  
}
