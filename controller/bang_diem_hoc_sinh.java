//            /*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class bang_diem_hoc_sinh {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        ArrayList<Student> arr=new ArrayList<>();
//        while(t-->0){
//            String name=sc.nextLine();
//            BigDecimal[] a=new BigDecimal[10];
//            String[] s=sc.nextLine().trim().split("\\s+");
//            for(int i=0;i<10;i++){
//                a[i]=new BigDecimal(s[i]);
//            }
//            arr.add(new Student(name, a));
//        }
//        Collections.sort(arr);
//        for(Student i : arr){
//            System.out.println(i);
//        }
//    }
//}
//class Student implements Comparable<Student>{
//    private static int stt=0;
//    private String id;
//    private String name;
//    private BigDecimal[] d=new BigDecimal[10];
//    public Student(String name,BigDecimal[] a) {
//        stt++;
//        this.id=String.format("HS%02d", stt);
//        this.name = name;
//        for(int i=0;i<10;i++){
//            this.d[i]=a[i];
//        }
//    }
//    public double getDtb(){
//        BigDecimal sum = d[1].add(d[0]);
//        for(int i = 0; i < 10; i++){
//            sum=sum.add(d[i]);
//        }
//        BigDecimal average = sum.divide(BigDecimal.valueOf(12), 1, RoundingMode.HALF_UP);
//        return average.doubleValue();
//    }
//    private String getRank(){
//        double a=getDtb();
//        if(a>=9) return "XUAT SAC";
//        if(a>=8) return "GIOI";
//        if(a>=7) return "KHA";
//        if(a>=5) return "TB";
//        return "YEU";
//    }
//
//    @Override
//    public String toString() {
//        return id+" "+name+" "+getDtb()+" "+getRank();
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return Double.compare(o.getDtb(), this.getDtb());
//    }
//    
//}
