/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;


/**
 *
 * @author chien
 */
public class xep_hang_vdv1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<VDV> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String ns=sc.nextLine();
            String t1=sc.nextLine();
            String t2=sc.nextLine();
            arr.add(new VDV(name, ns, t1, t2));
            
        }
        ArrayList<VDV> arr2=(ArrayList<VDV>) arr.clone();
        Collections.sort(arr2);
        arr2.get(0).setXephang(1);
        for(int i=1;i<arr2.size();i++){
            if(arr2.get(i).gettime()!=arr2.get(i-1).gettime()){
                arr2.get(i).setXephang(i+1);
            }
            else{
                arr2.get(i).setXephang(arr2.get(i-1).getXephang());
            }
        }
        
        for(VDV i:arr){
            System.out.println(i);
        }
        
    }
}

class VDV implements Comparable<VDV>{
    private static int stt=0;
    private String id,name;
    private int xephang,age;
    private String t1,t2;

    public VDV(String name,String ngaysinh,String t1,String t2) {
        this.id = "VDV"+String.format("%02d", ++stt);
        this.name = name;
        this.age=getAge(ngaysinh);
        this.t1=t1;
        this.t2=t2;
       
    }
    private int getAge(String ngaysinh){
        String[] s=ngaysinh.split("/");
        return 2021-Integer.parseInt(s[2]);
    }

    public int getXephang() {
        return xephang;
    }

    public void setXephang(int xephang) {
        this.xephang = xephang;
    }
    
    public String getUutien(){
        if(age>=32){
            return "00:00:03";
        }
        else if(age>=25){
            return "00:00:02";
        }
        else if(age>=18){
            return "00:00:01";
        }
        return "00:00:00";
    }
    private String getTTTT() throws ParseException{
        String[] a=t2.split(":");
        String[] b=t1.split(":");
        Long time=(Long.parseLong(a[0])-Long.parseLong(b[0]))*3600+
                   (Long.parseLong(a[1])-Long.parseLong(b[1]))*60+
                Long.parseLong(a[2])-Long.parseLong(b[2]);
        
        return String.format("%02d:%02d:%02d",time/3600,(time%3600)/60,time%60);
       
    }
    private String getTTXH() throws ParseException{
        String[] a=getTTTT().split(":");
        String[] b=getUutien().split(":");
        Long time=(Long.parseLong(a[0])-Long.parseLong(b[0]))*3600+
                   (Long.parseLong(a[1])-Long.parseLong(b[1]))*60+
                Long.parseLong(a[2])-Long.parseLong(b[2]);
        
        return String.format("%02d:%02d:%02d",time/3600,(time%3600)/60,time%60);
       
    }
    public long gettime() throws ParseException{
        String[] a=getTTXH().split(":");
        return Long.parseLong(a[0])*3600+
                    Long.parseLong(a[1])*60+
                Long.parseLong(a[2]);
    }
    @Override
    public String toString() {
        try {
            return id+" "+name+" "+getTTTT()+" "+getUutien()+" "+getTTXH()+" "+xephang;
        } catch (ParseException ex) {
           
        }
        return "";
    }

    @Override
    public int compareTo(VDV o) {
        try {
            return Long.compare(gettime(),o.gettime());
        } catch (ParseException ex) {
           
        }
        return 0;
    }
    
}