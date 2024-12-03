package controller;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class liet_ke_sinh_vien_theo_khoa {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> a=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            String ma=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            a.add(new SinhVien(ma,name,lop,mail));
        }
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String cl=sc.nextLine();
            int k=Integer.parseInt(cl.substring(2,4));
            //System.out.println(k);
            System.out.println("DANH SACH SINH VIEN KHOA "+cl+":");
            for (SinhVien sv:a)
            {
                if(sv.getK()==k){
                    System.out.println(sv);
                }
            }
            
        }
    }

}

class SinhVien  implements Comparable<SinhVien>{
    private String ma;
    private String name,lop,mail;

    public SinhVien(String ma, String name, String lop, String mail) {
        this.ma = ma;
        this.name=name;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    @Override
    public int compareTo( SinhVien another)
    {
        return this.ma.compareTo(another.ma);
    }
    public int getK(){
        return Integer.parseInt(this.lop.substring(1,3));
    }

    @Override
    public String toString() {
        return   this.ma + " " + this.name+" "  + this.lop + " " + this.mail ;
    }
    
    
}