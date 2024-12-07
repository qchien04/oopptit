package ltap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chien
 */
public class b8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Map<Integer,num> mp=new HashMap<>();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(mp.containsKey(x)){
                    mp.get(x).cnt+=1;
                }
                else{
                    mp.put(x, new num(x, 1, i));
                }
            }
            ArrayList<num> arr=new ArrayList<>(mp.values());
            Collections.sort(arr);
            for(num i:arr){
                while(i.cnt-->0){
                    System.out.print(i.a+" ");
                }
            }
            System.out.println("");
        }
    }
}
class num implements Comparable<num>{
    int a;
    int cnt;
    int index;

    public num(int a, int cnt, int index) {
        this.a = a;
        this.cnt = cnt;
        this.index = index;
    }

    

    @Override
    public int compareTo(num o) {
        if(cnt!=o.cnt) return Integer.compare(o.cnt, cnt);
        return Integer.compare(index, o.index);
    }
    
}