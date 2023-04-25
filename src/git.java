import java.util.Scanner;
public class git{
    public static void main(String[]args){
        Scanner x=new Scanner (System.in);
        System.out.println("what is your name?");
        String name=x.nextLine();
        System.out.println("how old are you?");
        int age=x.nextInt();
        x.nextLine();
        System.out.println("what is your favorite color?");
        String color=x.nextLine();
        System.out.println("hello"+" "+name);
        System.out.println("you are"+" "+age+"years old");
        System.out.println("you like"+color);

    }
}