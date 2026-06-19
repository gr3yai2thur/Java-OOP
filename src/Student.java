public class Student{
    String name;
    String id;
    double gpa;

    void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);
    }

    boolean isPass(){
        return gpa >= 2.0;
    }

    void setGPA(double newGPA){
        gpa = newGPA;
    }
}

public void main(String[] args) {
    Student student1 = new Student();
    student1.name = "Alice";
    student1.id = "S12345";
    student1.setGPA(3.5);

    student1.printInfo();
    System.out.println("Pass: " + student1.isPass());
}