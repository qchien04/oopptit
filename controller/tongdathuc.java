/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chien
 */
import java.util.*;
public class tongdathuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            System.out.println(r);
        }
        
    }
}

class DaThuc{
    private String dathuc;
    private Map<Integer,Integer> mp;
    public DaThuc(String dathuc) {
        this.dathuc = dathuc;
        mp=new TreeMap<>();
        String pt[]=dathuc.split(" \\+ ");
        for(String i:pt){
            String[] t=i.split("\\*x\\^");
            mp.put(Integer.parseInt(t[1]), Integer.parseInt(t[0]));
        }
    }
    
     public DaThuc(Map<Integer,Integer> dathuc) {
        this.mp=dathuc;
    }
    
    public DaThuc cong(DaThuc d){
        Map<Integer,Integer> tmp=new TreeMap<>(d.mp);
        
        for(Integer i:mp.keySet()){
            if(tmp.containsKey(i)){
                tmp.put(i, tmp.get(i)+mp.get(i));
            }
            else{
                tmp.put(i, mp.get(i));
            }
        }
        return new DaThuc(tmp);
    }

    @Override
    public String toString() {
        String ans="";
        for(int i:mp.keySet()){
            ans=(mp.get(i)+"*x^"+i)+" + "+ans;
        }
        return ans.substring(0,ans.length()-3);
    }
    
}