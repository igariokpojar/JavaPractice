package lab005_Strings;

public class FrequencyOfWord {
    public static void main(String[] args) {
        // Explicit method

       /* String sentence = "Java Java Java Java Python C# Ruby";

        int original_length = sentence.length();

        String temp = sentence;// create  (tem) temporary value

        temp = temp.replace("Java", "aaa");// "aaa aaa aaa aaa"
        int new_length = temp.length();

        System.out.println(original_length);

        System.out.println();
        System.out.println(new_length);

        int totalNumberOfJava = original_length-new_length;

        System.out.println(totalNumberOfJava);
*/



        System.out.println("____________short methode_____________________________________________________");

        String sentence = "Java Java Java Java Python C# Ruby Java Java";
        String temp = sentence.replace("Java", "abc");
        int totalNumberOfJava = sentence.length() - temp.length();

        System.out.println(totalNumberOfJava);


        System.out.println("________________replace first___________________________________________");

        String s = "Today is Thursday, and tomorrow is Thursday";

        s = s.replaceFirst("Thursday", "Wednesday");

        System.out.println(s);






    }
}
