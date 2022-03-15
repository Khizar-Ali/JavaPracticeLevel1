public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double Area(){
        double area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);

        System.out.println(r1.Area());
        System.out.println(r2.Area());


    }

}
