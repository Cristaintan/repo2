package Start;

public class 带返回值方法练习 {
    public static void main(String[] args) {


        boolean flag = getMax(10,20);
        System.out.println(flag);
    }

    public static boolean getMax(int a , int b ){
        if (a>b){
//            System.out.println(true);
            return true;
        }else {
//            System.out.println(false);
            return false;
        }
    }
}
