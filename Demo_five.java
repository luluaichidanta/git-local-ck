public class Demo_five {
    public static void main(String[] args) {
        //创建KunKun类对象 :
        //1°加载KunKun类的字节码文件
        //2°初始化（默认初始化 ——> 显式初始化 ——> 构造器初始化）
        //3°返回对象的地址值给引用
        KunKun kunKun = new KunKun();                //这里是第10行呢
        System.out.println(kunKun);

        kunKun.setName("你干嘛~");
        System.out.println(kunKun);

        KunKun kunBro = new KunKun("坤哥", 24);
        System.out.println(kunBro);
    }
}