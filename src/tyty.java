import java.util.Scanner;

public class tyty {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число а: ");
        double a = in.nextDouble();
        System.out.println("Введите число b: ");
        double b = in.nextDouble();
        System.out.println("Введите число с: ");
        double c = in.nextDouble();

        double ds = b*b-4*a*c;
        double KDs = Math.sqrt(ds);
        if (KDs<0){
            System.out.println("Not");
        } else if (KDs==0){
            System.out.println("Дискриминант = 0");

        } else if (KDs > 0){
            double x1 = ((-1) * b + KDs)/(2 * a);
            double x2 = ((-1) * b - KDs)/(2 * a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
}
