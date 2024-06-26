import java.util.*;

abstract class Base implements Comparable<Base> {
    protected String name;
    protected int yearBirth;
    protected int salary;
    protected static ArrayList<Base> list = new ArrayList<>();
    protected int experienceYears;
    protected static BaseList baseList = new BaseList();


    public Base(String name, int salary, int yearEmployment) {
        Random rnd = new Random();
        yearBirth = Calendar.getInstance().get(Calendar.YEAR) - (18 + rnd.nextInt(56 - 18));
        this.name = name;
        this.salary = salary;
        list.add(this);
        baseList.addEmployee(this);
        experienceYears = Calendar.getInstance().get(Calendar.YEAR) - yearEmployment;

    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public static ArrayList<Base> getList() {
        return list;
    }

    public static ArrayList<Base> getBaseList() {
        return baseList.getBaseList();
    }

    public abstract int avgMonthlySalary();

    public static void printArray() {
        System.out.println("Информация о сотрудниках:");
        for (Base base : list) {
            System.out.println("Имя: " + base.name + " год рождения: " + base.getYearBirth() + " Стаж работы: " + base.getExperienceYears());
        }
    }

    public int compareTo(Base base) {
        return Integer.compare(this.yearBirth, base.yearBirth);
    }

    public static Comparator<Base> experienceComparator = Comparator.comparingInt(emp -> emp.experienceYears);
}
