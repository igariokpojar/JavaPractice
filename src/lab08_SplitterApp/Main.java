package lab08_SplitterApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String[] OPTIONS_LIST =
                new String[]{"Make Expense",
                             "List Specific Person Expense",
                             "List All Expense",
                             "Make Split",
                             "List All Users",
                             "Close the budget"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Budget Planner!");


        //Ask how many ppl in the budget planner?
        System.out.println("How many people will split the budget?");

        //Users DB
        ArrayList<User> userList = prepareUserLists(scanner);


        //Expenses DB
        ArrayList<Expense> expenseList = new ArrayList<>();

        System.out.println("Added user count : " + userList.size());


        while (true) {

            System.out.println("What would you like to do?");

            for(int i=0;i<OPTIONS_LIST.length;i++){

                System.out.println(OPTIONS_LIST[i] + ":" + (i+1));

            }
            /* What would you like to do?
             * 1:  Make expense
             * 2:  List expense
             *
             * { make expense, list expense}
             *
             * request = 1
             *
             * switch (request - 1)
             */

            int request =  scanner.nextInt();

            switch(request-1){
                case 0:

                    //ask expanse name,amount,user

                    Expense expense = new Expense();

                    System.out.println("Expense name: ");
                    expense.expenseName = scanner.next();

                    System.out.println("Expense Amount: ");
                    expense.amount = scanner.nextInt();


                    System.out.println("Which user made this expense? Just type user id: ");

                    //show all users: id:0 name: Ozzy
                    printAllUsers(userList);
                    /*
                    * {a,b,c}
                    * indexOf(c)
                    * a <- not it
                    * b <- not it
                    * c <- found it! index 2
                     */


                    int userId = scanner.nextInt();

                    User user = userList.get(userId);

                    expense.user = user.name;



                    expenseList.add(expense);

                    break;

                case 1:

                    System.out.println("Please provide user name that you would like to search");
                    String userName = scanner.next();

                    User myUser = getUserByName(userName, userList);
                    if(myUser == null){
                        System.out.println("User not exists!");
                    }

                    ///List Specific Person Expense
                    //0 - expense amount : 100, expense by :0zzy
                    //1 - expense amount : 100, expense by :0zzy
                    //ozzy spent $ 200
                    int userExpenseAmount = 0;
                    int expenseCount=0;

                    for(int i=0;i<expenseList.size();i++){

                        if(expenseList.get(i).user.equals(userName)){

                            userExpenseAmount += expenseList.get(i).amount;
                            expenseCount++;

                            System.out.println(expenseCount + " -expense amount:" + expenseList.get(i).amount + ",expense by :" + expenseList.get(i).user);
                        }

                    }

                    System.out.println(myUser.name + " spent $ " + userExpenseAmount);

                    break;


                case 2:

                    for(int i = 0;i<expenseList.size();i++){
                        System.out.println(i + " - expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user);
                    }
                    break;
                case 3:

                    double totalAmount = 0;
                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for(Split split : splitList){

                        totalAmount += split.amount;
                    }

                    makeSplit(totalAmount,splitList);



                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);

            }

        }
    }

    public static User getUserByName(String name, List<User> userList) {
        User myUser = null;

        for(User chosenUser : userList){

            if(chosenUser.name.equals(name)){
                myUser = chosenUser;
                break;

            }
        }

        return myUser;
    }

    public static void printAllUsers(List<User> userList) {
        for (int i = 0; i < userList.size(); i++) {
            User u = userList.get(i);
            System.out.println("id: " + i + " name: " + u.name);
        }
    }

    public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

        double amount = totalAmount /splitList.size();


        //total 300
        //each person : 100

        for(Split split : splitList){

            if(split.amount > amount){
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));
            }else{
                System.out.println(split.userName + " need to give " + (-1 * (split.amount-amount)));
            }

        }





    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for(Expense expense : expenseList){

            Split split = existSplitList(expense.user,splitList);

            if(split != null){
                split.amount += expense.amount;

            }else{
                Split willBeAdded = new Split();
                willBeAdded.userName = expense.user;
                willBeAdded.amount = expense.amount;
                splitList.add(willBeAdded);
            }




        }




        return splitList;

    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) {

        for(Split split : splitList){
            if(split.userName.equals(userName)){
                return split;
            }
        }

        return null;

    }



    // create method returning datatype Arraylist<user> with parameters taking values from scanner
    public static ArrayList<User> prepareUserLists(Scanner scanner){

       // datatype       var name
        ArrayList<User> userList = new ArrayList<>(); // hold the objects

        int userCount = scanner.nextInt(); // 3 people for example

        // Create ArrayList list with userList name
        for(int i=0;i<userCount;i++) {

            // Create object using method User
            User user = new User();

            System.out.println("Name: ");

            // assign value from scanner into object parameters like name
            user.name = scanner.next();

            System.out.println("Email: ");
            user.email = scanner.next();

            // Store value in arrayList  :  collection in objects
            // adding
            userList.add(user);  //  put whole objects() in brackets

        }

        return userList;
    }


//    public static String[] prepareOptionList(){
//
//        /* Creating options
//        0 : Make Expense
//        1 : List Specific Person Expense
//        2 : List All Expense
//        3 : Make Split
//        4 : List All Users
//        5 : Close the budget
//        */
//
//        String[] optionList =
//
//        return optionList;
//    }
}


