package AnBaToCom;
import java.util.*;

public class io_lord {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        MS ms=new MS();
        ms.input(in);
        ms.out();
    }

}
class Vihicle{
    private String vin,manufacturer;
    private int year;
    private double cost;
    private String color;

    

    public void input(Scanner sc){
        String vini=sc.nextLine();
        String manufactureri=sc.nextLine();
        String colori=sc.nextLine();
        int yeari=Integer.parseInt(sc.nextLine());
        double costi=Double.parseDouble(sc.nextLine());
        
        this.vin=vini;
        this.manufacturer=manufactureri;
        this.color=colori;
        this.cost=costi;
        this.year=yeari;
        
    }
      
    @Override
    public String toString() {
        return vin+ " "+manufacturer.toUpperCase()+" "+cost+" "+year+" "+color;
    }
    
}
class MS{
    private Vihicle[] a;
    private int quantity;
    public MS() {
    }
    public void input(Scanner in){
        int n=Integer.parseInt(in.nextLine());
        this.a=new Vihicle[n];
        this.quantity=n;
        for(int i=0;i<this.quantity;i++){
            Vihicle v=new Vihicle();
            v.input(in);
            a[i]=v;
        }
    }
    public void out(){
        for(int i=0;i<this.quantity;i++){
            System.out.println(this.a[i]);
        }
        System.out.println(this.quantity);
    }
}