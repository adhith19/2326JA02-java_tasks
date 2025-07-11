2HASHSET
----------------
import java.util.HashSet;

import java.util.Scanner;



public class UniqueEmailsFixed {

    public static void main(String[] args) {

        HashSet<String> emailSet = new HashSet<>();

        Scanner sc = new Scanner(System.in);



        System.out.print("How many email addresses you want to enter? ");

        int count = sc.nextInt();

        sc.nextLine();


        for (int i = 0; i < count; i++) {

            System.out.print("Enter email " + (i + 1) + ": ");

            String email = sc.nextLine();



            if (emailSet.add(email)) {

                System.out.println("Email added.");

            } else {

                System.out.println("Duplicate email. Not added.");

            }