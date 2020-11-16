package Start;

public class 数组 {
    public static void main(String[] args) {
        /*数组
        1.数据类型[] 变量名
         */
//        int[] arr = new int[3];
//        /*
//        左边；
//            int：说明 数组中的元素是int类型
//            []:说明这是个数组
//            arr：数组名称
//        右边：
//            new：为数组申请空间
//            int：说明 数组中的元素是int类型
//            []:说明这是个数组
//            3：数组长度，其实就是数组中元素个数
//            */
//            //数组元素访问
//        System.out.println(arr);
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

//        int[] arr={1,2,3};
//        System.out.println(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        //索引越界  访问数组中不存在的索引
        //空指针异常
        //null空值 引用数据类型的默认值，不指向

        int [] arr= {11,22,33,44,55};
        int max = arr[0];
        for (int x = 1; x<arr.length;x++){
           if(arr[x]>max){
               max = arr[x];
           }
        }
        System.out.println("max:"+max);
    }
}
