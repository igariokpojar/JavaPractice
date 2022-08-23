package lab12_oop_exceptions.restaurantTask;

public class NoSuchPersonException extends RuntimeException{

    public NoSuchPersonException(String message) {
        super(message);
    }
}
/*
 Create a subclass of RuntimeException named NoSuchAPersonException

			add a constructor with string argument that can display the specified string as an exception message
 */