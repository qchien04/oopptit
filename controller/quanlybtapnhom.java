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
public class quanlybtapnhom {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SINHVIEN.in"));
        Scanner sc2=new Scanner(new File("BAITAP.in"));
        Scanner sc3=new Scanner(new File("NHOM.in"));
        
        ArrayList<sinhvien> svarr=new ArrayList<>();
        ArrayList<baitap> btarr=new ArrayList<>();
        ArrayList<nhom> narr=new ArrayList<>();
        
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String sdt=sc.nextLine();
            svarr.add(new sinhvien(id, name, sdt));
        }
        
         t=Integer.parseInt(sc2.nextLine());
        while(t-->0){
            String name=sc2.nextLine();
            btarr.add(new baitap(name));
        }
        
        while(sc3.hasNextLine()){
            String s[]=sc3.nextLine().split("\\s+");
            String idsv=s[0];
            int idbt=Integer.parseInt(s[1]);
            nhom n=new nhom(idsv, idbt);
            for(baitap i:btarr){
                if(i.getId()==idbt){
                    n.setBt(i);
                    break;
                    
                }
            }
            for(sinhvien i:svarr){
                if(i.getId().equals(idsv)){
                    n.setSv(i);
                    break;
                    
                }
            }
            narr.add(n);
        }
        Collections.sort(narr);
        for(nhom i:narr){
            System.out.println(i);
        }

        
    }
}
class sinhvien{
    private String id,name,sdt;

    public sinhvien(String id, String name, String sdt) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+sdt;
    }
    
}
class baitap{
    private static int stt=1;
    private String name;
    private int id;

    public baitap(String name) {
        this.name = name;
        this.id = stt++;
        
    }

    public static int getStt() {
        return stt;
    }

    public static void setStt(int stt) {
        baitap.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
    
    
}
class nhom implements Comparable<nhom>{
    private String idsv;
    private int idbt;
    private baitap bt;
    private sinhvien sv;
    public nhom(String idsv, int idbt) {
        this.idsv = idsv;
        this.idbt = idbt;
    }

    public String getIdsv() {
        return idsv;
    }

    public void setIdsv(String idsv) {
        this.idsv = idsv;
    }


    public baitap getBt() {
        return bt;
    }

    public void setBt(baitap bt) {
        this.bt = bt;
    }

    public sinhvien getSv() {
        return sv;
    }

    public void setSv(sinhvien sv) {
        this.sv = sv;
    }

    @Override
    public String toString() {
        return sv+" "+bt;
    }

    @Override
    public int compareTo(nhom o) {
        return sv.getId().compareTo(o.sv.getId());
    }
    
}