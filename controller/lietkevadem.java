/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.util.*;
public class lietkevadem {
    public static int kt(int a){
        String s=a+"";
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)<s.charAt(i-1)){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Integer,num> mp= new HashMap<>();
        int i=0;
        while(sc.hasNext()){
            int a=sc.nextInt();
            if(a==0) break;
            if(kt(a)==1)
            {
                if(mp.containsKey(a)){
                    mp.get(a).cnt+=1;
                }
                else{
                    mp.put(a, new num(a, 1, i));
                }
                i++;
            }
        }
        ArrayList<num> arr=new ArrayList<>(mp.values());
        Collections.sort(arr);
        for(num j:arr){
            System.out.println(j.a+" "+j.cnt);
        }
        
    }
}
class num implements Comparable<num>{
    int a,cnt,index;

    public num(int a, int cnt, int index) {
        this.a = a;
        this.cnt = cnt;
        this.index = index;
    }

    @Override
    public int compareTo(num o) {
        if(cnt!=o.cnt) return Integer.compare(o.cnt, cnt);
        return index-o.index;
    }
    
}