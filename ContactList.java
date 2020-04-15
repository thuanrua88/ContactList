package ContactList;

import java.util.List;

public class ContactList {
    public void addContact(Contact contact, List<Contact> contacts){
        contacts.add(contact);
    }
    public void updateContact(String oldContact, Contact newContact, List<Contact> contacts){
            contacts.set(contacts.indexOf(oldContact),newContact);
    }
    public void removeContact(Contact contact,List<Contact> contacts){
        System.out.println("Enter exist contact name: " + contact);
        if (contacts.contains(contact)){
            contacts.remove(contacts.indexOf(contact));
            System.out.println("Succesfull, " + contact + "was deleted!");
        } else {
            System.out.println("Contact don't exist from list!");
        }
    }
    public void printList(Contact ps2, List<Contact> cl){
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
    public void searchContact(String contactName,List<Contact> contacts){
        System.out.print("Enter exist contact name: ");
        if (contacts.contains(contactName)){
            System.out.println("Name : " + contactName + "phone number is ");
        } else {
            System.out.print("Name " + contactName + "does not exist");
        }
    }
}
