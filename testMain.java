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
                    System.out.print("Enter new contact name: ");
                    Scanner input1 = new Scanner(System.in);
                    String name = input1.nextLine();
                    ps1.setName(name);
                    System.out.print("Enter new contact phone: ");
                    Scanner input2 = new Scanner(System.in);
                    String phone = input2.nextLine();
                    ps1.setPhone(phone);
//                    System.out.println("New contact added: name = " + ps1.getName() + ", phone = " + ps1.getPhone());
                    cl = conList.addContact(ps1);
                      for (int i = 0; i < cl.size(); i++) {
                          for (int j = i + 1; j < cl.size(); j++) {
                              if (cl.get(i).getName().equals(cl.get(j).getName()) && cl.get(i).getPhone().equals(cl.get(j).getPhone())) {
                                  cl.remove(j);
                              }
                          }
                      }
                    break;
                case 3:
                    Contact ps2 = new Contact();
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter exist contact name: ");
                    String oldName  = input.nextLine();
                    for (int i = 0; i < cl.size(); i++){
                            if (cl.get(i).getName().equals(oldName) ) {
                                System.out.print("Enter new contact name: ");
                                Scanner input4 = new Scanner(System.in);
                                String newName = input4.nextLine();
                                ps2.setName(newName);
                                System.out.print("Enter new contact phone: ");
                                Scanner input5 = new Scanner(System.in);
                                String newPhone = input5.nextLine();
                                ps2.setPhone(newPhone);
                                cl = conList.updateContact(cl.get(i), ps2);
                                break;
                            }
                        }
//                        else {
//                            System.out.println("Name you enter don't exist!");
//                            break;
//                        }
                    break;
                case 4:
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Enter exist contact name: ");
                    String delName = input3.nextLine();
                    for (int i = 0; i < cl.size(); i++) {
                        if (cl.get(i).getName().equals(delName)) {
                           cl = conList.removeContact(cl.get(i));
                        }
                    }
                    break;
                case 5:
                    Scanner input4 = new Scanner(System.in);
                    System.out.print("Enter exist contact name: ");
                    String findName = input4.nextLine();
                    for (int i = 0; i < cl.size(); i++) {
                        if (cl.get(i).getName().equals(findName)) {
                         cl = conList.searchContact(cl.get(i));
                        } else {
                            System.out.println("not found!");
                            break;
                        }
                    }
                    break;
                case 6 :
                  conList.printList();
                  break;
            }
            } while (choose != 0);
        }
}
