public class Find_friend {          /** 测试类：找朋友类 */
public static void main(String[] args) {
    People people = new Friends();
    System.out.println("普通版找朋友，找到了谁————" + people.make_friends());
    System.out.println("牛逼版找朋友，找到了谁————" + people.make_friends_EX());
}
}

class People {                      /** 父类：People类 */
String name = "刻晴";

    public String getName() {
        return name;
    }

    public String make_friends() {
        return getName() + " and " + "琪亚娜";
    }

    public String make_friends_EX() {
        return make_friends() + " and " + "周杰伦";
    }
}

class Friends extends People {      /** 子类：Friends类 */
String name = "吴京";

    public String getName() {
        return name;
    }

    public String make_friends() {
        return super.getName();
    }

    public String make_friends_EX() {
        return super.make_friends_EX() + " and " +  name;
    }
}