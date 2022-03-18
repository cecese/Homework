package homework;

public class Homework1603BMI {
    public static void main(String[] args) {
        int myWeight = 52;
        double myHeight = 1.64;
        double myBMI =  myWeight / Math.pow(myHeight,2);
        System.out.println(myBMI);
        // check range
        double underWeight = 18.4;
        double normalWeight = 24.9;
        double overWeight = 30.0;
        String resultUnderWeight = myBMI < underWeight ?"yes":"no";
        System.out.println("I am underweight" + " " + resultUnderWeight);
        String resultNormal = myBMI>=underWeight && myBMI <=normalWeight ? "yes":"no";
        System.out.println("I am normalweight" + " " + resultNormal);
        String resultOverWeight = myBMI >= normalWeight && myBMI <= overWeight ? "yes":"no";
        System.out.println("I am overweight" + " " + resultOverWeight);
        String resultObese = myBMI > overWeight ? "yes":"no";
        System.out.println("I am obese" + " " + resultObese);

    }
}
