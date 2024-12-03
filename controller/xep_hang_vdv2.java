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
public class xep_hang_vdv2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<VDV2> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String bd=sc.nextLine();
            String t1=sc.nextLine();
            String t2=sc.nextLine();
            VDV2 ok=new VDV2(name, bd, t1, t2);
            arr.add(ok);
        }
        Collections.sort(arr);
        arr.get(0).setXephang(1);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i).getXH()!=arr.get(i-1).getXH()){
                arr.get(i).setXephang(i+1);
            }
            else arr.get(i).setXephang(arr.get(i-1).getXephang());
        }
        
        for(VDV2 i: arr){
            System.out.println(i);
        }
        
        
    }
}


class VDV2 implements Comparable<VDV2>{
    private static int stt=1;
    private String id,name,bd,t1,t2;
    private int tuoi,xephang;

    public VDV2(String name, String bd, String t1, String t2) {
        this.id="VDV"+String.format("%02d", stt++);
        this.name = name;
        this.bd = bd;
        this.t1 = t1;
        this.t2 = t2;
        this.tuoi=getTuoi(bd);
    }
    private int getTuoi(String ns){
        String a[]=ns.split("/");
        return 2021-Integer.parseInt(a[2]);
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getXephang() {
        return xephang;
    }

    public void setXephang(int xephang) {
        this.xephang = xephang;
    }
    private String format(long time){
        return String.format("%02d:%02d:%02d",time/3600,(time%3600)/60,time%60);
    }
    private long getUT(){
        if(tuoi>=32){
            return 3;
        }
        else if(tuoi>=25){
            return 2;
        }
        else if(tuoi>=18){
            return 1;
        }
        return 0;
    }
    private long getTT(){
        String a[]=t1.split(":");
        String b[]=t2.split(":");
        long time=(Long.parseLong(b[0])-Long.parseLong(a[0]))*3600+
                (Long.parseLong(b[1])-Long.parseLong(a[1]))*60+
                (Long.parseLong(b[2])-Long.parseLong(a[2]));
        return time;
    }
    public long getXH(){
        return getTT()-getUT();
    }

    @Override
    public String toString() {
        return id+" "+name+" "+format(getTT())+" "+format(getUT())+" "+format(getXH())+" "+xephang;
    }

    @Override
    public int compareTo(VDV2 o) {
        return Long.compare(getXH(), o.getXH());
    }
    
    
    
}