public class Address {
    private String city;
    private String Street;
    private int wardno;

    public Address(String city, String Street, int wardno) {
        this.city = city;
        this.Street = Street;
        this.wardno = wardno;
    }

    public String toString() {
        String detail = "name of the city: " + this.city + "\t" + "streetname: " + this.Street + "\n" + "ward number: " + this.wardno;
        return detail;
    }
}

