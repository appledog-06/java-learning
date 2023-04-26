public class Maths {
    public static void main(String[]args){
        double x=3.14;
        double y= -10;

        double z= Math.max(x, y);
        System.out.println(z);
        double w=Math.min(x,y);
        System.out.println(w);
        double a=Math.abs(y);
        double b=Math.sqrt(x);
        double c=Math.ceil(y);
        double d=Math.floor(x);
        System.out.println(a+","+b+" "+c+","+d);



    }
}
