/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class tra_cuu_don_hang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Product3> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String ma=sc.nextLine();
            long cost=Long.parseLong(sc.nextLine());
            long quantity=Long.parseLong(sc.nextLine());
            arr.add(new Product3(name,ma, quantity, cost));
            
        }
        Collections.sort(arr);
        for(Product3 i:arr){
            System.out.println(i);
        }
    }
}
class Product3 implements Comparable<Product3>{
    private static Map<String,Integer> mp=new HashMap<>();
    private String id,name;
    private long quantity, cost;

    public Product3(String name,String ma, long quantity, long cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.id=ma;
        
    }
    private int getpercentgiamgia(){
        String tmp=id;
        if(tmp.endsWith("1")){
            return 50;
        }
        return 30;
    }

    private String getSothutu(){
        String tmp=id;
        return tmp.substring(1,4);
    };
    
    private long gettienChietKhau(){
        return quantity*cost*getpercentgiamgia()/100;
    }
    private long getThanhTien(){
        return quantity*cost-gettienChietKhau();
    }

    @Override
    public String toString() {
        return name+" "+id+" "+getSothutu()+" "+gettienChietKhau()+" "+getThanhTien();
    }

    @Override
    public int compareTo(Product3 o) {
        return getSothutu().compareTo(o.getSothutu());
    }
    
    
    

}
