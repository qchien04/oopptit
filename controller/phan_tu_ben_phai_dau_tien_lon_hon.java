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
import java.util.stream.Collectors;
public class phan_tu_ben_phai_dau_tien_lon_hon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n=Integer.parseInt(sc.nextLine());
            String[] a=sc.nextLine().split("\\s+");
            List<Integer> arr=Arrays.stream(a).map(s->Integer.parseInt(s)).collect(Collectors.toList());
            Deque<Integer> st=new ArrayDeque<>();
            int[] ans=new int[n];
            for(int i=0;i<n;i++){
                ans[i]=-1;
            }
            for(int i=0;i<arr.size();i++){
                while(!st.isEmpty() && arr.get(st.peekFirst())<arr.get(i)){
                    ans[st.peekFirst()]=arr.get(i);
                    st.pollFirst();
                }
                st.offerFirst(i);
            }
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            
            System.out.println("");
        }
    }
}
