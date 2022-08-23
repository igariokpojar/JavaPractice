package lab001;

public class DigitSum2 {
    public static void main(String[] args) {
        int num = 532149;// 24
        int n1 = num/100000;
        int n2 = num%100000/10000;
        int n3 = num%10000/1000;
        int n4 = num%1000/100;
        int n5 = num%100/10;
        int n6 = num%10;
        System.out.println(n1+n2+n3+n4+n5+n6);

    }
}
