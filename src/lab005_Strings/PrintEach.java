package lab005_Strings;

public class PrintEach {
    public static void main(String[] args) {

        String word = "Wooden Spoon";

        for (int i = 0; i <=word.length()-1 ; i++) {// trage atentia la (=) or la (-1);

            char each =   word.charAt(i);// ne da char or "Wooden Spoon"  daca vrem length :scoatem char each =   word.charAt(i) si print(i);

            System.out.print(each);

        }
    }
}
