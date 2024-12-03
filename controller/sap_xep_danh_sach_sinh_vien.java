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
//public class sap_xep_danh_sach_sinh_vien {
//    public static void main(String[] args) {
//        try {
//            BufferedReader br =new BufferedReader(new FileReader("SINHVIEN.in"));
//            int t=Integer.parseInt(br.readLine());
//            ArrayList<SinhVien> arr=new ArrayList<>();
//            while(t-->0){
//                String msv=br.readLine();
//                String name=br.readLine();
//                String sdt=br.readLine();
//                String email=br.readLine();
//                arr.add(new SinhVien(msv, name, sdt, email));
//                
//            }
//            Collections.sort(arr);
//            for(SinhVien i:arr){
//                System.out.println(i);
//            }
//        } catch (Exception e) {
//        }
//    }
//}
//class SinhVien implements Comparable<SinhVien>{
//    private String msv;
//    private Name name;
//    private String sdt;
//    private String email;
//
//    public SinhVien(String msv, String name, String sdt, String email) {
//        this.msv = msv;
//        this.name = new Name(name);
//        this.sdt = sdt;
//        this.email = email;
//    }
//
//    @Override
//    public int compareTo(SinhVien o) {
//        if(!this.name.equals(o.name)) return this.name.compareTo(o.name);
//        return this.msv.compareTo(o.msv);
//    }
//
//    @Override
//    public String toString() {
//        return msv+" "+name+""+sdt+" "+email;
//    }
//    
//}
//
//
//
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
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false; 
//
//        Name o = (Name) obj;
//        return this.name.equals(o.name);
//    }
//
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
//
