/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class hoadon2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("KH.in"));
        Scanner sc2=new Scanner(new File("MH.in"));
        Scanner sc3=new Scanner(new File("HD.in"));
        
        ArrayList<khachhang> arrk=new ArrayList<>();
        ArrayList<mathang> arrh=new ArrayList<>();
        ArrayList<hoadon> arrhd=new ArrayList<>();
        
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine();
            String gt=sc.nextLine();
            String ns=sc.nextLine();
            String dc=sc.nextLine();
            arrk.add(new khachhang(name, gt, ns, dc));
            
        }
        t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String name=sc2.nextLine();
            String dv=sc2.nextLine();
            long mua=Long.parseLong(sc2.nextLine());
            long ban=Long.parseLong(sc2.nextLine());
            arrh.add(new mathang(name, dv, mua, ban));
        }
        t=Integer.parseInt(sc3.nextLine());
        
        while(t-->0){
            String s[]=sc3.nextLine().split("\\s+");
            hoadon hd=new hoadon(s[0], s[1], Long.parseLong(s[2]));
            for(khachhang i:arrk){
                if(i.getId().equals(s[0])){
                    hd.setKh(i);
                    break;
                }
            }
            for(mathang i:arrh){
                if(i.getId().equals(s[1])){
                    hd.setMh(i);
                    break;
                }
            }
            arrhd.add(hd);
            
        }
        
           
        
        for(hoadon i:arrhd){
            System.out.println(i);
        }
        
        
        
        
    }
}   

class hoadon implements Comparable<hoadon>{
    private static int stt=0;
    private String id,idkhach,idhang;
    private long sl;
    private mathang mh;
    private khachhang kh;
    public hoadon(String idkhach, String idhang, long sl) {
        this.id=String.format("HD%03d", ++stt);
        this.idkhach = idkhach;
        this.idhang = idhang;
        this.sl = sl;
    }

    private long gettt(){
        return sl*mh.getBan();
    }
    @Override
    public String toString() {
        return id+" "+kh.getName()+" "+kh.getDc()+" "+mh.getName()+" "+
                mh.getDv()+" "+mh.getMua()+" "+mh.getBan()+" "+sl+" "+
                        gettt();
    }
    
    public static int getStt() {
        return stt;
    }

    public static void setStt(int stt) {
        hoadon.stt = stt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdkhach() {
        return idkhach;
    }

    public void setIdkhach(String idkhach) {
        this.idkhach = idkhach;
    }

    public String getIdhang() {
        return idhang;
    }

    public void setIdhang(String idhang) {
        this.idhang = idhang;
    }

    public long getSl() {
        return sl;
    }

    public void setSl(long sl) {
        this.sl = sl;
    }

    public mathang getMh() {
        return mh;
    }

    public void setMh(mathang mh) {
        this.mh = mh;
    }

    public khachhang getKh() {
        return kh;
    }

    public void setKh(khachhang kh) {
        this.kh = kh;
    }

    @Override
    public int compareTo(hoadon o) {
        return Long.compare(gettt(), o.gettt());
    }
    
    
    
}

class mathang{
    private static int stt=0;
    private String id,name,dv;
    private long mua,ban;

    public mathang(String name,String dv, long mua, long ban) {
        this.id = String.format("MH%03d", ++stt);
        this.name = name;
        this.dv=dv;
        this.mua = mua;
        this.ban = ban;
    }

    public static int getStt() {
        return stt;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public static void setStt(int stt) {
        mathang.stt = stt;
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

    public long getMua() {
        return mua;
    }

    public void setMua(long mua) {
        this.mua = mua;
    }

    public long getBan() {
        return ban;
    }

    public void setBan(long ban) {
        this.ban = ban;
    }
    
    
}


class khachhang{
    private static int stt=0;
    private String id,name,gt,ns,dc;

    public khachhang(String name, String gt, String ns, String dc) {
        this.id = String.format("KH%03d", ++stt);
        this.name = name;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }

    public static int getStt() {
        return stt;
    }

    public static void setStt(int stt) {
        khachhang.stt = stt;
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
    
    
    
    
}