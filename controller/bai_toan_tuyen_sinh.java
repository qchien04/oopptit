
package controller;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class bai_toan_tuyen_sinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String code=sc.nextLine();
        String name=sc.nextLine();
        double a=Double.parseDouble(sc.nextLine());
        double b=Double.parseDouble(sc.nextLine());
        double c=Double.parseDouble(sc.nextLine());
        ThiSinh ts=new ThiSinh(code, name, a, b, c);
        System.out.println(ts);
    }
}
class ThiSinh{
    private String code,name;
    private double a,b,c;

    public ThiSinh(String code, String name, double a, double b, double c) {
        this.code = code;
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double getPriority(){
        String kv=this.code.substring(0,3);
        if(kv.equals("KV1")) return 0.5;
        if(kv.equals("KV2")) return 1;
        return 2.5;
    }
    private double getCore(){
        return this.a*2+this.b+this.c;
    }
    private double getTotal(){
        return getCore()+getPriority();
    }
    private String getType(){
        if(getTotal()>=24.0) return "TRUNG TUYEN";
        return "TRUOT";
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#.#");
        return code+" "+name+" "+df.format(getPriority())+" "+df.format(getCore())+" "+getType();
    }
    
    
    
}