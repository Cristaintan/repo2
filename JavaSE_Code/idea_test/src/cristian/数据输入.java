package cristian;

import java.util.Scanner;

//导包
public class 数据输入 {
    public static void main(String[] args) {
//        //创建对象
//        Scanner sc = new Scanner(System.in);
//        //接收数据
//        int x = sc.nextInt();
////        输出数据
        //        System.out.println("x:" + x);
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个人的身高：");
        int height1 = sc.nextInt();

        System.out.println("请输入第二个人的身高：");
        int height2 = sc.nextInt();

        System.out.println("请输入第三个人的身高：");
        int height3 = sc.nextInt();

        int tempheight = height1 > height2 ? height1 : height2;
        int maxheight = tempheight > height3 ? tempheight : height3;


        System.out.println("身高最高的人是:"+maxheight+ "cm");


    }
}
