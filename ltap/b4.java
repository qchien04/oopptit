/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltap;

import java.util.Scanner;


public class b4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            long tich=1;
            long tong=0;
            for(int i=0;i<s.length();i++){
                int x=s.charAt(i)-'0';
                if(i%2==0){
                    if(x==0) continue;
                    tich*=(x);
                }
                else{
                    tong+=x;
                }
            }
            System.out.println(tich+" "+tong);
        }
    }
}
