public class Freelancer extends Base{


    public Freelancer(String name,int salary) {
        super(name,salary);
    }

    static Freelancer create(String name, int salary) {
        if (salary < 0) {
            throw new RuntimeException("отрицательная зарплата");
        }
        if (salary > 1202) {
            throw new RuntimeException("слишком большая зарплата");
        }

        return new Freelancer(name, salary);
    }

    @Override
    public int avgMonthlySalary() {
        return (int)(20.8*8*getSalary());
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "name='" + getName() + '\'' +
                ", yearBirth=" + getYearBirth() +
                ", AvgSalary=" + this.avgMonthlySalary() +
                '}';
    }

    @Override
    public int compareTo(Base o) {
        return 0;
    }


}
