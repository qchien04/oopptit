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
public class so_uu_the {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            int chan=0;
            int le=0;
            boolean check=true;
            for(int i=0;i<s.length();i++){
                char d=s.charAt(i);
                if(!Character.isDigit(d)){
                    System.out.println("INVALID");
                    check=false;
                    break;
                }
                else{
                    if(d%2==0) chan++;
                    else le++;
                }
            }
            if(check){
                if((s.length()%2==0 && chan>le)||s.length()%2==1 && le>chan) System.out.println("YES");
                else System.out.println("NO");
            }
            
        }
    }   
}
