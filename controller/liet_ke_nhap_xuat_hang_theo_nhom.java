/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class liet_ke_nhap_xuat_hang_theo_nhom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Hang> arr=new ArrayList<>();
        while(t-->0){
            String ma=sc.nextLine();
            long nhap=Long.parseLong(sc.nextLine());

            arr.add(new Hang(ma, nhap));
        }
        Collections.sort(arr);
        String q=sc.nextLine();
        for(Hang i:arr){    
            if(i.getMa().startsWith(q)){
                System.out.println(i);
            }
            
            
        }  
    }
}
class Hang implements Comparable<Hang>{
    private String ma;
    private long nhap;

    public Hang(String ma, long nhap) {
        this.ma = ma;
        this.nhap = nhap;
    }
    private long getSoLuongXuatHang(){
        if(ma.startsWith("A")){
            return Math.round((double)nhap*60/100);
        }
        return Math.round((double)nhap*70/100);
    }
    private long getDonGia(){
        if(ma.endsWith("Y")){
            return 110000;
        }
        return 135000;
    }
    private long getTaxPercent(){
        if(ma.endsWith("Y")&&ma.startsWith("A")) return 8;
        if(ma.endsWith("N")&&ma.startsWith("A")) return 11;
        if(ma.endsWith("Y")&&ma.startsWith("B")) return 17;
        return 22;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    private long getTien(){
        return getSoLuongXuatHang()*getDonGia();
    }
    private long getTax(){
        return getTien()/100*(getTaxPercent());
    }
    @Override
    public String toString() {
        return ma+" "+nhap+" "+getSoLuongXuatHang()+" "+getDonGia()+" "+getTien()+" "+getTax();
    }

    @Override
    public int compareTo(Hang o) {
        return Long.compare(o.getTax(), getTax());
    }
    
    
}