package controller;

/**
 * @Author: jwq
 * @Date: 2021/3/4 9:44
 */
//动态规划求解
public class Dp {
    public static void main(String[] args) {
        ///String [] chars =  {"0", "1", "10", "11", "100", "101", "110", "111"};
        char [] str = {'0','1','1','0','1','1','1','0','0','1','0','1','1','1','0','1','1','1'};
        int n = str.length;
        int[] dp = new int[n + 1];
        dp[n] = 1;         // 最后一个字符肯定只能是一种翻译
        // 从后往前遍历字符
        for(int i = n - 1; i >= 0; i--){
            dp[i] = dp[i + 1];     // 单字符码的情况
            if(str[i] == '1'){      // 对于"1"，还有双字符码和三字符码的情况
                if(i + 2 <= n) dp[i] += dp[i + 2];
                if(i + 3 <= n) dp[i] += dp[i + 3];
            }
        }
        System.out.println(dp[0]);
        //System.out.println(chars.length);
    }
}
