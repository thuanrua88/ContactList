package ContactList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        List<Contact> cl = new ArrayList<>();
        ContactList conList = new ContactList();
        int choose;
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
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter choose: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    if (cl.isEmpty()){
                        System.out.println("Contact List is null!");
                    } else {
                        for (int i = 0; i < cl.size(); i++){
                            System.out.println((i+1) + "." + cl.get(i));
                        }
                    }
                    break;
                case 2:
                    Contact ps1 = new Contact();
                    System.out.println("Enter new contact name: ");
                    Scanner input1 = new Scanner(System.in);
                    String name = input1.nextLine();
                    ps1.setName(name);
                    System.out.println("Enter new contact phone: ");
                    Scanner input2 = new Scanner(System.in);
                    String phone = input2.nextLine();
                    ps1.setPhone(phone);
                    System.out.println("New contact added: name = " + ps1.getName() + ", phone = " + ps1.getPhone());
                    conList.addContact(ps1,cl);
                    break;
                case 3:
                    Contact ps2 = new Contact();
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Enter exist contact name: ");
                    String oldName  = input3.nextLine();
                    for (int i = 0; i < cl.size(); i++){
                        if (cl.get(i).getName().equals(oldName)){
                            System.out.println("Enter new contact name: ");
                            Scanner input4 = new Scanner(System.in);
                            String newName = input4.nextLine();
                            ps2.setName(newName);
                            System.out.println("Enter new contact phone: ");
                            Scanner input5 = new Scanner(System.in);
                            String newPhone = input5.nextLine();
                            ps2.setPhone(newPhone);
                            conList.updateContact(oldName,ps2,cl);
                            break;
                        } else {
                            System.out.println("Name you enter don't exist!");
                            break;
                        }
                    }
            }
            } while (choose != 0);
        }
}
