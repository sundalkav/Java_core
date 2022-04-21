import extend.BreakDancer;
import extend.Dancer;
import extend.ElectricDancer;
import intarfaces.BreakDancerImpl;
import intarfaces.DancerImpl;
import intarfaces.DancerInterface;
import intarfaces.ElectricDancerImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerMain {
    public static void main(String[] args) {
        // Полиморфизм с помощью наследование
        Dancer dancer = new Dancer("Никита", 10);
        Dancer dancerBreak = new BreakDancer("Антон", 15);
        Dancer dancerElectric = new ElectricDancer("Денис", 20);
        List<Dancer> dancers = new ArrayList<>();
        dancers.add(dancer);
        dancers.add(dancerBreak);
        dancers.add(dancerElectric);
        for (Dancer d : dancers) {
            d.getDancer(); // полиморфный вызов метода
        }
        System.out.println("--------------------------");
        // Полиморфизм с помощью интерфейса
        DancerInterface dancerInterface = new DancerImpl("Иван", 25);
        DancerInterface dancerInterfaceBreak = new BreakDancerImpl("Эмилия", 28);
        DancerInterface dancerInterfaceElectric = new ElectricDancerImpl("Илья", 30);
        List<DancerInterface> interfaceList = Arrays.asList(dancerInterface, dancerInterfaceBreak, dancerInterfaceElectric);
        for (DancerInterface d : interfaceList) {
            d.getDancer(); // полиморфный вызов метода
        }
    }
}
