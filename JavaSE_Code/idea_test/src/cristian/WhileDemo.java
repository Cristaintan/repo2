package cristian;

public class WhileDemo {
    public static void main(String[] args) {
    /*    int j =1;
        while(j<=5)  {
            System.out.println("hello");
            j++;
        }*/

        int count = 0;
        int zf =8844430;
        double paper = 0.1;
        //不知道多少次，用while
        while (paper<=zf) {
            paper *= 2;
            count++;
        }
        System.out.println("需要折叠"+count+"次");
    }

}
