package ExceptionHandling;

import java.util.Scanner;

public class PetrolPumpForRunTime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Which vehicle you want fuel in?");
//        String userVehicle=sc.nextLine();
//        System.out.println("What do you want to refill?");
//        String userFuel= sc.nextLine();
        String userVehicle="Bike";
        String userFuel="Diesel";
       if(userVehicle.equalsIgnoreCase("bike") && userFuel.equalsIgnoreCase("diesel")){
           throw new VehicleDoesNotRunOnDieselRunTImeException();
       }

    }
}