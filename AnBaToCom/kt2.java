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
public class kt2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x[] = {1, 1, 1};
        DaThuc a = new DaThuc();
        a.input(in);
        a.out();
        DaThuc d = new DaThuc(x);
        DaThuc c = d.nhan(a);
        c.out();
    }
}
class DaThuc{
    private int n;
    private double[] a;

    public DaThuc() {
    }

    public DaThuc(double[] a) {
        this.a = a;
        this.n=2;
    }

    public DaThuc(int n, double[] a) {
        this.n = n;
        this.a = a;
    }
    
    public void input(Scanner in){
        int m=Integer.parseInt(in.nextLine());
        this.a=new double[m+1];
        this.n=m;
        for(int i=0;i<=n;i++){
            a[i]=in.nextDouble();
        } 
    }
    public DaThuc nhan(DaThuc dathuc){
        int bacmoi=dathuc.n+this.n;
        double[] hsobac=new double[bacmoi+1];
        for(int i=0;i<=this.n;i++){
            for(int j=0;j<=dathuc.n;j++){
                hsobac[i+j]=hsobac[i+j]+this.a[i] * dathuc.a[j];
            }
        }
        return new DaThuc(bacmoi,hsobac);
    }
    public void out(){
        for(int i=0;i<=this.n;i++){
            System.out.print(String.format("%.1f",this.a[i])+" * X^"+i);
            if(i!=this.n){
                System.out.print(" + ");
            }
        } 
        System.out.println("");
    }
}