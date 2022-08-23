package lab005_Strings;

import java.util.*;

public class WhileLoopPractice {
    public static void main(String[] args) {

        System.out.println("Would you like to continue? yes/no");

        Scanner input = new Scanner(System.in);
        String a = input.nextLine();

        while (!(a.equals("yes")|| a.equals("no"))){
            System.err.println("Invalid entry!Would you like to continue? yes/no");
            a = input.nextLine().toLowerCase();

        }

    }
}
