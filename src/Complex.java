public class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex sum(Complex other){
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;
        return new Complex(r,i);
    }
    public Complex difference(Complex other){
        double r = this.real - other.real;
        double i = this.imaginary - other.imaginary;
        return new Complex(r, i);
    }
    public Complex product(Complex other){
        double r = this.real * other.real;
        double i = this.imaginary * other.imaginary;
        return new Complex(r, i);
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(4, 6);
        Complex sum = c1.sum(c2);
        Complex difference = c1.difference(c2);

        System.out.println("first complex number: " + c1);
        System.out.println("second complex number: " + c2);
        System.out.println("sum of two complex numbers: " + sum);
        System.out.println("difference of two complex numbers: " + difference);
    }
}
