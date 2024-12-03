/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class hoadon1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =new Scanner(new File("DATA1.in"));
        Scanner sc2 =new Scanner(new File("DATA2.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long c1=Long.parseLong(sc.nextLine());
            long c2=Long.parseLong(sc.nextLine());
            arr.add(new SanPham(id, name, c1, c2));
        }
        sc.close();
        t=Integer.parseInt(sc2.nextLine());
        ArrayList<HoaDon> arr2=new ArrayList<>();
        while(t-->0){
            String[] details=sc2.nextLine().split("\\s+");
            HoaDon hd=new HoaDon(details[0], Long.parseLong(details[1]));
            for(SanPham i:arr){
                if(i.getId().equals(details[0].substring(0,2))){
                    hd.setSanPham(i);
                    break;
                }
            }
            arr2.add(hd);
        }
        for(HoaDon i:arr2){
            System.out.println(i);
        }
        
    }
}


class SanPham{
    private String id,name;
    private long c1,c2;

    public SanPham(String id, String name, long c1, long c2) {
        this.id = id;
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getC1() {
        return c1;
    }

    public void setC1(long c1) {
        this.c1 = c1;
    }

    public long getC2() {
        return c2;
    }

    public void setC2(long c2) {
        this.c2 = c2;
    }
    
}


class HoaDon{
    private static int stt=0;
    private String id;
    private long quantity;
    private SanPham sanPham;

    public HoaDon(String id, long quantity) {
        this.id = id+String.format("-%03d", ++stt);
        this.quantity = quantity;
    }
    private long getPcGiamgia(){
        if(quantity>=150) return 50;
        if(quantity>=100) return 30;
        if(quantity>=50) return 15;
        return 0;
    }
    private long getGiamgia(){
        long cost=sanPham.getC1();
        if(id.charAt(2)=='2'){
            cost=sanPham.getC2();
        }
        return cost*quantity/100*getPcGiamgia();
    }
    private long getTotal(){
        long cost=sanPham.getC1();
        if(id.charAt(2)=='2'){
            cost=sanPham.getC2();
        }
        return cost*quantity-getGiamgia();
    }
    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public String toString() {
        return id+" "+sanPham.getName()+" "+getGiamgia()+" "+getTotal();
    }
    
    
    
}