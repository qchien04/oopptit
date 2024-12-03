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
//public class danh_sach_mon_thi {
//    public static void main(String[] args) {
//        try {
//            BufferedReader br=new BufferedReader(new FileReader("MONHOC.in"));
//            int t=Integer.parseInt(br.readLine());
//            ArrayList<Subject> arr=new ArrayList<>();
//            while(t-->0){
//                String ma=br.readLine();
//                String name=br.readLine();
//                String ht=br.readLine();
//                arr.add(new Subject(ma, name, ht));
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
//class Subject{
//    private String ma;
//    private String name;
//    private String ht;
//
//    public Subject(String ma, String name, String ht) {
//        this.ma = ma;
//        this.name = name;
//        this.ht = ht;
//    }
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
//    public String getHt() {
//        return ht;
//    }
//
//    public void setHt(String ht) {
//        this.ht = ht;
//    }
//
//    @Override
//    public String toString() {
//        return ma+" "+name+" "+ht;
//    }
//    
//}
