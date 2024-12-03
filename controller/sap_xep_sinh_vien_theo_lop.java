//package controller;
//
//
//import java.io.File;
//
//import java.io.FileNotFoundException;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class sap_xep_sinh_vien_theo_lop {
//
//    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc=new Scanner(System.in);
//        List<SinhVien> a=new ArrayList<>();
//        while(sc.hasNext()){
//            String ma=sc.nextLine();
//            String name=sc.nextLine();
//            String lop=sc.nextLine();
//            String mail=sc.nextLine();
//            a.add(new SinhVien(ma,name,lop,mail));
//        }
//        Collections.sort(a);
//        for (SinhVien sv:a)
//        {
//            System.out.println(sv);
//        }
//    }
//
//}
//
//class SinhVien  implements Comparable<SinhVien>{
//    private String ma;
//    private String name,lop,mail;
//
//    public SinhVien(String ma, String name, String lop, String mail) {
//        this.ma = ma;
////        String[] word1=name.trim().split("\\s+");
////        String s1="";
////        for (String word :word1)
////            {
////                String s=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();    
////                s1=s1+s+" ";
////            }
//        this.name=name;
//        this.lop = lop;
//        this.mail = mail;
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
//    public String getLop() {
//        return lop;
//    }
//
//    public void setLop(String lop) {
//        this.lop = lop;
//    }
//
//    public String getMail() {
//        return mail;
//    }
//
//    public void setMail(String mail) {
//        this.mail = mail;
//    }
//    @Override
//    public int compareTo( SinhVien another)
//    {
////        if(!this.lop.equals(another.lop)){
////            return this.lop.compareTo(another.lop);
////        }
//        return this.ma.compareTo(another.ma);
//    }
//
//    @Override
//    public String toString() {
//        return   this.ma + " " + this.name+" "  + this.lop + " " + this.mail ;
//    }
//    
//    
//}