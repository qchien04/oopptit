/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnBaToCom;

/**
 *
 * @author chien
 */
import java.util.*;
public class kt1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        NguoiCong[] nn=new NguoiCong[n];
        for (int i = 0; i < n; i++) {
            nn[i] = new NguoiCong();
            nn[i].input(in);
        }
        QLNC q=new QLNC(nn);
        q.out();
    }
}
class NguoiCong{
    private static int cnt=0;
    private String ma,hoVaTen;
    int namsinh;
    double hsl;
    String dienthoai;

    public NguoiCong() {
    }
    
    public void input(Scanner in){
        hoVaTen=in.nextLine();
        namsinh=Integer.parseInt(in.nextLine());
        hsl=Double.parseDouble(in.nextLine());
        dienthoai=in.nextLine();
        cnt++;
        ma="E"+String.format("%03d", cnt);
    }
    public int getTuoi(){
        return 2024-namsinh;
    }
    @Override
    public String toString() {
        return ma+" "+ hoVaTen+" "+getTuoi()+" "+dienthoai+" "+hsl*10000;
    }
    
}
class QLNC{
    NguoiCong[] ds;
    public QLNC(NguoiCong a[]){
        this.ds=new NguoiCong[a.length];
        for(int i=0;i<a.length;i++){
            this.ds[i]=a[i];
        }
    }
    
    public void out(){
        for(int i=0;i<this.ds.length;i++){
            System.out.println(this.ds[i]);
        }
    }
}