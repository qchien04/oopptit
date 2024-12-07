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
public class lichgiangdaytheomonhoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Monhoc> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int stc=Integer.parseInt(sc.nextLine());
            arr.add(new Monhoc(id, name, stc));
        }
        Scanner sc2=new Scanner(new File("LICHGD.in"));
        
        t=Integer.parseInt(sc2.nextLine());
        ArrayList<Lophoc> arr2=new ArrayList<>();
        
        while(t-->0){
            String idmon=sc2.nextLine();
            int thu=Integer.parseInt(sc2.nextLine());
            int kip=Integer.parseInt(sc2.nextLine());
            String gv=sc2.nextLine();
            String phong=sc2.nextLine();
            Lophoc a=new Lophoc(idmon, thu, kip, gv, phong);
            for(Monhoc i:arr){
                if(i.getId().equals(idmon)){
                    a.setMon(i);
                    break;
                }
            }
            arr2.add(a);
        }
        Collections.sort(arr2);
        String gv=sc2.nextLine();

        System.out.println("LICH GIANG DAY GIANG VIEN "+gv+":");
        for(Lophoc i:arr2){
            if(i.getGv().equals(gv)){
                System.out.println(i);
            }
        }
        
        
        
        
    }
}


class Monhoc{
    private String id,name;
    private int stc;

    public Monhoc(String id, String name, int stc) {
        this.id = id;
        this.name = name;
        this.stc = stc;
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

    public int getStc() {
        return stc;
    }

    public void setStc(int stc) {
        this.stc = stc;
    }
    
}

class Lophoc implements Comparable<Lophoc>{
    private static int stt=0;
    private String idnhom,idmon;
    private int ngay,kip;
    private String gv,phong;
    private Monhoc mon;

    public Lophoc(String idmon, int ngay, int kip, String gv, String phong) {
        this.idnhom = String.format("HP%03d", ++stt);
        this.idmon = idmon;
        this.ngay = ngay;
        this.kip = kip;
        this.gv = gv;
        this.phong = phong;
    }

    public void setMon(Monhoc mon) {
        this.mon = mon;
    }

    public static int getStt() {
        return stt;
    }

    public String getIdnhom() {
        return idnhom;
    }

    public String getIdmon() {
        return idmon;
    }


    public int getKip() {
        return kip;
    }

    public String getGv() {
        return gv;
    }

    public String getPhong() {
        return phong;
    }

    public Monhoc getMon() {
        return mon;
    }

    @Override
    public String toString() {
        return idnhom+" "+mon.getName()+" "+ngay+" "+kip+" "+ phong;
    }

    @Override
    public int compareTo(Lophoc o) {
        return Integer.compare(ngay, o.ngay);
    }

    
    
    
}
