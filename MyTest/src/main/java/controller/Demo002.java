package controller;

import java.util.Scanner;

/**
 * @Author jwq
 * @Date 2022/4/3 21:46
 */
public class Demo002 {
    static int num = 5;

    int flowshop(wp wp[], int n, int time) {//返回时间T(S,t),n是剩余待排的个数，待time时间后进行作业，
        Demo002 pc = new Demo002();
        int i = 0;
        if (n == 1) {
            return pc.max(wp[num - 1].a, time) + wp[num - 1].b;//最后一个时
        }
        int t = wp[num - n].a + pc.flowshop(wp, n - 1, wp[num - n].b + pc.max(time - wp[num - n].a, 0));//初始值以当前的第一个

        for (int j = num + 1 - n; j < num; j++) {
            int ta = wp[j].a + pc.flowshop(wp, n - 1, wp[j].b + pc.max(time - wp[j].a, 0));//对其后的元素进行比较，取出最小值时的坐标和值
            if (ta < t) {
                t = ta;
                i++;//记录最后一个换的是谁，应该为wp[20-n+i];
            }
        }
        //将该换的放到wp当前集合的头个位置,且保留了序号信息
        swtich(wp, num - n + i, num - n);

        return t;
    }

    int max(int a1, int b1) {
        if (a1 > b1) {
            return a1;
        }
        return b1;
    }

    void swtich(wp[] wp, int a2, int b2) {
        int tempxh = wp[a2].xuhao;
        int tempa = wp[a2].a;
        int tempb = wp[a2].b;
        wp[a2].a = wp[b2].a;
        wp[a2].b = wp[b2].b;
        wp[a2].xuhao = wp[b2].xuhao;
        wp[b2].a = tempa;
        wp[b2].b = tempb;
        wp[b2].xuhao = tempxh;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        wp zuoye[] = new wp[num];//排前组
        wp best[] = new wp[num];//最优调度组
        for (int i = 0; i < num; i++) {
            zuoye[i] = new wp();
            zuoye[i].a = scan.nextInt();//读取在M1加工需要的时间
        }
        for (int i = 0; i < num; i++) {
            zuoye[i].b = scan.nextInt();//读取在M2加工需要的时间
        }
        for (int i = 0; i < num; i++) {
            zuoye[i].xuhao = i + 1;//读取在M2加工需要的时间
        }
        Demo002 pc = new Demo002();
        int besttime = pc.flowshop(zuoye, num, 0);//输出时间
        System.out.println(besttime);
    }

}

class wp {
    int a;
    int b;
    int xuhao;
}