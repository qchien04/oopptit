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
public class dau_tu_chung_khoan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n=Integer.parseInt(sc.nextLine());
            String[] s=sc.nextLine().split("\\s+");
            List<Integer> arr=Arrays.stream(s).map(i->Integer.parseInt(i)).collect(Collectors.toList());
            Deque<Integer> st=new ArrayDeque<>();
            int[] ans=new int[n];
            st.offerFirst(-1);
            for(int i=0;i<arr.size();i++){
                while(st.size()>1&& arr.get(st.peekFirst())<=arr.get(i)){
                    st.pollFirst();
                }
                ans[i]=i-st.peekFirst();
                st.offerFirst(i);
            }
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println("");
        }
    }
}
