package ContactList;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    List<Contact> contacts = new ArrayList<>();
    public List<Contact> addContact(Contact contact){
        contacts.add(contact);
        return contacts;
    }
    public List<Contact> updateContact(Contact oldContact, Contact newContact){
        contacts.set(contacts.lastIndexOf(oldContact),newContact);
        System.out.print(oldContact.getName() + " was replace with " + newContact.getName());
        System.out.print("\n Update successful!\n");
        return contacts;
    }
    public List<Contact> removeContact(Contact contact){
        contacts.remove(contacts.indexOf(contact));
        System.out.println(contact + " was deleted.");
        System.out.println("Successfully deleted");
        return contacts;
    }
    public void printList(){
        System.out.print("Starting phone .....\n\n");
        System.out.println("Available actions: \npress" +
                "\n0 - to shut down" +
                "\n1 - to print contacts" +
                "\n2 - to add a new contact" +
                "\n3 - to update existing an existing contact" +
                "\n4 - to remove an exist contact" +
                "\n5 - query if an existing contact exists" +
                "\n6 - to print a list of available actions" +
                "\nChoose your action:");
    }
    public List<Contact> searchContact(Contact contactName){
        System.out.println("Name: " + contactName.getName() + " phone number: " + contactName.getPhone());
        return contacts;
        }
    }
