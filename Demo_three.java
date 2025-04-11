import java.util.Arrays;    //记得导包
//测试跳入方法源码和跳出方法源码
public class Demo_three {
    public static void main(String[] args) {
        int[] array = new int[]{11, 5, 985, 211, 11};
        Arrays.sort(array);     //该方法可以将传入的数组升序排列

        System.out.println("升序排列后的数组如下 : ");
        System.out.println("-------------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组的第" + (i + 1) + "个元素为 : " + array[i]);
        }
        System.out.println("-------------------------------");
        System.out.println("for循环结束，程序退出。");
    }
}