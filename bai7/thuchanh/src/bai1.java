public class bai1 {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    Student(){}
    Student(int r,String n){
        this.name=n;
        this.rollno=r;
    }
    static void change(){
        college="CODEGYM";
    }
    public void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
