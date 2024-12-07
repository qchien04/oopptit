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
public class tuyengiaovien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<GV> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String loai=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            arr.add(new GV(name, loai, d1, d2));
        }
        Collections.sort(arr);
        for(GV i:arr){
            System.out.println(i);
        }
    }
}
class GV implements Comparable<GV>{
    private static int stt=0;
    private String id,name,lop;
    private double d1,d2;

    public GV(String name, String lop, double d1, double d2) {
        this.id = String.format("GV%02d", ++stt);
        this.name = name;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
    }
    private double getdiemcong(){
        char c=lop.charAt(1);
        if(c=='1') return 2;
        if(c=='2') return 1.5;
        if(c=='3') return 1;
        return 0;

    }
    private double getdiem(){
        return d1*2+d2+getdiemcong();

    }
    private String getmon(){
        char c=lop.charAt(0);
        if(c=='A') return "TOAN";
        if(c=='B') return "LY";
        return "HOA";

    }
    private String getxl(){
        if(getdiem()>=18) return "TRUNG TUYEN";
        return "LOAI";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+getmon()+" "+String.format("%.1f", getdiem())+" "+getxl();
    }

    @Override
    public int compareTo(GV o) {
        if(o.getdiem()!=getdiem())
            return Double.compare(o.getdiem(),getdiem());
        return id.compareTo(o.id);
    }
    
    
}