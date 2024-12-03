//package controller;
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
//public class liet_ke_sinh_vien_theo_nganh {
//
//    public static void main(String[] args) throws FileNotFoundException{
//        Scanner sc=new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        List<SinhVien> a=new ArrayList<>();
//        for (int i=0;i<n;i++)
//        {
//            String ma=sc.nextLine();
//            String name=sc.nextLine();
//            String lop=sc.nextLine();
//            String mail=sc.nextLine();
//            a.add(new SinhVien(ma,name,lop,mail));
//        }
//        int t=Integer.parseInt(sc.nextLine());
//        while(t-->0){
//            String cl=sc.nextLine().trim();
//            System.out.println("DANH SACH SINH VIEN NGANH "+cl.toUpperCase()+":");
//            for (SinhVien sv:a)
//            {
//                if(sv.getJ().equals(cl)){
//                    System.out.println(sv);
//                }
//            }
//            
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
//        return this.ma.compareTo(another.ma);
//    }
//    public String getJ(){
//        String code=this.ma;
//        if(code.contains("DCKT")) return "Ke toan";
//        if(code.contains("DCCN")&&!this.lop.startsWith("E")) return "Cong nghe thong tin";
//        if(code.contains("DCAT")&&!this.lop.startsWith("E")) return "An toan thong tin";
//        if(code.contains("DCVT")) return "Vien thong";
//        if(code.contains("DCDT")) return "Dien tu";
//        return "";
//    }
//
//    @Override
//    public String toString() {
//        return   this.ma + " " + this.name+" "  + this.lop + " " + this.mail ;
//    }
//    
//    
//}