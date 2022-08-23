package lab13_collection_map;


import lab12_oop_exceptions.restaurantTask.Chef;
import lab12_oop_exceptions.restaurantTask.Employee;
import lab12_oop_exceptions.restaurantTask.Server;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] nums = new int[3];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        nums = new int[5];

        System.out.println(  Arrays.toString(nums));

        System.out.println("-------------------------------------");

        int[] scores = {10, 20, 30, 40, 50};
        //  int[] scores2 = new int[]{10, 20, 30, 40, 50};

        System.out.println("-------------------------------------");

        int[][] arr2D = {}; // for 1-D Array
        int[][][] arr3D = {}; // for 2-D Array

        System.out.println("-------------------------------------");

        Employee[] employees = {
                new Server("Emily", 35, 'F', "A01", 55000),
                new Chef("Daniel", 42, 'M', "B01", "Head Chef", 85000)
        };


        System.out.println(Arrays.toString( employees ) );



    }
}
