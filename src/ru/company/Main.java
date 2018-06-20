package ru.company;
import ru.company.users.Users;
import ru.company.users.Users.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Users user = new Users();
        System.out.print("Enter you name: ");
        String userName = scanner.nextLine();
        System.out.println("Hallo! " + user.getName(userName));

        System.out.println("Enter you address: ");
        String userAddress = scanner.nextLine();
        System.out.println("You address is: " + user.getAddress(userAddress));

        System.out.println("Enter you phone: ");
        long userPhone = scanner.nextLong();
        System.out.println("You phone namber is: " + user.getTel(userPhone));

        System.out.println("Enter you age: ");
        int userAge = scanner.nextInt();
        if ( userAge < 18 ) {
            System.out.println("You age less than 18 years!!!");
        }
        else {
            System.out.println("You are " + user.getAge(userAge) + ", welcome!!!");
        }





    }
}
