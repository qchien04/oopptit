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
public class sapxeplichthi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONTHI.in"));
        Scanner sc2=new Scanner(new File("CATHI.in"));
        Scanner sc3=new Scanner(new File("LICHTHI.in"));
        ArrayList<mon> arr1=new ArrayList<>();
        ArrayList<ca> arr2=new ArrayList<>();
        ArrayList<lich> arr3=new ArrayList<>();
        
        
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String ht=sc.nextLine();
            arr1.add(new mon(id, name, ht));
        }
         t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String ngay=sc2.nextLine();
            String gio=sc2.nextLine();
            String phong=sc2.nextLine();
            arr2.add(new ca(ngay, gio, phong));
        }
         t=Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String s[]=sc3.nextLine().split("\\s+");
            lich l=new lich(s[2], Integer.parseInt(s[3]));
            for(ca i:arr2){
                if(i.getId().equals(s[0])){
                    l.setC(i);
                }
            }
            for(mon i:arr1){
                if(i.getId().equals(s[1])){
                    l.setM(i);
                }
            }
            arr3.add(l);
        }
        Collections.sort(arr3);
        for(lich i:arr3){
            System.out.println(i);
        }
        
        
    }
}
class lich implements Comparable<lich>{
    private ca c;
    private mon m;
    private String idnhom;
    private int sl;

    public lich(String idnhom, int sl) {
        this.idnhom = idnhom;
        this.sl = sl;
    }

    public ca getC() {
        return c;
    }

    public void setC(ca c) {
        this.c = c;
    }

    public mon getM() {
        return m;
    }

    public void setM(mon m) {
        this.m = m;
    }

    public String getIdnhom() {
        return idnhom;
    }

    public void setIdnhom(String idnhom) {
        this.idnhom = idnhom;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    @Override
    public String toString() {
        return c.getNgay()+" "+c.getGio()+" "+c.getPhong()+" "+m.getName()+" "+idnhom+" "+sl;
    }

    @Override
    public int compareTo(lich o) {
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy hh:mm");
        try {
            Date d1=df.parse(c.getNgay()+" "+c.getGio());
            Date d2=df.parse(o.c.getNgay()+" "+o.c.getGio());
            if(d1.compareTo(d2)!=0){
                return d1.compareTo(d2);
            }
            return c.getId().compareTo(o.c.getId());
        } catch (ParseException ex) {
            Logger.getLogger(lich.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
class ca{
    private static int stt=0;
    private String id,ngay,gio,phong;

    public ca(String ngay, String gio, String phong) {
        this.id = String.format("C%03d", ++stt);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }

    public static int getStt() {
        return stt;
    }

    public String getId() {
        return id;
    }

    public String getNgay() {
        return ngay;
    }

    public String getGio() {
        return gio;
    }

    public String getPhong() {
        return phong;
    }
    
    
}
class mon{
    private String id,name,ht;

    public mon(String id, String name, String ht) {
        this.id = id;
        this.name = name;
        this.ht = ht;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHt() {
        return ht;
    }
    
}