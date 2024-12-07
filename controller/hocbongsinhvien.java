///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package ooooo;
//
///**
// *
// * @author chien
// */
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author chien
// */
//import java.util.*;
//public class hocbongsinhvien {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String[] nm=sc.nextLine().split("\\s+");
//        int n=Integer.parseInt(nm[0]);
//        int m=Integer.parseInt(nm[1]);
//        ArrayList<SV> arr=new ArrayList<>();
//        while(n-->0){
//            String name=sc.nextLine();
//            String[] a=sc.nextLine().split("\\s+");
//            double gpa=Double.parseDouble(a[0]);
//            int drl=Integer.parseInt(a[1]);
//            arr.add(new SV(name, gpa, drl));
//            
//        }
//        ArrayList<SV> arr2=(ArrayList<SV>) arr.clone();
//        Collections.sort(arr);
//        for(SV i:arr){
//            if(m>0){
//                i.setHb(i.gethb());
//                m--;
//                if(m==0){
//                    SV.dc=i.getGpa();
//                    
//                }
//            }
//            else if(m==0){
//                if(i.getGpa()==SV.dc){
//                    i.setHb(i.gethb());
//                }
//                else i.setHb("KHONG");
//            };
//        }
//        
//        for(SV i:arr2){
//            System.out.println(i);
//        }
//        
//    }
//}
//
//
//class SV implements Comparable<SV>{
//    public static double dc=0;
//    public static int drlc=0;
//    static String cleanName(String s) {
//        String[] a = s.trim().split("\\s+");
//        for (int i = 0; i < a.length; i++)
//            a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1).toLowerCase();
//        return String.join(" ", a);
//    }   
//    private String name,hb;
//    private double gpa;
//    private int drl;
//
//    public SV(String name, double gpa, int drl) {
//        this.name = cleanName(name);
//        this.gpa = gpa;
//        this.drl = drl;
//    }
//
//
//    public String getHb() {
//        return hb;
//    }
//
//    public void setHb(String hb) {
//        this.hb = hb;
//    }
//
//    public static void setDc(int dc) {
//        SV.dc = dc;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getGpa() {
//        return gpa;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//
//    public int getDrl() {
//        return drl;
//    }
//
//    public void setDrl(int drl) {
//        this.drl = drl;
//    }
//    
//    public String gethb(){
//        if(gpa>=3.6&&drl>=90) return "XUATSAC";
//        if(gpa>=3.2&&drl>=80) return "GIOI";
//        if(gpa>=2.5&&drl>=70) return "KHA";
//        return "KHONG";
//        
//        
//    }
//
//    @Override
//    public String toString() {
//        return name+": "+hb;
//    }
//
//    @Override
//    public int compareTo(SV o) {
//        if(gpa!=o.gpa) return Double.compare(o.gpa, gpa);
//        return Integer.compare(o.drl, drl);
//    }
//    
//    
//}