/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author chien
 */
import java.util.*;
public class danh_sach_dong_phuc_sinh_vien_ptit {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br=new BufferedReader(new FileReader("SINHVIEN.in"));
        int t=Integer.parseInt(br.readLine());
        ArrayList<SV1> arr=new ArrayList<>();
        while(t-->0){
            String id=br.readLine();
            String name=br.readLine();
            String gender=br.readLine();
            String clss=br.readLine();
            String mail=br.readLine();
            String phone=br.readLine();
            arr.add(new SV1(id, name, clss, mail, phone,gender));
        }
        Scanner sc=new Scanner(new FileReader("DANGKY.in"));
        while(sc.hasNext()){
            String[] si=sc.nextLine().split("\\s+");
            for(SV1 i: arr){
                if(i.getId().equals(si[0])){
                    i.setSize(si[1]);
                }
            }
        }
        Collections.sort(arr);
        Scanner sc1=new Scanner(System.in);
        int n=Integer.parseInt(sc1.nextLine());
        for(int i=0;i<n;i++){
            String[] a=sc1.nextLine().split("\\s+");
            System.out.println("DANH SACH SINH VIEN "+a[0].toUpperCase()+" DANG KY SIZE "+a[1]);
            for(SV1 j: arr){
                if(j.getGender().equals(a[0])&&j.getSize().equals(a[1])){
                    System.out.println(j);
                }
                
            }
        }
 
    
    }
}
class SV1 implements Comparable<SV1>{
    private String id,name,clss,mail,phone,gender;
    private String size;

    public SV1(String id, String name, String clss, String mail, String phone, String gender) {
        this.id = id;
        this.name = name;
        this.clss = clss;
        this.mail = mail;
        this.phone = phone;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }
    
    @Override
    public String toString() {
        return id+" "+name+" "+clss+" "+mail+" "+phone;
    }

    @Override
    public int compareTo(SV1 o) {
        return id.compareTo(o.id);
    }
    
    
}