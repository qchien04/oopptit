/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class sap_xep_ket_qua_tuyen_sinh {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<BD> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            double d3=Double.parseDouble(sc.nextLine());
            arr.add(new BD(id, name, d1, d2, d3));
        }
        Collections.sort(arr);
        for(BD i: arr){
            System.out.println(i);
        }
    }
}

class BD implements Comparable<BD>{
    private String id,name;
    private double d1,d2,d3;

    public BD(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    private double getUT(){
        int t=Integer.parseInt(id.charAt(2)+"");
        if(t==1) return 0.5;
        if(t==2) return 1;
        return 2.5;
    }
    private double getdiem(){
        return (d1*2+d2+d3)+getUT();
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#.#");
        String diem=df.format(getdiem());
        String xl=(getdiem()>=24?"TRUNG TUYEN":"TRUOT");
        return id+" "+name+" "+df.format(getUT())+" "+diem+" "+xl;
    }

    @Override
    public int compareTo(BD o) {
        return -Double.compare(getdiem(),o.getdiem());
    }
    
}


