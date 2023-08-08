public class Student {
    private String name;
    private int roll;
    private Address addr;

    public Student(String name, int roll, Address addr) {
        this.name = name;
        this.roll = roll;
        this.addr = addr;
    }

    public String toString() {
        String detail = "name: " + this.name + "\t" + "roll: " + this.roll + "\t" + this.addr;
        return detail;
    }
}
