/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author chien
 */
public class tinh_tien_dien {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"));
            int t = Integer.parseInt(br.readLine());
            ArrayList<KH> a=new ArrayList<>();
            while (t-- > 0) {
                String name = br.readLine();
                String[] s = br.readLine().trim().split("\\s+");
                String type = s[0].toUpperCase();
                long d1=Long.parseLong(s[1]);
                long d2=Long.parseLong(s[2]);
                a.add(new KH(name, type, d1, d2));
            }
            Collections.sort(a, new Comparator<KH>(){
                @Override
                public int compare(KH a,KH b){
                    return Long.compare(b.getTotal(), a.getTotal());
                }
            });
            for(KH i: a){
                System.out.println(i);
            }

            
        } catch (Exception e) {
        }
    }
}

class KH {
    private static int stt=0;
    private String ma;
    private String name;
    private String type;
    private long d1, d2;
    private long total;
    private long trongdm,ngoaidm,vat;

    public KH(String name, String type, long d1, long d2) {
        String n[] = name.trim().split("\\s+");
        String rname = "";
        for (String i : n) {
            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        stt++;
        this.name = rname;
        this.ma = String.format("KH%02d",stt);
        this.d1 = d1;
        this.d2 = d2;
        this.type=type;
        if(d2-d1<=dinhmuc(type)){
            this.total=(d2-d1)*450;
            this.trongdm=this.total;
            this.ngoaidm=0;
            this.vat=0;
        }
        else{
            this.trongdm=dinhmuc(type)*450;
            this.ngoaidm=(d2-d1-dinhmuc(type))*1000;
            this.vat=this.ngoaidm*5/100;
            this.total=this.trongdm+this.ngoaidm+this.vat;
        }
    }

    public long getTotal() {
        return total;
    }
    public long dinhmuc(String a){
        if(a.equals("A")) return 100;
        if(a.equals("B")) return 500;
        return 200;
    }
    @Override
    public String toString() {
        return ma+" "+name + ""+trongdm+" "+ngoaidm+" "+vat+" "+total;
    }

}
