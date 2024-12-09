

package ontap;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class b9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        Deque<Integer> dq=new ArrayDeque<>();
        int []cnt = new int[5000006];
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            while (!st.isEmpty() && x > st.peek()) {
                cnt[st.pop()]--;
                ans++;
            }
            if (!st.isEmpty()) {
                if (x == st.peek()) {
                    if(st.size()> cnt[x]) ans+=cnt[x] + 1;
                    else ans+=cnt[x];
                } else {
                    ans++;
                }
            }
            st.push(x);
            cnt[x]++;
        }
        System.out.println(ans);
    }
}
