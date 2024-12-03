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
public class phan_tich_thua_so_nguyen_to {
    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            Map<Integer,Integer> mp= new LinkedHashMap();
            int a=sc.nextInt();
            for(int j=2;j<Math.sqrt(a);j++){
                while(a%j==0){
                    a=a/j;
                    if(mp.containsKey(j)){
                        mp.put(j, mp.get(j)+1);        
                    }
                    else{
                        mp.put(j, 1);
                    } 
                }
            }
            if(a>1) mp.put(a, 1);
            System.out.print("Test "+(i+1)+": ");
            mp.forEach((key, value) -> System.out.print(key + "(" + value + ") "));
            System.out.println();
        }  
    }
}
