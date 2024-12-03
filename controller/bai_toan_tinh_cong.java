/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author chien
 */
public class bai_toan_tinh_cong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        long lcb=Integer.parseInt(sc.nextLine());
        int cong=Integer.parseInt(sc.nextLine());
        String lever=sc.nextLine();
        NhanVien nv=new NhanVien(name, lever, lcb, cong);
        System.out.println(nv);
    }
}
class NhanVien{
    private String code;
    private String name,lever;
    private long lcb;
    private int cong;
    private static int stt=0;
    public NhanVien(String name, String lever, long lcb, int cong) {
        this.name = name;
        this.lever = lever;
        this.lcb = lcb;
        this.cong = cong;
        stt++;
        this.code=String.format("NV%02d", stt);
    }
    private long getSup(){
        String s=this.lever;
        if(s.equals("GD")) return 250000;
        else if(s.equals("PGD")) return 200000;
        else if(s.equals("TP")) return 180000;
        return 150000;
    }

    private long getIncome(){
        int c=this.cong;
        return c*this.lcb;
    }
    
    private long getFoward(){
        int c=this.cong;
        if(c>=25) return (long)(0.2*getIncome());
        else if(c>=22) return (long)(0.1*getIncome());
        return 0;
    }
    private long getTotal(){
        return getFoward()+getIncome()+getSup();
    }

    @Override
    public String toString() {
        return code+" "+name+" "+getIncome()+" "+getFoward()+" "+getSup()+" "+getTotal();
    }
    
    
    
}

