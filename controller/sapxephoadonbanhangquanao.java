///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author chien
// */
//import java.util.*;
//public class sapxephoadonbanhangquanao {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        ArrayList<spham> arr=new ArrayList<>();
//        
//        int t=Integer.parseInt(sc.nextLine());
//        while(t-->0){
//            String id=sc.nextLine();
//            String name=sc.nextLine();
//            long c1=Long.parseLong(sc.nextLine());
//            long c2=Long.parseLong(sc.nextLine());
//            arr.add(new spham(id, name, c1, c2));
//        }
//        ArrayList<hoadon> arr2=new ArrayList<>();
//        
//         t=Integer.parseInt(sc.nextLine());
//        while(t-->0){
//            String id=sc.next();
//            long sl=sc.nextLong();
//            for(spham i:arr){
//                if(i.getId().equals(id.substring(0,2))){
//                    arr2.add(new hoadon(id, i,id.endsWith("1")?i.getC1():i.getC2(), sl));
//                    
//                }
//            }
//    
//        }
//        Collections.sort(arr2);
//        for(hoadon i:arr2){
//            System.out.println(i);
//        }
//        
//    }
//}
//class hoadon implements Comparable<hoadon>{
//    private static int stt=0;
//    private String id;
//    private spham s;
//    private long cost,sl;
//
//    public hoadon(String id, spham s, long cost, long sl) {
//        this.id = id+String.format("-%03d", ++stt);
//        this.s = s;
//        this.cost = cost;
//        this.sl = sl;
//    }
//    private long get1(){
//        if(sl>=150){
//            return sl*cost/2;
//        }
//        if(sl>=100){
//            return sl*cost*30/100;
//        }
//        if(sl>=50){
//            return sl*cost/100*15;
//        }
//        return 0;
//    }
//    
//    private long get2(){
//        return sl*cost-get1();
//    }
//    @Override
//    public String toString() {
//        return id+" "+s.getName()+" "+get1()+" "+get2();
//    }
//
//    @Override
//    public int compareTo(hoadon o) {
//        return Long.compare(o.get2(), get2());
//    }
//    
//    
//    
//}
//class spham{
//    private String id,name;
//    private long c1,c2;
//
//    public spham(String id, String name, long c1, long c2) {
//        this.id = id;
//        this.name = name;
//        this.c1 = c1;
//        this.c2 = c2;
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
//    public long getC1() {
//        return c1;
//    }
//
//    public void setC1(long c1) {
//        this.c1 = c1;
//    }
//
//    public long getC2() {
//        return c2;
//    }
//
//    public void setC2(long c2) {
//        this.c2 = c2;
//    }
//    
//}
