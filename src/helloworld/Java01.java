package helloworld;

import java.util.Scanner;

public class Java01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        String gender;
        int age;
        String address;
        String School;
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Gender: ");
        gender = sc.next();
        System.out.print("Enter Address: ");
        address = sc.next();
        System.out.print("Enter School: ");
        School = sc.next();

        System.out.println("My name is " + name);
        System.out.println("My ID is " + id);
        System.out.println("My Gender is " + gender);
        System.out.println("My Address is " + address);
        System.out.println("My School is " + School);


    }
}
