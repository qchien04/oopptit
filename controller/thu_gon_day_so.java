/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class thu_gon_day_so {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(list.size()>0&&(list.get(list.size()-1)+num)%2==0){
                list.remove(list.size()-1);
            }
            else list.add(num);
        }
        System.out.println(list.size());
    }
}
