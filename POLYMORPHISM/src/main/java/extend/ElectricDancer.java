package extend;

public class ElectricDancer extends Dancer {

    public ElectricDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void getDancer() {
        System.out.println(toString() + " Я танцую электрик-буги.");
    }
}
