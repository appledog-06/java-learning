public class Test {
    public static void main(String[]args){
        Employee emp=new Employee("alex","accountant",10000);
        System.out.println(emp.getDetail());
        Teacher t=new Teacher("kate","hod",20000,2);
        System.out.println(t.getDetail());
    }
}
