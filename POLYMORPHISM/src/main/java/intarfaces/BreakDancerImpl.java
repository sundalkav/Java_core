package intarfaces;

public class BreakDancerImpl implements DancerInterface {
    private String name;
    private int age;

    public BreakDancerImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getDancer() {
        System.out.println(toString() + " Я танцую брейк-данс.");
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + ", мне " + age + " лет.";
    }
}
