public class MyStudent {
    public static void main(String[] args) {
        Student student1 = new Student("KuroSensei", "68011212041", null);
        Student student2 = new Student("ShiroSensei", "68011212042", student1);
        student2.printStudent();
    }
}
