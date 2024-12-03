/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.util.*;
public class quanlybaitapnhom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split("\\s+");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        ArrayList<Sinhvien> arr=new ArrayList<>();
        while(n-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String sdt=sc.nextLine();
            int nhom=Integer.parseInt(sc.nextLine());
            arr.add(new Sinhvien(id, name, sdt, nhom));
            
        }
        for(int i=0;i<m;i++){
            String a=sc.nextLine();
            for(Sinhvien j:arr){
                if(j.getNhom()-1==i){
                    j.setDetai(a);
                }
            }
        }
        Collections.sort(arr);
        for(Sinhvien i:arr){
            System.out.println(i);
        }
    }
}

class Sinhvien implements Comparable<Sinhvien>{
    private String id,name,sdt,detai;
    private int nhom;

    public Sinhvien(String id, String name, String sdt, int nhom) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDetai(String detai) {
        this.detai = detai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    } 

    
    @Override
    public String toString() {
        return id+" "+name+ " "+sdt+" "+nhom+" "+detai;
    }

    @Override
    public int compareTo(Sinhvien o) {
        return id.compareTo(o.id);
    }
    
}