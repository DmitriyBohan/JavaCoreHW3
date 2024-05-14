public class Main {
    public static void main(String[] args) {

        try {
            Freelancer freelancer1 = Freelancer.create("Dima", 1202);
            System.out.println(freelancer1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Worker worker1 = Worker.create("Olga", 58000);
            System.out.println(worker1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Worker worker2 = Worker.create("Sveta", 75000);
            System.out.println(worker2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
