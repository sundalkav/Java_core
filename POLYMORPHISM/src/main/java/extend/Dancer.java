package extend;

public class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getDancer() {
        System.out.println(toString() + " Я танцую, как все.");
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + ", мне " + age + " лет.";
    }
}
