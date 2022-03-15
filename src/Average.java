import java.util.Scanner;

public class Average {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First Num: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the Second Num: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the Third Num: ");
        int num3 = scan.nextInt();

        System.out.println("Average: " + average(num1,num2,num3));
    }

    public static double average(int a, int b, int c){
        double avg = (a+b+c)/3;
        return avg;
    }
}
