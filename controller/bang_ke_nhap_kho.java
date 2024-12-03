/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;

/**
 *
 * @author chien
 */
public class bang_ke_nhap_kho {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Product2> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            long quantity=Long.parseLong(sc.nextLine());
            long cost=Long.parseLong(sc.nextLine());
            arr.add(new Product2(name, quantity, cost));
            
        }
        Collections.sort(arr);
        for(Product2 i:arr){
            System.out.println(i);
        }
    }
}

class Product2 implements Comparable<Product2>{
    private static Map<String,Integer> mp=new HashMap<>();
    private String id,name;
    private long quantity, cost;

    public Product2(String name, long quantity, long cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        String[] a=name.split("\\s+");
        String id=a[0].charAt(0)+""+a[1].charAt(0);
        if(mp.containsKey(id)){
            mp.put(id,mp.get(id)+1);
            this.id=id.toUpperCase()+String.format("%02d",mp.get(id));
        }
        else{
            mp.put(id,1);
            this.id=id.toUpperCase()+String.format("%02d",mp.get(id));
        }
        
        
    }
    private int getPTChietKhau(){
        if(quantity>10){
            return 5;
        }
        if(quantity>=8) return 2;
        if(quantity>=5) return 1;
        return 0;
    }
    private long gettienChietKhau(){
        return quantity*cost*getPTChietKhau()/100;
    }
    private long getThanhTien(){
        return quantity*cost-gettienChietKhau();
    }

    @Override
    public String toString() {
        return id+" "+name+" "+gettienChietKhau()+" "+getThanhTien();
    }

    @Override
    public int compareTo(Product2 o) {
        return Long.compare(o.gettienChietKhau(), gettienChietKhau());
    }
    
    
    

}
