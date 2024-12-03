
package sieu_pham;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author chien
 */
public class sc_hasnext {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> mp=new LinkedHashMap<>();
        int max=0;
        while(sc.hasNext()){
            String i=sc.next();
            StringBuilder sb=new StringBuilder(i);
            String tmp=sb.reverse().toString();
            if(tmp.equals(i)){
                if(mp.containsKey(tmp)){
                    int dem=mp.get(tmp);
                    mp.put(tmp,dem+1);
                    max=Math.max(max, dem+1);
                }
                else {
                    mp.put(tmp,1);
                    max=Math.max(max, 1);
                }
            }
        }
        Set<String> keys = mp.keySet();
        for (String key : keys) {
            if(mp.get(key)==max){
                System.out.println(key+" "+max);
            }
        }
    }
}
