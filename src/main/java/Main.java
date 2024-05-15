import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        try {
            Freelancer freelancer1 = Freelancer.create("Dima", 1202);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Worker worker1 = Worker.create("Olga", 58000);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Worker worker2 = Worker.create("Sveta", 75000);

        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
