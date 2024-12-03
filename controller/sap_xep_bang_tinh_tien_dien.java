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
public class sap_xep_bang_tinh_tien_dien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<TienDien> arr=new ArrayList<>();
        while(t-->0){
            String type=sc.nextLine();
            long socu=Long.parseLong(sc.nextLine());
            long somoi=Long.parseLong(sc.nextLine());
            arr.add(new TienDien(type, socu, somoi));
        }
        Collections.sort(arr);
        for(TienDien i: arr){
            System.out.println(i);
        }
    }
}
class TienDien implements Comparable<TienDien>{
    private static int stt=0;
    private String ma,type;
    private long socu,somoi;

    public TienDien(String type, long socu, long somoi) {
        stt++;
        this.ma=String.format("KH%02d", stt);
        this.type = type;
        this.socu = socu;
        this.somoi = somoi;
    }
    private long getHeSo(){
        if(type.equals("KD")) return 3;
        if(type.equals("NN")) return 5;
        if(type.equals("TT")) return 4;
        return 2;
    }
    private long getThanhtien(){
        return (somoi-socu)*getHeSo()*550;
    }
    private long getPhutroi(){
        long a=somoi-socu;
        if(a<50){
            return 0;
        }
        if(a<=100){
            return Math.round((double)getThanhtien()*35/100);
        }
        return getThanhtien();
    }
    private long getTotal(){
        return getPhutroi()+getThanhtien();
    }

    @Override
    public String toString() {
        return ma+" "+getHeSo()+" "+getThanhtien()+" "+getPhutroi()+" "+getTotal();
    }

    @Override
    public int compareTo(TienDien o) {
        return Long.compare(o.getTotal(), getTotal());

    }    
}
