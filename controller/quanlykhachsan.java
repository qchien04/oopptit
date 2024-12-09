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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class quanlykhachsan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<phong> arr=new ArrayList<>();
        while(t-->0){
            String s[]=sc.nextLine().split("\\s+");
            arr.add(new phong(s[0],s[1],Double.parseDouble(s[2]),Double.parseDouble(s[3])));
        }
        
        t=Integer.parseInt(sc.nextLine());
        ArrayList<khach> arr2=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String mp=sc.nextLine();
            String n1=sc.nextLine();
            String n2=sc.nextLine();
            khach k=new khach(name, mp, n1, n2);
            for(phong i:arr){
                if(i.getKihieu().equals(mp.charAt(2)+"")){
                    k.setP(i);
                    break;
                }
            }
            
            arr2.add(k);
        }
        Collections.sort(arr2);
        for(khach i:arr2){
            System.out.println(i);
        }
    }
}
class phong{
    private String kihieu,name;
    private double dongia,ppv;

    public phong(String kihieu, String name, double dongia, double ppv) {
        this.kihieu = kihieu;
        this.name = name;
        this.dongia = dongia;
        this.ppv = ppv;
    }

    public String getKihieu() {
        return kihieu;
    }

    public String getName() {
        return name;
    }

    public double getDongia() {
        return dongia;
    }

    public double getPpv() {
        return ppv;
    }
    
}
class khach implements Comparable<khach>{
    private static int stt=0;
    private String id,name,mp,n1,n2;
    private phong p;
    public khach(String name, String mp, String n1, String n2) {
        this.id = String.format("KH%02d", ++stt);
        this.name = name;
        this.mp = mp;
        this.n1 = n1;
        this.n2 = n2;
    }
    private long getsongay(){
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d1=df.parse(n1);
            Date d2=df.parse(n2);
            long ngay=(d2.getTime()-d1.getTime())/1000/24/60/60;
            return ngay;
        } catch (ParseException ex) {
            Logger.getLogger(khach.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public void setP(phong p) {
        this.p = p;
    }
    private int getpcgg(){
        long ngay=getsongay();
        if(ngay>=30) return 6;
        if(ngay>=20) return 4;
        if(ngay>=10) return 2;
        return 0;
    }
    private double gettien(){
        long ngay=getsongay()!=0?getsongay():1;
        double giagoc=p.getDongia()*ngay*(100.0-getpcgg())/100;
        double phi=p.getPpv()*giagoc;
        
        return (phi+giagoc);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+mp+" "+getsongay()+" "+String.format("%.2f", gettien());
    }

    @Override
    public int compareTo(khach o) {
        return Long.compare(o.getsongay(),getsongay());
    }
    
}