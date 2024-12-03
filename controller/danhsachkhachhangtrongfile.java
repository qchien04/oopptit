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
public class danhsachkhachhangtrongfile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Khach> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String gt=sc.nextLine();
            String ns=sc.nextLine();
            String dc=sc.nextLine();
            arr.add(new Khach(name, gt, ns, dc));
        }
        Collections.sort(arr,(Khach a,Khach b)->{
            SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
            Date d1;
            try {
                d1 = df.parse(a.getNs());
                Date d2=df.parse(b.getNs());
            return d1.compareTo(d2);
            } catch (ParseException ex) {
                Logger.getLogger(danhsachkhachhangtrongfile.class.getName()).log(Level.SEVERE, null, ex);
            }
            return 0;
        
        });
        for(Khach i:arr){
            System.out.println(i);
        }
    }
}
class Khach{
    private static int stt=0;
    private String id,name,gt,ns,dc;

    public static int getStt() {
        return stt;
    }

    public static void setStt(int stt) {
        Khach.stt = stt;
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

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }
    public Khach(String name, String gt, String ns, String dc) {
        this.id = String.format("KH%03d", ++stt);
        String s[]=name.trim().split("\\s+");
        String ans="";
        for(String i:s){
            ans+=((i.charAt(0)+"").toUpperCase()+i.substring(1).toLowerCase())+" ";
        }
        this.name = ans;
        this.gt = gt;
        if(ns.charAt(1)=='/'){
            ns="0"+ns;
        }
        if(ns.charAt(4)=='/'){
            ns=ns.substring(0,3)+"0"+ns.substring(3);
        }
        this.ns = ns;
        this.dc = dc;
    }

    @Override
    public String toString() {
        return id+" "+name+""+gt+" "+dc+" "+ns;
    }
    
    
    
}
