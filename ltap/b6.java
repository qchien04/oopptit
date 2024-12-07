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
public class b6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int c=sc.nextInt();
            sc.nextLine();
            String[] s=sc.nextLine().split("\\s+");
            String ch[]=new String[s.length];
            int j=0;
            for(String i:s){
                ch[j++]=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase();
            }
            if(c==1){
                System.out.print(ch[ch.length-1]);
                for(int i=0;i<ch.length-1;i++){
                    System.out.print(" "+ch[i]);
                }
            }else{
                for(int i=1;i<ch.length;i++){
                    System.out.print(ch[i]+" ");
                }
                System.out.print(ch[0]);
            }
            System.out.println("");
        }
    }
}
