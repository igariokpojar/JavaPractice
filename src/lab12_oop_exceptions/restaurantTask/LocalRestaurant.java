package lab12_oop_exceptions.restaurantTask;

public class LocalRestaurant {

    public static void main(String[] args) {

        Employee employee1 = new Server("Emily", 35, 'F', "A01", 55000);

        System.out.println(employee1);

        employee1.work();
        ((Server) employee1).takeOrder();
        ((Server) employee1).cleanTable();

        System.out.println("----------------------------------------------------");

        Employee employee2 = new Chef("Daniel", 42, 'M', "B01", "Head Chef", 85000);

        employee2.work();
        ((Chef) employee2).makeOrder();
        ((Chef) employee2).washDishes();

        System.out.println("----------------------------------------------------");

        // Restaurant restaurant = new Chef("Daniel", 42, 'M', "B01", "Head Chef", 85000);

        try {
            ((Server) employee2).takeOrder();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("----------------------------------------------------");

        Restaurant restaurant = new Restaurant("Josh", "7925 Jones Branch Dr", 4.5);

        System.out.println(restaurant);

        restaurant.hireServer((Server) employee1);
        restaurant.hireChef( (Chef) employee2 );



        System.out.println(restaurant);
    }
}
