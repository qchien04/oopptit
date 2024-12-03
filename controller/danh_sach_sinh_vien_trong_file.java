/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class danh_sach_sinh_vien_trong_file {
public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SV.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Student> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String birth=sc.nextLine();
            StringBuilder sb=new StringBuilder(birth);
            if(sb.charAt(1)=='/'){
                sb.insert(0, '0');
            }
            if(sb.charAt(1)=='/'){
                sb.insert(0, '0');
            }
            if(sb.charAt(4)=='/'){
                sb.insert(3, '0');
            }
            birth=sb.toString();
            double gpa=Double.parseDouble(sc.nextLine());
            Student s1=new Student(name, lop, birth, gpa);
            arr.add(s1);
        }
//        Collections.sort(arr,new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o2.getGpa(), o1.getGpa());
//            }
//        });
        for(Student i: arr){
            System.out.println(i);
        }
        
       
    }
}
class Student {
    private String name;
    private String msv;
    private String lop;
    private String birth;
    private double gpa;
    private static int stt=0;

    public Student(String name, String lop, String birth, double gpa) {
        String n[] = name.trim().split("\\s+");
        String rname = "";
        for (String i : n) {
            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        this.name = rname;
        stt++;
        this.msv=String.format("B20DCCN%03d",stt);
        this.birth = birth;
        this.gpa = gpa;
        this.lop=lop;
    }

    @Override
    public String toString() {
        String d=String.format("%.2f",gpa);
        return msv+" "+name+""+lop +" "+birth+" "+ d;
    }
    
}