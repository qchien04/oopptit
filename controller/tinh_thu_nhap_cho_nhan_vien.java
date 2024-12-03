import java.util.*;
public class tinh_thu_nhap_cho_nhan_vien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String cv=sc.nextLine();
            long lcb=Long.parseLong(sc.nextLine());
            long nc=Long.parseLong(sc.nextLine());
            arr.add(new NhanVien(name, lcb, nc, cv));
        }
        for(NhanVien i:arr){
            System.out.println(i);
        }    
    }
}


class NhanVien{
    private static int stt=0;
    private String id,name,cv;
    private long lcb,nc;

    public NhanVien(String name, long lcb, long nc,String cv) {
        stt++;
        this.name=name;
        this.id=String.format("NV%02d", stt);
        this.nc=nc;
        this.lcb=lcb;
        this.cv=cv;
        
    }   
    private long getluong(){
        return lcb*nc;
    }
    private long getTamUng(){
        if(((getPc()+getluong())*2/3)<25000){
            long tmp=Math.round((double)(getPc()+getluong())*2/3/1000);
            return tmp*1000;
        }
        return 25000;
    }
    public long getPc(){
        if(cv.equals("GD")) return 500;
        if(cv.equals("PGD")) return 400;
        if(cv.equals("TP")) return 300;
        if(cv.equals("KT")) return 250;
        return 100;
    }

    private long getconlai(){
        return getPc()+getluong()-getTamUng();
    }
    @Override
    public String toString() {
        return id+" "+name+" "+getPc()+" "+(getluong())+" "+getTamUng()+" "+getconlai();
    }

    
}