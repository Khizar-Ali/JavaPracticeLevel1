public class Student {
    String name;
    int roll_no;
    long phone_no;
    String address;

    public Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;

    }

    public Student(String name, int roll_no, long phone_no, String address){
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getRoll_no(){
        return roll_no;
    }
    public String getAddress(){
        return address;
    }
    public long getPhone_no(){
        return phone_no;
    }


    public static void main(String[] args) {
        Student s1 = new Student("John",2);
        System.out.println("Name:" + s1.getName() +"\nRoll No:" + s1.getRoll_no());

        System.out.println("-------Problem No 2--------");
        Student s2 = new Student("Sam", 3, 332312431,"ABC NY,NY");
        Student s3 = new Student("john", 4, 333234231,"XYZ NY,NY");
        System.out.println("Name:" + s2.getName() +"\nRoll No:" + s2.getRoll_no()
                +"\nPhone No:" + s2.getPhone_no()+"\nAddress:" + s2.getAddress());
        System.out.println("Name:" + s3.getName() +"\nRoll No:" + s3.getRoll_no()
                +"\nPhone No:" + s3.getPhone_no()+"\nAddress:" + s3.getAddress());
    }
}
