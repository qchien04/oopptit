/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.lang.reflect.Array;
import java.util.*;
public class lietkenhanvientheonhom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Nhanvien> arr=new ArrayList<>();
        int gd=1,tp=3,pp=3;
        while(t-->0){
            String[] s=sc.nextLine().split("\\s+");
            String ten="";
            for(int i=1;i<s.length;i++){
                ten+=s[i]+" ";
            }
            ten=ten.trim();
            String ma=s[0].substring(0,2);
            String sohieu=s[0].substring(4);
            String Bacluong=s[0].substring(2,4);
            if(gd<=0&&ma.equals("GD")){
                ma="NV";
                
            }
            if(tp<=0&&ma.equals("TP")){
                ma="NV";
            }
            if(pp<=0&&ma.equals("PP")){
                ma="NV";
            }
            if(ma.equals("GD")) gd--;
            if(ma.equals("PP")) pp--;
            if(ma.equals("TP")) tp--;
            arr.add(new Nhanvien(ten, ma, sohieu, Bacluong));
            
        }
        t=Integer.parseInt(sc.nextLine());
        Collections.sort(arr);
        while(t-->0){
            String q=sc.nextLine();
            for(Nhanvien i:arr){
                if(i.ma.equals(q)){
                    System.out.println(i);
                }
            }
            
            System.out.println("");
        }
    }
}

class Nhanvien implements Comparable<Nhanvien>{
    public String ten,ma,sohieu,bacluong;

    
    public Nhanvien(String ten, String ma, String sohieu, String bacluong) {
        this.ten = ten;
        this.ma = ma;
        this.sohieu = sohieu;
        this.bacluong = bacluong;
    }

    @Override
    public String toString() {
        return ten+" "+ma+" "+sohieu+" "+bacluong;
    }

    @Override
    public int compareTo(Nhanvien o) {
        if(bacluong.compareTo(o.bacluong)!=0) return o.bacluong.compareTo(bacluong);
        return sohieu.compareTo(o.sohieu);
    }
    
    
    
}
