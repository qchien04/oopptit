/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class ok2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        TaiLieu s=new Sach("s001", "lap trinh", "ok", 12, "nxb", 333);
        TaiLieu tapchi=new TapChi("s001", 67, 12, "nxb",100);
        ChucNang cn=new ThucHien();
//        cn.nhapSach(in);
        cn.out();
//        List<Sach> b=cn.timTheoTenSach("LT");
//        for(Sach i: b){
//            System.out.println(i);
//        }
//        cn.xoaMa("b8988");
//        cn.xoaMa("TC001");
//        cn.xoaNhieu("Tran Dinh Que");
//        cn.out();
//        
//        
//        cn.suaCha("S0004",in);
//        cn.suaCon("S0004",in);
System.out.println("\n\n");
        System.out.println("Sap xep theo NXB");
        cn.sortByNXB();
        System.out.println("\n\n");
        
        System.out.println("Sap xep theo so ban phat hanh");
        cn.sortBysoBanPH();
        System.out.println("\n\n");
        
        System.out.println("Sap xep theo ten tg");
        List<Sach> arr=cn.sortByTenTG();
        arr.forEach(t->System.out.println(t));
        
        
//        cn.suaCon("S006", in);
//        cn.suaCon("S004", in);
//        cn.out();
    }
}

class TaiLieu implements Serializable{
    private String ma,tenNXB;
    private int soBanPH;

    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNXB, int soBanPH) {
        this.ma = ma;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }
    
}
interface ChucNang{
    public void nhapSach(Scanner in);
    public void nhapTapChi(Scanner in);
    public void out();//toan bo ds
    public <T> void out(List<T> arr);
    public void timTheoMa(String ma);//viet ra
    public List<Sach> timTheoTenSach(String key);
    public List<TaiLieu> timTheoTuDen(int from,int to);
    public void xoaMa(String ma);
    public void xoaNhieu(String tacGia);//sach
    public void suaCha(String ma,Scanner in);//tai lieu
    public void suaCon(String ma,Scanner in);//tap chi
    public void sortBysoBanPH();
    public void sortByNXB();
    public List<Sach> sortByTenTG();

}
class Sach extends TaiLieu{
    private String tenSach,tenTG;
    private int soTrang;

    public Sach() {
    }


