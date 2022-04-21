package intarfaces;

public class ElectricDancerImpl implements DancerInterface  {

    private String name;
    private int age;

    public ElectricDancerImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getDancer() {
        System.out.println(toString() + " Я танцую электрик-буги.");
    }

    @Override
    public String toString() { return "Меня зовут " + name + ", мне " + age + " лет."; }
}
