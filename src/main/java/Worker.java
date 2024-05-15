public class Worker extends Base{

    public Worker(String name,int salary) {
        super(name,salary);
    }

    static Worker create(String name, int salary) {
        if (salary < 0) {
            throw new RuntimeException("отрицательная зарплата");
        }
        if (salary > 200000) {
            throw new RuntimeException("слишком большая зарплата");
        }
        return new Worker(name, salary);
    }

    @Override
    public int avgMonthlySalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", yearBirth=" + getYearBirth() +
                ", salary=" + this.avgMonthlySalary() +
                '}';
    }

    @Override
    public int compareTo(Base o) {
        return 0;
    }
}
