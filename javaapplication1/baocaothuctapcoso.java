
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class baocaothuctapcoso {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br=new BufferedReader(new FileReader("SINHVIEN.in"));
        ArrayList<SinhVien> sv_arr=new ArrayList<>();
        
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String id=br.readLine();
            String name=br.readLine();
            String phone=br.readLine();
            String email=br.readLine();
            sv_arr.add(new SinhVien(id, name, phone, email));
        }
        br.close();
        ArrayList<DeTai> dt_arr=new ArrayList<>();
        BufferedReader br2=new BufferedReader(new FileReader("DETAI.in"));
        int m=Integer.parseInt(br2.readLine());
        for(int i=0;i<m;i++){
            String tengv=br2.readLine();
            String tendetai=br2.readLine();
            dt_arr.add(new DeTai(tengv, tendetai));
        }
        br2.close();
        ArrayList<HoiDong> hd_arr=new ArrayList<>();
        BufferedReader br3=new BufferedReader(new FileReader("HOIDONG.in"));
        int k=Integer.parseInt(br3.readLine());
        for(int i=0;i<k;i++){
            String[] l=br3.readLine().split("\\s+");
            String masv =l[0];
            String madt=l[1];
            String mahd=l[2];
            SinhVien sinhVien=new SinhVien();
            DeTai deTai=new DeTai();
            for(SinhVien j:sv_arr){
                if(j.getId().equals(masv)){
                    sinhVien=j;
                    break;
                }
            }
            for(DeTai j:dt_arr){
                if(j.getId().equals(madt)){
                    deTai=j;
                    break;
                }
            }
            hd_arr.add(new HoiDong(sinhVien, deTai, mahd));
        }
        Collections.sort(hd_arr);
        for(int i=1;i<=8;i++){
            ArrayList<HoiDong> result=new ArrayList<>();
            String hd_current="HD"+i;
            for(HoiDong j:hd_arr){
                if(j.getMahd().equals((hd_current))){
                    result.add(j);
                }
            }
            if(result.size()>0){
                System.out.println("DANH SACH HOI DONG "+i+":");
                for(HoiDong j:result){
                    System.out.println(j);
                }
            }
        }
    }
    
}
class SinhVien{
    private String id,name,phone,email;

    public SinhVien() {
    }

    public SinhVien(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
    
}
class DeTai{
    private static int stt=0;
    private String id,tengv,tendetai;

    public DeTai() {
    }

    public DeTai(String tengv, String tendetai) {
        stt++;
        this.id="DT"+String.format("%03d", stt);
        this.tengv = tengv;
        this.tendetai = tendetai;
    }

    public String getId() {
        return id;
    }

    public String getTendetai() {
        return tendetai;
    }
    
    @Override
    public String toString() {
        return tendetai+" "+tengv;
    }
}
class HoiDong implements Comparable<HoiDong>{
    private SinhVien sinhVien;
    private DeTai deTai;
    private String mahd;
    public HoiDong(SinhVien sinhVien, DeTai deTai,String mahd) {
        this.sinhVien = sinhVien;
        this.deTai = deTai;
        this.mahd=mahd;
    }

    @Override
    public String toString() {
        return sinhVien+" "+deTai;
    }

    public String getMahd() {
        return mahd;
    }

    @Override
    public int compareTo(HoiDong o) {
        return sinhVien.getId().compareTo(o.sinhVien.getId());
    }

}