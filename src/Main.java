import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //task 1
        int year = 2059;
        printLeapYear(year);

        //task 2
        int clientOS = 1;
        int clientDeivceYear = 2016;
        suggestVerision(clientOS, clientDeivceYear);

        //task3
        int deliveryDistance = 95;
        int cuontDeliveryDays = cuontDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней:" + cuontDeliveryDays);
    }



    private static void suggestVerision (int clientOS,int clientDeivceYear){
        int currentYear = LocalDate.now().getYear();
        String resultString = buildResultString (clientOS, clientDeivceYear, currentYear);
        System.out.println(resultString);
    }



    private static int cuontDeliveryDays(int deliveryDistance) {
        int deluveryDays = 4;
        if (deliveryDistance <= 20) {
            deluveryDays = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deluveryDays = 1;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deluveryDays = 3;
        }
        return deluveryDays;
    }

    private static void printLeapYear(int year) {
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            System.out.println("Год" + year + "высокостный");
        } else {
            System.out.println("Год" + year + "не высокостный");
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}