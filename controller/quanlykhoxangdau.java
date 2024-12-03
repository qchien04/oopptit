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
public class quanlykhoxangdau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Kho> arr=new ArrayList<>();
        while(t-->0){
            String[] a=sc.nextLine().split("\\s+");
            arr.add(new Kho(a[0],a[1]));
        }
        Collections.sort(arr,(Kho a,Kho b)->{
            return -Double.compare(a.gettong(), b.gettong());
        });
        for(Kho i:arr){
            System.out.println(i);
        }
    }
}


class Kho{
    private String ma;
    private long sl;


    public Kho(String ma, String sl) {
        this.ma = ma;
        this.sl = Long.parseLong(sl);
    }
    private String getTenhang(){
        String l=ma.substring(3);
        if(l.equals("BP")) return "British Petro";
        if(l.equals("ES")) return "Esso";
        if(l.equals("SH")) return "Shell";
        if(l.equals("CA")) return "Castrol";
        if(l.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
    private String getmathang(){
        String l=ma.substring(0,1);
        if(l.equals("X")) return "Xang";
        if(l.equals("D")) return "Dau";
        return "Nhot";
    }
    private long getdongia(){
        String l=ma.substring(0,1);
        if(l.equals("X")) return 128000;
        if(l.equals("D")) return 11200;
        return 9700;
    }
    private double getPthue(){
        String l=ma.substring(0,1);
        String la=ma.substring(3);
        if(la.equals("TN")) return 0;
        if(l.equals("X")) return 3;
        if(l.equals("D")) return 3.5;
        return 2;
    }
    
    private double getThue(){
        return (double)(getdongia()*sl)*(getPthue()/100);
    }
    public double gettong(){
        return getdongia()*sl+getThue();
    }

    @Override
    public String toString() {
        return ma+" "+getTenhang()+" "+ getdongia()+" "+(long)getThue()+" "+(long)gettong();
    }
    
    
}