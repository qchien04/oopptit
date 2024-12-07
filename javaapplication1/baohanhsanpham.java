
package javaapplication1;

/**
 *
 * @author chien
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class baohanhsanpham {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br=new BufferedReader(new FileReader("MUAHANG.in"));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Product> product_arr=new ArrayList<>();
        ArrayList<Customer> customer_arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            String id=br.readLine();
            String name=br.readLine();
            int cost=Integer.parseInt(br.readLine());
            int insurance=Integer.parseInt(br.readLine());
            product_arr.add(new Product(id, name, cost, insurance));
        }
        int m=Integer.parseInt(br.readLine());
        for(int i=0;i<m;i++){
            String name=br.readLine();
            String address=br.readLine();
            String product_id=br.readLine();
            int quantity=Integer.parseInt(br.readLine());
            String ngaymua=br.readLine();
            Customer customer=new Customer(name, address, product_id, quantity, ngaymua);
            for(Product j:product_arr){
                if(j.getId().equals(product_id)){
                    customer.setProduct(j);
                    break;
                }
            }
            customer_arr.add(customer);
        }
        Collections.sort(customer_arr);
        for(Customer i: customer_arr){
            System.out.println(i);
        }
    }
}
class Product{
    private String id,name;
    private int cost;
    private int insurance;
    public Product(String id, String name, int cost, int insurance) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.insurance = insurance;
    }

    public String getId() {
        return id;
    }
    public int getCost() {
        return cost;
    }

    public int getInsurance() {
        return insurance;
    }
}
class Customer implements Comparable<Customer>{
    private static int stt=0;
    private String id,name,address,product_id;
    private int quantity;
    private String ngaymua;
    private Product product;
    public Customer(String name, String address, String product_id, int quantity, String ngaymua) {
        stt++;
        this.id ="KH"+String.format("%02d", stt);
        this.name = name;
        this.address = address;
        this.product_id = product_id;
        this.quantity = quantity;
        this.ngaymua = ngaymua;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getNgaymua() {
        return ngaymua;
    }
    
    private int getTotal(){
        return product.getCost()*quantity;
    }
    private String getDateOff(){
        int bh=product.getInsurance();
        String[] arr=ngaymua.split("\\/");
        int b[]=new int[3];
        b[0]=Integer.parseInt(arr[0]);
        b[1]=Integer.parseInt(arr[1])+bh%12;
        b[2]=Integer.parseInt(arr[2])+(int)(bh/12);
        if(b[1]>12){
            b[2]+=1;
            b[1]-=12;
        }
        return String.format("%02d", b[0])+"/"+String.format("%02d", b[1])+"/"+b[2];
    }
    @Override
    public String toString() {
        return id+" "+name+" "+address+" "+product_id+" "+getTotal()+" "+getDateOff();
    }

    @Override
    public int compareTo(Customer o) {
        if(!getDateOff().equals(o.getDateOff())){
            String[] a=getDateOff().split("/"); 
            String[] b=o.getDateOff().split("/"); 
            if(!a[2].equals(b[2])){
                return Integer.compare(Integer.parseInt(a[2]), Integer.parseInt(b[2]));
            }
            if(!a[1].equals(b[1])){
                return Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
            }
            if(!a[0].equals(b[0])){
                return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
            }
        }
        return id.compareTo(o.id);
    }
    
    
    
}