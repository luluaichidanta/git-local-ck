public class Demo_four {
    public static void main(String[] args) {
        int[] array = new int[]{5, 11, 985, 211, 5};    //第6行 设置一个断点
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组中第" + (i + 1) + "个元素为 :" + array[i]);
        }
        System.out.println("-----------------------------------------------");

        System.out.println("梯田");
        System.out.println("爱在西元前");            //第13行 新增的断点
        System.out.println("同一种调调");
        System.out.println("龙卷风");
        System.out.println("伊斯坦堡");              //第16行 新增的断点
        System.out.println("夜的第七章");
        System.out.println("米兰的小铁匠");
    }
}