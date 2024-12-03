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
public class xep_hang_hoc_sinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<HS> arr=new ArrayList<>();
      
        while(t-->0){
            String name=sc.nextLine();
            double diem=Double.parseDouble(sc.nextLine());
            HS tmp=new HS(name, diem);
            arr.add(tmp);
            
        }
        ArrayList<HS> arr2= (ArrayList<HS>) arr.clone();
        Collections.sort(arr);
        arr.get(0).setXephang(1);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i).getDiem()!=arr.get(i-1).getDiem()){
                arr.get(i).setXephang(i+1);
            }
            else arr.get(i).setXephang(arr.get(i-1).getXephang());
        }
        for(HS i:arr2){
            System.out.println(i);
        }
        
   }
}

class HS implements Comparable<HS>,Cloneable{
    private static int stt=1;
    private String id,name;
    private double diem;
    private String xl;
    private int xephang;

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getXephang() {
        return xephang;
    }

    public void setXephang(int xephang) {
        this.xephang = xephang;
    }

    public HS(String name, double diem) {
        this.id ="HS"+String.format("%02d", stt++);
        this.name = name;
        this.diem = diem;
        if(diem>=9){
            this.xl="Gioi";
        }
        else if(diem>=7){
             this.xl="Kha";
        }
        else if(diem>=5){
             this.xl="Trung Binh";
        }
        else this.xl="Yeu";
    }

    public static int getStt() {
        return stt;
    }

    public static void setStt(int stt) {
        HS.stt = stt;
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

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+String.format("%.1f", diem)+" "+xl+" "+xephang;
    }

    @Override
    public int compareTo(HS o) {
        return -Double.compare(diem, o.diem);
    }
    
    
}