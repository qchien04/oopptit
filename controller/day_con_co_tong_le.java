
package controller;

import java.util.*;
public class day_con_co_tong_le {
    public static ArrayList<String> ans;
    public static Integer[] a;
    public static Integer[] b;
    public static int n;
    public static void solve(int head,int sum,String s){//wrong solution
        for(int i=head;i<n;i++){
            if((sum+a[i])%2==1){
                ans.add(s+a[i]+" ");
            }
            solve(i+1,sum+a[i],s+a[i]+" ");
        }
    }
    public static void check(){
        int sum=0;
        String s="";
        for(int i=0;i<n;i++){
            if(b[i]==1){
                sum+=a[i];
                s=s+a[i]+" ";                       
            }  
        }
        if(sum%2==1) ans.add(s);
    }
    public static void solve2(int m){//wrong solution
        for(int i=0;i<=1;i++){
            if(m==n){
                check();
                return;
            }
            b[m]=i;
            solve2(m+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            n=Integer.parseInt(sc.nextLine());
            a=new Integer[n];
            b=new Integer[n];
            ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            sc.nextLine();
            Arrays.sort(a,(x,y)-> y-x);

            //solve(0, 0, "");
            solve2(0);
            for(int i=0;i<ans.size();i++){
                System.out.println(ans.get(i));
            }
        }
        
    }
}
