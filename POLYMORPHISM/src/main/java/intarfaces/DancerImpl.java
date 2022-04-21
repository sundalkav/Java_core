package intarfaces;

public class DancerImpl implements DancerInterface {
    private String name;
    private int age;

    public DancerImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getDancer() {
        System.out.println(toString() + " Я танцую, как все.");
    }

    @Override
    public String toString() { return "Меня зовут " + name + ", мне " + age + " лет."; }


}
