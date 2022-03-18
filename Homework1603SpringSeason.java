package homework;

public class Homework1603SpringSeason {
    public static void main(String[] args) {
        int month = 3;
        int day = 21;
        String dayOfMonth = month >=3 && month <=6 ? "yes":"no";
        System.out.println(dayOfMonth);
        String trueMonth = (month == 3 && day >=20) || (month == 6 && day <= 20) || (month > 3 && month < 6) ? "true":"false";
        System.out.println(trueMonth);
        String dayData = (month > 3 && month < 6) || ((month == 3 && day >= 20) || (month ==6 && day <=20)) ? "true":"false";
        System.out.println(dayData);





    }
}
