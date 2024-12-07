
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chien
 */
public class thuctapcoso {
    public static void main(String[] args) {
        VDVChay a=new VDVChay();
        Scanner in=new Scanner(System.in);
        a.input(in);
        System.out.println(a);
    }
}

interface IVanDongVien{
    boolean isMa(String ma);
    boolean isSo(String ma);
    double getLuongThucLinh();
}
class VanDongVien{
    private String ma,ten;
    private double luong;

    public VanDongVien() {
    }

    public VanDongVien(String ma, String ten, double luong) {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
}
class VDVChay extends VanDongVien implements IVanDongVien{
    private int culy;
    private int soHuyChuong;

    public VDVChay() {
    }

    public VDVChay(int culy, int soHuyChuong) {
        this.culy = culy;
        this.soHuyChuong = soHuyChuong;
    }

    public VDVChay(int culy, int soHuyChuong, String ma, String ten, double luong) {
        super(ma, ten, luong);
        this.culy = culy;
        this.soHuyChuong = soHuyChuong;
    }

    public int getCuly() {
        return culy;
    }

    public void setCuly(int culy) {
        this.culy = culy;
    }

    public int getSoHuyChuong() {
        return soHuyChuong;
    }

    public void setSoHuyChuong(int soHuyChuong) {
        this.soHuyChuong = soHuyChuong;
    }
    
    public void input(Scanner sc){
        while(true){
            String tmp=sc.nextLine();
            if(isMa(tmp)){
                setMa(tmp);
                break;
            }
            else{
                System.out.println("nhap sai");
            }
        }
        setTen(sc.nextLine());
        setLuong(Double.parseDouble(sc.nextLine()));
        while(true){
            String tmp=sc.nextLine();
            if(isSo(tmp)){
                this.culy=Integer.parseInt(tmp);
                break;
            }
            else{
                System.out.println("nhap sai");
            }
        }
        while(true){
            String tmp=sc.nextLine();
            if(isSo(tmp)){
                this.soHuyChuong=Integer.parseInt(tmp);
                break;
            }
            else{
                System.out.println("nhap sai");
            }
        }
    }
    @Override
    public boolean isMa(String ma) {
        String tmp=ma.toLowerCase();
        String btcp="^vdvc-\\d{3}$";
        return tmp.matches(btcp);
    }

    @Override
    public boolean isSo(String ma) {
        return ma.matches("\\d+");    
    }

    @Override
    public double getLuongThucLinh() {
        if(soHuyChuong>=4){
            return getLuong()*2+soHuyChuong*(100);
        }
        if(soHuyChuong<=3&&soHuyChuong>=1){
            return getLuong()+soHuyChuong*(100);
        }
        return getLuong();
    }

    @Override
    public String toString() {
        return getMa().toUpperCase()+" "+getTen()+" "+soHuyChuong+ "\t "+getLuongThucLinh();
    }
    
}