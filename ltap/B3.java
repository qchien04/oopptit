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
public class B3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long max=-1;
            for(int i=2;i<=Math.sqrt(a);i++){
                while(a%i==0){
                    max=Math.max(i, max);
                    a/=i;
                }
            }
            if(a!=1){
                max=Math.max(a, max);
            }
            System.out.println(max);
        }
    }
}
