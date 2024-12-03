/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sap_xep_thoi_gian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Time> a=new ArrayList<>();
        
        while(t-- >0){
            int h=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            a.add(new Time(h, m, s));
        }
        Collections.sort(a,new Comparator<Time>(){
            @Override
            public int compare(Time a,Time b){
                if(a.getH()!=b.getH()) return a.getH()-b.getH();
                if(a.getM()!=b.getM()) return a.getM()-b.getM();
                return a.getS()-b.getS();
            }
        });
        for(Time i:a){
            System.out.println(i);
        }
    }
}
class Time {
    private int h;
    private int m;
    private int s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return  h + " " + m + " " + s;
    }
    
    
}