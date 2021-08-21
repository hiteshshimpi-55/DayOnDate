package DayOnDate;

public class code {
    public static void main(String[] args) {
        int ref = 1900;
        int year = 2020;
        System.out.println(dayOnDate(year,ref));
    }
    static String dayOnDate(int year,int ref){
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int noOfYear = year - ref;
        int noOfLeapYear= 0;
        int noOfNonLeapYear=0;
        while (ref<=year){
            if (((ref % 4 == 0) && (ref % 100!= 0)) || (ref%400 == 0)){
                noOfLeapYear++;
            }
            else {
                noOfNonLeapYear++;
            }
            ref++;
        }
        int noOfDays = noOfLeapYear*366 + noOfNonLeapYear*365;
        return days[noOfDays%7];

    }
}
