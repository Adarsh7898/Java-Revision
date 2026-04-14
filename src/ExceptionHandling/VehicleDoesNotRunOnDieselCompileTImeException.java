package ExceptionHandling;

public class VehicleDoesNotRunOnDieselCompileTImeException extends Exception{
    VehicleDoesNotRunOnDieselCompileTImeException(){
        super("Your vehicle doesn't support Diesel");
    }

    VehicleDoesNotRunOnDieselCompileTImeException(String message){
        super(message);
    }
}
