/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class vongtron {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<pair> arr=new ArrayList<>();
        for(char i='A';i<='Z';i++){
            pair p=new pair();
            p.x=s.indexOf(i);
            p.y=p.x+s.substring(p.x+1).indexOf(i)+1;
            arr.add(p);
        }
        int ans=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(j).x>arr.get(i).y||arr.get(j).y<arr.get(i).x||
                        ((arr.get(i).x-arr.get(j).x)*(arr.get(i).y-arr.get(j).y))<0
                        ){continue;}
                else ans+=1;
            }
        }
        System.out.println(ans);
        
        
        
    }
}
class pair{
    int x,y;
}