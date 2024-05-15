public class Worker extends Base{

    public Worker(String name,int salary,int yearEmployment) {
        super(name,salary,yearEmployment);
    }

    static Worker create(String name, int salary,int yearEmployment) {
        if (salary < 0) {
            throw new RuntimeException("отрицательная зарплата");
        }
        if (salary > 200000) {
            throw new RuntimeException("слишком большая зарплата");
        }
        return new Worker(name, salary,yearEmployment);
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


}
