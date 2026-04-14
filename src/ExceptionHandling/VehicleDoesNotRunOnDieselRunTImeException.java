package ExceptionHandling;

public class VehicleDoesNotRunOnDieselRunTImeException extends RuntimeException{
    VehicleDoesNotRunOnDieselRunTImeException(){
        super("Your vehicle doesn't support Diesel");
    }

    VehicleDoesNotRunOnDieselRunTImeException(String message){
        super(message);
    }
}
