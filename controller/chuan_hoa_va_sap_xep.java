///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.Collections;
//
///**
// *
// * @author chien
// */
//public class chuan_hoa_va_sap_xep {
//    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("DANHSACH.in"));
//            ArrayList<Name> arr=new ArrayList<>();
//            String name;
//            while((name=br.readLine())!=null){
//                arr.add(new Name(name));
//            }
//            Collections.sort(arr);
//            for(Name i:arr){
//                System.out.println(i);
//            }
//
//        } catch (Exception e) {
//        }
//    }
//}
//class Name implements Comparable<Name>{
//    private String name;
//    private String fname;
//    private String lname;
//    private String mname;
//
//    public Name(String name) {
//        String n[] = name.trim().split("\\s+");
//        String rname = "";
//        for (String i : n) {
//            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
//        }
//        n=rname.split("\\s+");
//        this.name = rname;
//        this.fname=n[0];
//        this.lname=n[n.length-1];
//        String tmp="";
//        for(int i=1;i<n.length-1;i++){
//            tmp+=n[i];
//        }
//        this.mname=tmp;
//    }
//    @Override
//    public int compareTo(Name other){
//        if(!this.lname.equals(other.lname)) return this.lname.compareTo(other.lname);
//        if(!this.fname.equals(other.fname)) return this.fname.compareTo(other.fname);
//        return this.mname.compareTo(other.mname);
//    
//    }
//    @Override
//    public String toString() {
//        return name;
//    }
//    
//    
//}
