import java.util.Arrays;

public class Employee{
    String name;
    int year_of_joining;
    int salary;
    String address;

    public Employee(String name, int year_of_joining, int salary, String address){
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.salary = salary;
        this.address = address;
    }

    public String toString(){
        return name + "     " + year_of_joining + "     " + address +"\n";
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0]=new Employee("Robert",2013,3000,"64C-Wallstreet");
        emp[1]=new Employee("Sam",2014,3500,"68D-Wallstreet");
        emp[2]=new Employee("John",2015,2000,"26B-Wallstreet");

        System.out.println("Name    " + "Year of Joining" + "   Address");
        System.out.println(Arrays.toString(emp));
    }
}
