package lab13_collection_map;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);

        System.out.println(list.get(0));
        System.out.println(list);

        System.out.println("-----------------------------------------------------");

        List<String> names =  new ArrayList<>();
        names.add("James");
        names.add("Breanna");
        names.add("Bella");
        names.add("Daniel");
        names.add("James");
        names.add("James");
        names.add("James");
        names.add("James");

        System.out.println(names);

        /*
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
         */

        for (String each : names) {
            System.out.println(each);
        }


        System.out.println("----------------------------------------------------------");
        Set<String> employees = new HashSet<>();
        employees.add("James");
        employees.add("Breanna");
        employees.add("Bella");
        employees.add("Daniel");
        employees.add("James");
        employees.add("James");
        employees.add("James");
        employees.add("James");

        System.out.println(employees);

        // System.out.println(employees.get(0));

        for (String each : employees) {
            System.out.println(each);
        }

        System.out.println( new ArrayList<>(employees).get(1) );

        System.out.println("----------------------------------------------------------");

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(
                "Java", "java", "JavA", "jAvA", "Python", "C#", "C++", "Ruby", "Java", "java", "JavA", "Jamila"
        ));

        words.removeIf( p -> p.toLowerCase().startsWith("j") &&  p.toLowerCase().endsWith("a"));

        System.out.println(words);


        words.forEach( c -> {
            if(!c.equals("Python"))
                System.out.println(c);
        } );




    }
}
