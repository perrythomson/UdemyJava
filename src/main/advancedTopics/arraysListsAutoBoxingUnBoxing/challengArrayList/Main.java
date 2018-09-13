package main.advancedTopics.arraysListsAutoBoxingUnBoxing.challengArrayList;

import java.util.Scanner;

/**
 * Created by pthomson on 7/18/17.
 */
public class Main {

//    Create a program that implements a simple mobile phone with the following capabilities.
//    Able to store, modify, remove and query contact names.
//    You will want to create a separate class for Contacts (name and phone number).
//    Create a master class (MobilePhone) that holds the ArrayList of Contacts.
//    The MobilePhone class has the functionality listed above.
//    Add a menu of options that are available.
//    Options: Quit, print list of contacts, add new contact, update existing contact, remove contact
//    and search/find contact.
//    When adding or updating be sure to check if the contact already exists (use name).
//    Be sure not to expose the inner workings of the ArrayList to MobilePhone.
//    e.g. no ints, no .get(i) etc.
//    MobilePhone should do everything with Contact objects only.

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("801 949 0059");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    System.out.println("\nPrinting all contacts in list.");
                    mobilePhone.printContacts();
                    break;

                case 2:
                    System.out.println("\nAdding a new contact to the list.");
                    addNewContact();
                    break;

                case 3:
                    System.out.println("\nUpdating and existing contact.");
                    updateContact();
                    break;

                case 4:
                    System.out.println("\nRemoving a contact from the list.");
                    removeContact();
                    break;

                case 5:
                    System.out.println("\nQuery for existing contact.");
                    queryContact();
                    break;

                case 6:
                    System.out.println("\nPrint available actions.");
                    printActions();
                    break;

            }
        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added " + name + " and " + phone + " to the list.");
        } else {
            System.out.println("Cannot add " + name + " and " + phone + " because they are already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Update name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact name not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter name to remove: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Name not found.");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully removed contact.");
        } else {
            System.out.println("Error removing contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter the name you would like to search for: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Name not found in list.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - print a list of available actions");
        System.out.println("Please make an available selection.");
    }


}