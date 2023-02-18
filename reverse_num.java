// package CodeStudio;

public class reverse_num {
    public static int reverseNum(int n) { // 12345
        int flag = n;
        int ans = 0;
        int temp = 0;
        while (flag > 0) {
            temp = flag % 10;
            ans = ans * 10 + temp;
            temp = 0;
            flag /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reverseNum(10400));
    }
}
