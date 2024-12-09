///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
///**
// *
// * @author chien
// */
//import java.util.*;
//public class quanlybanhang2 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        ArrayList<khach> a1=new ArrayList<>();
//        while(t-->0){
//            String name=sc.nextLine();
//            String gt=sc.nextLine();
//            String ns=sc.nextLine();
//            String dc=sc.nextLine();
//            
//            a1.add(new khach(name, gt, ns, dc));
//        }
//         t=Integer.parseInt(sc.nextLine());
//        ArrayList<hang> a2=new ArrayList<>();
//        while(t-->0){
//            String name=sc.nextLine();
//            String dv=sc.nextLine();
//            long mua=Long.parseLong(sc.nextLine());
//            long ban=Long.parseLong(sc.nextLine());
//            
//            a2.add(new hang(name, dv, mua, ban));
//        }
//         t=Integer.parseInt(sc.nextLine());
//        ArrayList<hoadon> a3=new ArrayList<>();
//        while(t-->0){
//            String mk=sc.next();
//            String mh=sc.next();
//            long sl=sc.nextLong();
//            hoadon hd=new hoadon(mh, mk, sl);
//            for(khach i:a1){
//                if(i.getId().equals(mk)){
//                    hd.setK(i);
//                    break;
//                }
//            }
//            for(hang i:a2){
//                if(i.getId().equals(mh)){
//                    hd.setH(i);
//                    break;
//                }
//            }
//            a3.add(hd);
//        }
//        Collections.sort(a3);
//        for(hoadon i:a3){
//            System.out.println(i);
//        }
//        
//        
//        
//    }
//}
//
//class hoadon implements Comparable<hoadon>{
//    private static int stt=0;
//    private hang h;
//    private khach k;
//    private String id,ih,ik;
//    private long sl;
//
//    public hoadon(String ih, String ik, long sl) {
//        this.id = String.format("HD%03d", ++stt);
//        this.ih = ih;
//        this.ik = ik;
//        this.sl = sl;
//    }
//
//    @Override
//    public String toString() {
//        return id+" "+k.getName()+" "+k.getDc()+" "+h.getName()+" "+sl+" "+gettt()+" "+getln();
//    }
//
//    private long getln(){
//        return sl*(h.getBan()-h.getMua());
//    }
//    private long gettt(){
//        return sl*h.getBan();
//    }
//    public hang getH() {
//        return h;
//    }
//
//    public void setH(hang h) {
//        this.h = h;
//    }
//
//    public khach getK() {
//        return k;
//    }
//
//    public void setK(khach k) {
//        this.k = k;
//    }
//
//    public String getIh() {
//        return ih;
//    }
//
//    public void setIh(String ih) {
//        this.ih = ih;
//    }
//
//    public String getIk() {
//        return ik;
//    }
//
//    public void setIk(String ik) {
//        this.ik = ik;
//    }
//
//    public long getSl() {
//        return sl;
//    }
//
//    public void setSl(long sl) {
//        this.sl = sl;
//    }
//
//    @Override
//    public int compareTo(hoadon o) {
//        return Long.compare(o.getln(), getln());
//    }
//    
//    
//    
//    
//}
//class khach{
//    private static int stt=0;
//    private String id,name,gt,ns,dc;
//
//    public khach(String name, String gt, String ns, String dc) {
//        this.id = String.format("KH%03d", ++stt);
//        this.name = name;
//        this.gt = gt;
//        this.ns = ns;
//        this.dc = dc;
//    }
//
//    public static int getStt() {
//        return stt;
//    }
//
//    public static void setStt(int stt) {
//        khach.stt = stt;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGt() {
//        return gt;
//    }
//
//    public void setGt(String gt) {
//        this.gt = gt;
//    }
//
//    public String getNs() {
//        return ns;
//    }
//
//    public void setNs(String ns) {
//        this.ns = ns;
//    }
//
//    public String getDc() {
//        return dc;
//    }
//
//    public void setDc(String dc) {
//        this.dc = dc;
//    }
//    
//}
//class hang{
//    private static int stt=0;
//    private String id,name,dv;
//    private long mua,ban;
//
//    public hang(String name, String dv, long mua, long ban) {
//        this.id = String.format("MH%03d", ++stt);;
//        this.name = name;
//        this.dv = dv;
//        this.mua = mua;
//        this.ban = ban;
//    }
//
//    public static int getStt() {
//        return stt;
//    }
//
//    public static void setStt(int stt) {
//        hang.stt = stt;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDv() {
//        return dv;
//    }
//
//    public void setDv(String dv) {
//        this.dv = dv;
//    }
//
//    public long getMua() {
//        return mua;
//    }
//
//    public void setMua(long mua) {
//        this.mua = mua;
//    }
//
//    public long getBan() {
//        return ban;
//    }
//
//    public void setBan(long ban) {
//        this.ban = ban;
//    }
//    
//}