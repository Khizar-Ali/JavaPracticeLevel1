import java.util.Scanner;

public class Area2 {
    int length;
    int breadth;

    public Area2(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea(){
        double area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int l = scan.nextInt();
        System.out.println("Enter Breadth: ");
        int b = scan.nextInt();
        Area2 r1 = new Area2(4,5);
        System.out.println(r1.returnArea());
    }
}
