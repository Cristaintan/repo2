package cristian;

public class for循环 {
    //格式
//    for (初始化语句；条件判断语句；条件控制语句){
//        循环体语句;
//    }
    public static void main(String[] args) {
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//        System.out.println("for循环.main");
//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//
//        }
        //求1-100之间所有偶数的和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {   //
            if (i % 2 == 0) {              //加入 if语句
                sum += i;
            }
        }
        System.out.println("1到100的和是：" + sum);
    }
}

