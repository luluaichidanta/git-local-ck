public class KunKun {
    private String name;
    private int age = 18;

    public KunKun() {
    }

    public KunKun(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge() {
        this.age = age;
    }

    @Override
    public String toString() {
        return "KunKun{" +
                "name ='" + name + '\'' +
                ", age =" + age +
                '}';
    }
}