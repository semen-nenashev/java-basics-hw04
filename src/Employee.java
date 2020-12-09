public class Employee implements Payable {
    static String employeeId;
    static String name;
    public double monthSalary;

    public Employee() {
    }

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return monthSalary;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getEmployeeId() + " " + String.format("%.2f", this.getAverageMonthlySalary());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("123", "Petro");
        System.out.println(e1.getName());
    }

    @Override
    public void calculatePay() {
        this.monthSalary = monthSalary;
    }
}
