package lab12_oop_exceptions.restaurantTask;

public class NoSuchJobException extends RuntimeException{

    public NoSuchJobException(String exceptionMsg) {
        super(exceptionMsg); // displays the specified message as an exception message
    }

}
/*
1. Create a subclass of RuntimeException named NoSuchAJobException

			add a constructor with string argument that can display the specified string as an exception message
 */