    public Sach(String ma, String tenSach, String tenTG, int soTrang, String tenNXB, int soBanPH) {
        super(ma, tenNXB, soBanPH);
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return  getMa().toUpperCase()+" "+tenSach+" "+tenTG+" "+ soTrang+" "+getTenNXB()+" "+getSoBanPH() ;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
class TapChi extends TaiLieu{
    private int so,thang;

    public TapChi() {
        
    }


    public TapChi(String ma,int so, int thang,  String tenNXB, int soBanPH) {
        super(ma, tenNXB, soBanPH);
        this.so = so;
        this.thang = thang;
    }
    
    @Override
    public String toString() {
        return  getMa().toUpperCase()+" "+so+" "+thang+" "+getTenNXB()+" "+getSoBanPH() ;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }
}
class ThucHien implements ChucNang{
    private List<TaiLieu> a;
    private static int sMa=0;

    public ThucHien() {
        a=new ArrayList<>();
        a.add(new Sach("S001", "LTHDT", "Tran Dinh Que", 120, "PTIT", 100));
        a.add(new Sach("S002", "lT java", "Tran Dinh Que", 120, "PTIT", 690));
        a.add(new Sach("S003", "kt do hoa", "Trinh Thi Van Anh", 120, "PTIT", 350));
        a.add(new Sach("S005", "giao trinh 1", "Nguyen van A", 120, "PTIT", 68));
        a.add(new Sach("S004", "giao trinh 3", "Tran van B", 120, "PTIT", 69));
        a.add(new TapChi("TC001", 2, 8, "KHCN", 90));
        a.add(new TapChi("TC004", 1, 6, "Kim Dong", 80));
    }
    private int getViTri(String ma){
        for(int i=0;i<a.size();i++){
            if(a.get(i).getMa().equalsIgnoreCase(ma)){
                return i;
            }
        }
        return -1;
    }
    
    private TaiLieu nhap(Scanner in){
        return new TaiLieu(String.format("%03d", sMa++),in.nextLine(),Integer.parseInt(in.nextLine()));
    }
    
    
    
    @Override
    public void nhapSach(Scanner in) {
        TaiLieu t=nhap(in);
        a.add(new Sach("S"+t.getMa(), in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()),t.getTenNXB(), t.getSoBanPH()));
        
        
    }

    @Override
    public void nhapTapChi(Scanner in) {
        TaiLieu t=nhap(in);
        a.add(new TapChi("TC"+t.getMa(), Integer.parseInt(in.nextLine()),Integer.parseInt(in.nextLine()),t.getTenNXB(), t.getSoBanPH()));    
    }

    @Override
    public void out() {
        a.forEach(t-> System.out.println(t));
        System.out.println("So luong tai lieu "+a.size());
    }

    @Override
    public <T> void out(List<T> arr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoMa(String ma) {
        int p=getViTri(ma);
        if(p==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println(a.get(p));
        }
    }
    

    @Override
    public List<Sach> timTheoTenSach(String key) {
        List<Sach> b=new ArrayList<>();
        a.forEach(t->{
            if(t instanceof Sach &&((Sach)t).getTenSach().toLowerCase().contains(key.toLowerCase())){
                b.add((Sach) t);
            }
            
        });
        
        return b;
    }

    @Override
    public List<TaiLieu> timTheoTuDen(int from, int to) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xoaMa(String ma) {
        int p=getViTri(ma);
        if(p==-1){
            System.out.println("Not Found");
        }
        else{
            a.remove(p);
            System.out.println("Xoa thanh cong");
        }    
    }

    @Override
    public void xoaNhieu(String tacGia) {
        List<TaiLieu> b=new ArrayList<>();
        for(TaiLieu t: a){
            if(t instanceof Sach &&((Sach)t).getTenTG().toLowerCase().contains(tacGia.toLowerCase())){
                continue;
            }
            else{
                b.add(t);
            }
        }
        a=b;
    }

    @Override
    public void suaCha(String ma,Scanner in) {
        int p=getViTri(ma);
        if(p==-1){
            System.out.println("Not Found");
        }
        else{
            TaiLieu t=a.get(p);
            t.setSoBanPH(Integer.parseInt(in.nextLine()));
            t.setTenNXB(in.nextLine());
            System.out.println("Sua thanh cong");
        }
    }

    @Override
    public void suaCon(String ma,Scanner in) {
        int p=getViTri(ma);
        if(p==-1){
            System.out.println("Not Found");
        }
        else{
            TaiLieu t=a.get(p);
            if(t instanceof Sach){
                ((Sach) t).setTenSach(in.nextLine());
                ((Sach) t).setSoTrang(Integer.parseInt(in.nextLine()));
                ((Sach) t).setTenTG(in.nextLine());
                System.out.println("Sua thanh cong");
            }
            else{
                ((TapChi)t).setSo(Integer.parseInt(in.nextLine()));
                ((TapChi)t).setThang(Integer.parseInt(in.nextLine()));
                System.out.println("Sua thanh cong");
            }
        }    
    }

    @Override
    public void sortBysoBanPH() {
        List<TaiLieu> b=new ArrayList<>(a);
        Collections.sort(b, (TaiLieu o1, TaiLieu o2) -> Integer.compare(o1.getSoBanPH(), o2.getSoBanPH()));
        b.forEach(t-> System.out.println(t));
    }

    @Override
    public void sortByNXB() {
        List<TaiLieu> b=new ArrayList<>(a);
        Collections.sort(b, (TaiLieu o1, TaiLieu o2) -> o1.getTenNXB().compareTo(o2.getTenNXB()));
        b.forEach(t-> System.out.println(t));
    }

    @Override
    public List<Sach> sortByTenTG() {
        List<Sach> b=new ArrayList<>();
//        for(TaiLieu t: a){
//            if(t instanceof Sach){
//                b.add((Sach)t);
//            }
//        }
//        Collections.sort(b, (Sach o1, Sach o2) -> o1.getTenTG().compareTo(o2.getTenTG()));
//        Collections.sort(b,new Comparator<Sach>(){
//
//            @Override
//            public int compare(Sach o1, Sach o2) {
//                String[] t1=o1.getTenTG().split("\\s+");
//                String[] t2=o2.getTenTG("\\s+");
//                
//                if
//                
//            }
//            
//        });
        return b;
    }
    
}