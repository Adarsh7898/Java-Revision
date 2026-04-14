package ExceptionHandling;

import java.util.Scanner;

public class UsingThrow {
    public static void main(String[] args) {

        System.out.printf("Please enter you age: ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try{
            if(age<18) throw new RuntimeException("Abhi bachcha hai...");
            else {
                System.out.printf("Vote daal le beta....");
            }
        }
        catch (Exception e){
            System.out.printf(e.getMessage());
        }


    }
}