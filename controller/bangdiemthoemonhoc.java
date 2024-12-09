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
import java.text.DecimalFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;
public class bangdiemthoemonhoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        Scanner sc2=new Scanner(new File("MONHOC.in"));
        Scanner sc3=new Scanner(new File("BANGDIEM.in"));
        
        ArrayList<sinhvien> arr1=new ArrayList<>();
        ArrayList<bangdiem> arr3=new ArrayList<>();
        ArrayList<monhoc> arr2=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            arr1.add(new sinhvien(id, name, lop, mail));
        }
        
         t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String id=sc2.nextLine();
            String name=sc2.nextLine();
            int stc=Integer.parseInt(sc2.nextLine());
            arr2.add(new monhoc(id, name, stc));
        }
        t=Integer.parseInt(sc3.nextLine());
        while(t-->0){
            String[] s=sc3.nextLine().split("\\s+");
            bangdiem bd=new bangdiem(Double.parseDouble(s[2]),s[2]);
            
            for(sinhvien i:arr1){
                if(i.getId().equals(s[0])) {
                    bd.setS(i);
                }
            }
            for(monhoc i:arr2){
                if(i.getId().equals(s[1])) {
                    bd.setM(i);
                }
            }
            arr3.add(bd);
        }
        
        int q=Integer.parseInt(sc3.nextLine());
        Collections.sort(arr3);
        while(q-->0){
            String id=sc3.nextLine();
            System.out.println("BANG DIEM lop "+id+":");
            for(bangdiem i:arr3){
                if(i.getS().getLop().equals(id)){
                    System.out.println(i);
                }
            }
        }
        
    }
}
class bangdiem implements Comparable<bangdiem>{
    private double diem;
    private monhoc m;
    private sinhvien s;
    private String st;
    public bangdiem(double diem,String st) {
        this.diem = diem;
        this.st=st;
    }

    public String getSt() {
        return st;
    }

    public String getDiem() {
        DecimalFormat df=new DecimalFormat("#.#");
        return df.format(diem);
    }

    public void setDiem(double diem) {
        
        this.diem = diem;
    }

    public monhoc getM() {
        return m;
    }

    public void setM(monhoc m) {
        this.m = m;
    }

    public sinhvien getS() {
        return s;
    }

    public void setS(sinhvien s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s.getId()+" "+s.getName()+" "+m+" "+st;
    }

    @Override
    public int compareTo(bangdiem o) {
        return (m.getId()!=o.m.getId())?(m.getId().compareTo(o.m.getId())):s.getId().compareTo(o.s.getId());
    }
    
}
class monhoc{
    private String id,name;
    private int stc;

    public monhoc(String id, String name, int stc) {
        this.id = id;
        this.name = name;
        this.stc = stc;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
    
}
class sinhvien{
    private String id,name,lop,mail;

    public sinhvien(String id, String name, String lop, String mail) {
        this.id = id;
        String ans="";
        String s[]=name.trim().split("\\s+");
        for(String i:s){
            ans+=i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()+" ";
        }
        this.name = ans.trim();
        this.lop = lop;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }

    public String getName() {
        return name;
    }

}