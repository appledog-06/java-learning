import java.util.Scanner;
public class Control{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your age:");
        int age=scanner.nextInt();
        if(age>=18) {
            System.out.println("you are an adult");
        }
        else if(age<18&&age>=10){
            System.out.println("you are a teenager");

        }
        else{
            System.out.println("You are a kid!");
        }
        String day="sunday";
        switch(day){
            case "sunday":System.out.println("it is sunday!") ;
            break;
            case "monday":System.out.println("it is monday!");
            break;
            case"tuesday":System.out.println("it is tuesday!");
            break;
            default:System.out.println("out of list!");
        }
        String name="";
        while(name.isBlank()) {
            System.out.println("enter your name:");
            name = scanner.nextLine();
        }
        System.out.println("hello"+name);
        for(int i=10;i>=0;i--){
            System.out.println(i);
        }
        System.out.println("happy coding!");
        }
    }

