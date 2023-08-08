public class Employee {
    private String name;
    private String post;
    private int monthlysalary;

    public Employee(String name, String post, int monthlysalary) {
        this.name = name;
        this.post = post;
        this.monthlysalary = monthlysalary;
    }

    public long getYearlySalary() {
        return this.monthlysalary * 12;
    }

    public String getDetail() {
        String detail = "name: " + this.name + "post: " + this.post + "monthly salary: " + this.monthlysalary + "yearly salary: " + this.getYearlySalary();
        return detail;
    }
}