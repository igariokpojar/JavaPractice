package lab001;

public class DigitSum {
    public static void main(String[] args) {
        int sum = 29814; // 2+9+8+1+4 = 24
        int num1 = sum/10000;
        int num2 = sum%10000/1000;
        int num3 = sum%1000/100;
        int num4 = sum%100/10;
        int num5 = sum%10;
        System.out.println(num1+num2+num3+num4+num5);
    }
}
