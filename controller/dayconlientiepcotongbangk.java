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
public class dayconlientiepcotongbangk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();

        while(t-->0){
            boolean check=false;
            int n=sc.nextInt();
            long k=sc.nextLong();
            
            int a[]=new int[n];
            
            Map<Long,Integer> map=new HashMap<>();
            long sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();}
            for(int i=0;i<n;i++){
                sum+=a[i];
                if(sum==k){
                    check=true;
                }

                if(map.containsKey(sum - k)){
                    check=true;
                    break;
                }
                map.put(sum, 1);
            }
            
            System.out.println(check?"YES":"NO");
            
            
        }
    }
}
