/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chien
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class chuanhoadanhsachsinhvien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<SV> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String ns=sc.nextLine();
            double gpa=Double.parseDouble(sc.nextLine());
            arr.add(new SV(name, lop, ns, gpa));
        }
        for(SV i:arr){
            System.out.println(i);
        }
    }
}
class SV{
    private static int stt=0;
    private String id,name,lop,ns;
    private double gpa;

    public SV(String name, String lop, String ns, double gpa) {
        String[] s=name.trim().split("\\s+");
        String ans="";
        for(String i:s){
            ans=ans+(i.charAt(0)+"").toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        this.name = ans;
        this.id=String.format("B20DCCN%03d", ++stt);
        this.lop = lop;
        if(ns.charAt(1)=='/'){
            ns="0"+ns;
        }
        if(ns.charAt(4)=='/'){
            ns=ns.substring(0,3)+"0"+ns.substring(3);
        }
        this.ns = ns;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id+" "+name+ ""+lop+" "+ns+" "+String.format("%.2f", gpa);
    }
    
}
