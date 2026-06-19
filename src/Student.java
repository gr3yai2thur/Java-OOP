public class Student{
    String name;
    String id;
    Student classMate;

    Student(String n, String i, Student cm){
        name = n;
        id = i;
        classMate = cm;
    }

    void setClassMate(Student cm){
        classMate = cm;
    }

    void printStudent(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        if(classMate != null){
            System.out.println("Classmate: " + classMate.name);
        } else {
            System.out.println("No classmate");
        }
    }
}