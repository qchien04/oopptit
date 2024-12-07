/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.util.*;
public class tuyendung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<TS> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            arr.add(new TS(name, d1, d2));
            
        }
        Collections.sort(arr);
        for(TS i: arr){
            System.out.println(i);
        }
    }
}


class TS implements Comparable<TS>{
    private static int stt=0;
    private String id,name;
    private double d1,d2;

    public TS(String name, double d1, double d2) {
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.id=String.format("TS%02d", ++stt);
    }
    private double gettb(){
        if(d1>10) d1=d1/10;
        if(d2>10) d2=d2/10;
        return (d1+d2)/2;
    }
    private String getxl(){
        double a=gettb();
        if(a>9.5) return "XUAT SAC";
        if(a>=8) return "DAT";
        if(a>=5) return "CAN NHAC";
        return "TRUOT";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.2f", gettb())+" "+getxl();
    }

    @Override
    public int compareTo(TS o) {
        return Double.compare(o.gettb(),gettb());
    }
    
    
    
    
}