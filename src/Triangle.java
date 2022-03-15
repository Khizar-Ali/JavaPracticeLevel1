public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(){
        a = 3;
        b = 4;
        c = 5;
    }
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area_tri(){
        double area = 0;
        System.out.println("Perimeter: "+ (a+b+c));
        double s = (a + b + b)/2;
        area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        return area;
    }
    public static double area_triangle(int a, int b, int c){
        double area = 0;
        System.out.println("Perimeter: "+ (a+b+c));
        double s = (a + b + b)/2;
        area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        return area;
    }

    public static void main(String[] args) {
        System.out.println("Question No 3:");
        System.out.println("Area: "+area_triangle(3,4,5));

        Triangle tri = new Triangle(3,4,5);
        System.out.println("Question No 4:" );
        System.out.println("Area: "+tri.area_tri());
    }
}
