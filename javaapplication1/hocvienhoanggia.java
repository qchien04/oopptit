/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chien
 */
public class hocvienhoanggia {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br=new BufferedReader(new FileReader("MONTHI.in"));
        ArrayList<MonThi> mon_arr=new ArrayList<>();
        
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String ma=br.readLine();
            String ten=br.readLine();
            String hinhthuc=br.readLine();
            mon_arr.add(new MonThi(ma, ten, hinhthuc));
        }
        br.close();
        ArrayList<CaThi> ca_arr=new ArrayList<>();
        BufferedReader br2=new BufferedReader(new FileReader("CATHI.in"));
        int m=Integer.parseInt(br2.readLine());
        for(int i=0;i<m;i++){
            String ngay=br2.readLine();
            String gio=br2.readLine();
            String phongthi=br2.readLine();
            ca_arr.add(new CaThi(ngay, gio, phongthi));
        }
        br2.close();
        ArrayList<Lichthi> lich_arr=new ArrayList<>();
        BufferedReader br3=new BufferedReader(new FileReader("LICHTHI.in"));
        int k=Integer.parseInt(br3.readLine());
        for(int i=0;i<k;i++){
            String[] l=br3.readLine().split("\\s+");
            String maca =l[0];
            String mamon=l[1];
            String manhom=l[2];
            int sosv=Integer.parseInt(l[3]);
            MonThi monThi=new MonThi();
            CaThi caThi=new CaThi();
            for(CaThi j:ca_arr){
                if(j.getMacathi().equals(maca)){
                    caThi=j;
                    break;
                }
            }
            for(MonThi j:mon_arr){
                if(j.getMa().equals(mamon)){
                    monThi=j;
                    break;
                }
            }
            Lichthi lichthi=new Lichthi(maca, mamon, manhom,sosv); 
            lichthi.setCaThi(caThi);
            lichthi.setMonThi(monThi);
            lich_arr.add(lichthi);
        }
        Collections.sort(lich_arr);
        for(Lichthi i: lich_arr){
            System.out.println(i);
        }
    }
}

class MonThi{
    private String ma,ten,hinhthuc;

    public MonThi(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ten;
    }

    public MonThi() {
    }
    
    
}
class CaThi{

    public CaThi() {
    }
    
    private static int stt=0;
    private String macathi,ngay,gio;
    private String phongthi;

    public CaThi(String ngay, String gio, String phongthi) {
        stt++;
        this.macathi=String.format("C%03d", stt);
        this.ngay = ngay;
        this.gio = gio;
        this.phongthi = phongthi;
    }

    @Override
    public String toString() {
        return ngay+" "+gio+" "+phongthi;
    }

    public String getMacathi() {
        return macathi;
    }

    public String getNgay() {
        return ngay;
    }

    public String getGio() {
        return gio;
    }
    
}

class Lichthi implements Comparable<Lichthi>{
    private String macathi,mamon,manhom;
    private int sosv;
    
    private CaThi caThi;
    private MonThi monThi;
    public Lichthi(String macathi, String mamon, String manhom, int sosv) {
        this.macathi = macathi;
        this.mamon = mamon;
        this.manhom = manhom;
        this.sosv = sosv;
    }

    public void setCaThi(CaThi caThi) {
        this.caThi = caThi;
    }

    public void setMonThi(MonThi monThi) {
        this.monThi = monThi;
    }

    @Override
    public String toString() {
        return caThi+" "+monThi+" "+manhom+" "+sosv;
    }

    @Override
    public int compareTo(Lichthi o) {
        String dateString1 = caThi.getNgay();
        String dateString2= o.caThi.getNgay();
        String timeString1 = caThi.getGio();
        String timeString2= o.caThi.getGio();
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter1 = new SimpleDateFormat("hh:mm");
        try {
            Date date1 = formatter2.parse(dateString1);
            Date date2 = formatter2.parse(dateString2);
            Date time1 = formatter1.parse(timeString1);
            Date time2 = formatter1.parse(timeString2);
            if(date1.compareTo(date2)!=0){
                return -date1.compareTo(date2);
            }
            if(time1.compareTo(time2)!=0){
                return -time2.compareTo(time1);
            }
            
        } catch (ParseException ex) {
        }
        
        return macathi.compareTo(o.macathi);
    }
    
    
}
