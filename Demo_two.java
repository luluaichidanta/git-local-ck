public class Demo_two {
    public static void main(String[] args) {
        int[] array = new int[]{11, 5, 211, 985, 77};

        for (int i = 0; i <= array.length; i++) {        //
            System.out.println("数组的第" + (i+1) + "个元素为 : " + array[i]);
        }
        System.out.println("-------------------------------");
        System.out.println("for循环结束，程序退出。");
    }
}