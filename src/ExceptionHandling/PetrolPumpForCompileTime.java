package ExceptionHandling;

import java.util.Scanner;

public class PetrolPumpForCompileTime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Which vehicle you want fuel in?");
//        String userVehicle=sc.nextLine();
//        System.out.println("What do you want to refill?");
//        String userFuel= sc.nextLine();

        String userVehicle="Bike";
        String userFuel="Diesel";

        try{
            if(userVehicle.equalsIgnoreCase("Bike") && userFuel.equalsIgnoreCase("Diesel")) throw new VehicleDoesNotRunOnDieselCompileTImeException();
            else{
                System.out.printf("Bike refueled");
            }
        }
        catch (Exception e ){
            System.out.printf(e.getMessage());
        }

    }
}
