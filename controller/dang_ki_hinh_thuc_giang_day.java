///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//
///**
// *
// * @author chien
// */
//public class dang_ki_hinh_thuc_giang_day {
//    public static void main(String[] args) {
//        try {
//            BufferedReader br=new BufferedReader(new FileReader("MONHOC.in"));
//            int t=Integer.parseInt(br.readLine());
//            ArrayList<Subject> arr=new ArrayList<>();
//            while(t-->0){
//                String ma=br.readLine();
//                String name=br.readLine();
//                int ht=Integer.parseInt(br.readLine());
//                String htlt=br.readLine();
//                String httt=br.readLine();
//                if(!httt.equals("Truc tiep")){
//                    arr.add(new Subject(ma, name, ht, htlt, httt));
//                }
//                
//                
//            }
//            Collections.sort(arr,new Comparator<Subject>(){
//                @Override
//                public int compare(Subject a,Subject b){
//                    return a.getMa().compareTo(b.getMa());
//                }
//            });
//            for(Subject i: arr){
//                System.out.println(i);
//            }
//        } catch (Exception e) {
//        }
//    }
//}
//class Subject implements Comparable<Subject>{
//    private String ma;
//    private String name;
//    private int stc;
//    private String htlt,httt;
//
//    public Subject(String ma, String name, int stc, String htlt, String httt) {
//        this.ma = ma;
//        this.name = name;
//        this.stc = stc;
//        this.htlt = htlt;
//        this.httt = httt;
//    }
//    
//
//    public String getMa() {
//        return ma;
//    }
//
//    public void setMa(String ma) {
//        this.ma = ma;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    
//    @Override
//    public int compareTo(Subject other){
//        return this.ma.compareTo(other.ma);
//    }
//    
//    
//    
//    @Override
//    public String toString() {
//        return ma+" "+name+" "+stc+" "+htlt+" "+httt;
//    }
//    
//}
