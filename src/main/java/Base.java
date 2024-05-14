import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public abstract class Base {
    protected String name;
    protected int yearBirth;
    protected int salary;
    private ArrayList<Base> list = new ArrayList<>();


    public Base(String name, int salary) {
        Random rnd = new Random();
        yearBirth = Calendar.getInstance().get(Calendar.YEAR) - (18 + rnd.nextInt(56 - 18));
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public abstract int avgMonthlySalary();

    public void addArray() {
        try {
            list.add(this);
            System.out.println(this.toString() + " add to Arraylist");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
