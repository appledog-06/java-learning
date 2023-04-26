import java.util.Random;
public class Num {
    public static void main(String[]args){
        Random random=new Random();
        int x=random.nextInt(6)+1;
        System.out.println(x);
        double y=random.nextDouble();
        boolean z=random.nextBoolean();
        System.out.println("random values of double"+y+" "+"random values of boolean"+z);

    }
}
