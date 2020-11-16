package Start;

public class 带参方法练习 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        getMax(10,20);
    }
    public static void getMax(int a, int b){
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }


    }
}
