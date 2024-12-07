/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltap;

import java.util.Scanner;

/**
 *
 * @author chien
 */
public class b5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String[] s=sc.nextLine().split("\\s+");
            String ans="";
            for(String i:s){
                ans=i+" "+ans;
            }
            System.out.println(ans);
        }
    }
}
