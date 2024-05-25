import java.util.*;

class NextDateGenerator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter date (day month year): ");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            int daysInMonth = (month == 2) ? (isLeapYear(year) ? 29 : 28) : ((month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31);

            day = (day < daysInMonth) ? day + 1 : 1;
            month = (day == 1) ? (month < 12 ? month + 1 : 1) : month;
            year = (day == 1 && month == 1) ? year + 1 : year;

            System.out.printf("\nNext date: %02d-%02d-%04d\n", day, month, year);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

