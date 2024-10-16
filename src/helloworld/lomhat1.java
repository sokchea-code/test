package helloworld;

import java.util.Scanner;

public class lomhat1 {
    public static void main(String[] args) {
        System.out.println("Let's do the shopping together!!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a code of product: " );
        int code = sc.nextInt();
        System.out.print("Enter product name: " );
        String name = sc.next();
        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter product price: ");
        float price = sc.nextFloat();
        System.out.println("Your code product is: " + code);
        System.out.println("Your product name is: " + name);
        System.out.println("Your product quantity is: " + quantity);
        System.out.println("Your product price is $: " + price);
        float total = price*quantity;
        System.out.println("The total of your product is $: " + total);
    }
}
