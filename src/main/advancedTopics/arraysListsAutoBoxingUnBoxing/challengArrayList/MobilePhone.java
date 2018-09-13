package main.advancedTopics.arraysListsAutoBoxingUnBoxing.challengArrayList;

import java.util.ArrayList;

/**
 * Created by pthomson on 7/18/17.
 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();  //this initializes the array list
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }

        myContacts.add(contact);
        System.out.println("Added " + contact + " to your list of contacts.");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found in your list.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() +  " was deleted from your list.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);  //returns element position in the array returns a number greater than 0 if true or less than 0 if false
    }

    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++ ) {  //we are looping through the array checking for the contactName
            Contact contact = this.myContacts.get(i);       //which was passed to it is in the list, if it is, return position
            if (contact.getName().equals(contactName)) {    //if it isn't, returns a -1 to the addNewContact method which adds
                return i;                                   //the new contact name to the list
            }
        }
        return -1;
    }


    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact list");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                    this.myContacts.get(i).getName() +
                    " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}

