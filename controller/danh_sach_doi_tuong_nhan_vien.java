/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class danh_sach_doi_tuong_nhan_vien {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Employee> a=new ArrayList<>();
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            String name=sc.nextLine();
            String gioitinh=sc.nextLine();
            String birth=sc.nextLine();
            String address=sc.nextLine();
            String mst=sc.nextLine();
            String ngaykihd=sc.nextLine();
            Employee e1=new Employee(name, gioitinh, df.parse(birth), address, mst, ngaykihd);
            a.add(e1);
        }
        Collections.sort(a);
        for(Employee i: a){
            System.out.println(i);
        }

    }
}
class Employee implements Comparable<Employee>{
    private String name;
    private String mnv;
    private String gioitinh;
    private Date birth;
    private String address;
    private String mst;
    private String ngaykihd;
    private static int stt=0;

    public Employee(String name, String gioitinh, Date birth, String address, String mst, String ngaykihd) {
        this.name = name;
        stt++;
        this.mnv = String.format("%05d", stt);
        this.gioitinh = gioitinh;
        this.birth = birth;
        this.address = address;
        this.mst = mst;
        this.ngaykihd = ngaykihd;
    }

    

    @Override
    public String toString() {
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        return mnv+" "+name+" "+gioitinh+" "+df.format(birth)+" "+address+" "+mst+" "+ngaykihd;
    }

    @Override
    public int compareTo(Employee o) {
        return this.birth.compareTo(o.birth);
    }
}
