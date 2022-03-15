import java.util.Scanner;

public class Area {
    int length;
    int breadth;


    public void setDim(int newlength, int newbreadth ){
        this.length = newlength;
        this.breadth = newbreadth;
    }

    public double getArea(){
        double area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int l = scan.nextInt();
        System.out.println("Enter Breadth: ");
        int b = scan.nextInt();
        Area a1 = new Area();
        a1.setDim(l,b);
        System.out.println(a1.getArea());
    }
}
