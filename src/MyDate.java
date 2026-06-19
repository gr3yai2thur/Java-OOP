public class MyDate {
    int day;
    int month;
    int year;

    MyDate() {
        day = 1;
        month = 1;
        year = 2025;
    }

    MyDate(int newDay, int newMonth, int newYear) {
        day = newDay;
        month = newMonth;
        year = newYear;
    }

    void setDay(int newDay) {
        if (newDay < 1 || newDay > 31) day = 0;
        else day = newDay;
    }

    void setMonth(int newMonth) {
        if (newMonth < 1 || newMonth > 12) month = 0;
        else month = newMonth;
    }

    void setYear(int newYear) {
        year = newYear;
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }

    void print() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}
