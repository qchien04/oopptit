/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class b11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] b=new int[86401];
        while(sc.hasNextLine()){
            
            String a[]=sc.nextLine().trim().split("[,\\.\\s\\t]+");
            if(a[0].equals("#")) break;
            for(String i:a){
                String regex="^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$";
                if(i.matches(regex)){
                    int x=Integer.parseInt(i.substring(0,2))*3600+
                            Integer.parseInt(i.substring(3,5))*60+
                            Integer.parseInt(i.substring(6));
                    b[x]=1;
                }
            
            }
        }
        for(int i=0;i<86401;i++){
            if(b[i]==1) System.out.println((i/3600)+":"+((i%3600)/60)+":"+(i%60));
        }
    }
}
