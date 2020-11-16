package cristian;

import java.util.Random;
import java.util.Scanner;


public class 猜随机数小游戏 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        while (true){   //使这个循环可以多次进行
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入你猜的数: ");
            int guessnumber = sc.nextInt();
            if (guessnumber>number){
                System.out.println("你猜的太大了，猜小一点");
            } else if(guessnumber<number){
                System.out.println("你猜的太小了，猜大一点");
            }else{
                System.out.println("恭喜你猜对了");
                break;//才对的时候结束循环
            }
        }
    }
}
