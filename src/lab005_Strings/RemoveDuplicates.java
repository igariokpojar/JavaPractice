package lab005_Strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "xyzxyzxyz";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            //result.indexOf(each) < 0
            if(!result.contains(""+each)) { // before adding character to the new string we check the new string does not contain the
                result += each;
            }

        }


        System.out.println(result);
    }
}
