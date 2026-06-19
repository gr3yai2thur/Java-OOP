public class MyMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        date1.setDay(29);
        date1.setMonth(2);
        date1.setYear(2021);
        date1.print();

        MyDate date2 = new MyDate(5, 7, 2025);
        date2.print();
    }
}
