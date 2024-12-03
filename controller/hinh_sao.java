/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.*;
/**
 *
 * @author chien
 */
public class hinh_sao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int bac[]=new int[t+1];
        int mainPointQuantity=0;
        int otherPoint=0;
        for(int i=1;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            bac[a]++;
            bac[b]++;
        }
        for(int i=1;i<=t;i++){
            if(bac[i]==t-1) mainPointQuantity++;
            else if(bac[i]==1){
                otherPoint++;
            }
        }
        
        if(mainPointQuantity==1&&otherPoint==t-1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
