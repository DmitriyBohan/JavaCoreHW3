import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        try {
            Freelancer freelancer1 = Freelancer.create("Dima", 1202,2020);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Worker worker1 = Worker.create("Olga", 58000,2019);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Worker worker2 = Worker.create("Sveta", 75000,2024);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(Base.getList());
        Collections.sort(Base.list,Base.experienceComparator);
        Base.printArray();
        System.out.println("-----------------");


        //Создать класс, содержащий массив или коллекцию сотрудников (как Worker так и Freelancer),
        // и реализовать возможность вывода данных с использованием foreach (подсказка: вам потребуется поработать с интерфейсом Iterable).
        for (Base base : Base.getBaseList()){
            System.out.println(base);
        }










    }
}
