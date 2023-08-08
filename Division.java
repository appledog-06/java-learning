import java.util.*;
public class Division {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[]args) {
        try {
            System.out.println("enter first int:");
            int a = scan.nextInt();
            System.out.print("enter second int: ");
            int b = scan.nextInt();
            int ans = a / b;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("integer only");
        } finally {
            System.out.println("end");
        }
    }


        }
