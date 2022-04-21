package extend;

public class BreakDancer extends Dancer {

    public BreakDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void getDancer() {
        System.out.println(toString() + " Я танцую брейк-данс.");
    }
}
