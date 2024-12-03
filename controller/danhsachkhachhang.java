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
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//public class danhsachkhachhang {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        ArrayList<KH> arr=new ArrayList<>();
//        int t=Integer.parseInt(sc.nextLine());
//        while(t-->0){
//            String name=sc.nextLine();
//            String gt=sc.nextLine();
//            String ns=sc.nextLine();
//            String diachi=sc.nextLine();
//            arr.add(new KH(name, gt, ns, diachi));
//            
//        }
//        Collections.sort(arr);
//        for(KH i:arr){
//            System.out.println(i);
//        }
//    }
//}
//class KH implements Comparable<KH>{
//    private static int stt=1;
//    private String id,name,gt,ns,diachi;
//
//    public KH(String name, String gt, String ns, String diachi) {
//        this.id="KH"+String.format("%03d", stt++);
//        String[] s=name.trim().split("\\s+");
//        String res="";
//        for(String i:s){
//            res+=(i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase())+" ";
//        }
//        this.name = res;
//        this.gt = gt;
//        if(ns.charAt(1)=='/'){
//            ns="0"+ns;
//        }
//        if(ns.charAt(4)=='/'){
//            ns=ns.substring(0,3)+"0"+ns.substring(3);
//        }
//        this.ns = ns;
//        this.diachi = diachi;
//    }
//
//    @Override
//    public String toString() {
//        return id+" "+name+""+gt+" "+diachi+" "+ns;
//    }
//
//    @Override
//    public int compareTo(KH o) {
//        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//        
//        try {
//            Date d1=df.parse(ns);
//            Date d2=df.parse(o.ns);
//            return d1.compareTo(d2);
//        } catch (ParseException ex) {
//            Logger.getLogger(KH.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return 0;
//    }
//    
//}