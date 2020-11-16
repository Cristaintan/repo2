package cristian;

import java.util.Scanner;
public class 分支语句 {
    public static void main(String[] args) {
        //流程控制
        /*顺序结构
        选择结构
        * */
        /*
         * if 语句
         * */
//        System.out.println("开始");
//        int a = 10;
//        int b = 20;
//        b = 5;
//        if (a >= b) {
//            System.out.println("a大于b");
//        } else {
//            System.out.println("a小于b");
//        }
//        System.out.println("结束");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        if (number%2==0) {
            System.out.println(number+"是偶数");
        } else {
            System.out.println(number+"是奇数");
        }

    }
}
