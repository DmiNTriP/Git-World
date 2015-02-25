/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 /**

 */
package contactslist;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DmintriP
 */
public class ContactsList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @param dValue option chooser for contact list
         *
         */
        int digitValue;
        Scanner numIn = new Scanner(System.in);
        /**
         * @param contacts array list for contacts
         *
         */
        ArrayList<Contacts> aContact = new ArrayList<Contacts>();
        while (true) {
            System.out.println("=================================================|");
            System.out.println("|              Contacts List                     |");
            System.out.println("=================================================|");
            System.out.println("|      Choose an Option!                         |");
            System.out.println("|     1. Add a new Business Contact              |");
            System.out.println("|     2. Add a new Personal Contact              |");
            System.out.println("|     3. Display your Contacts                   |");
            System.out.println("| 4.Exit the program                         |");
            System.out.println("|================================================|");
            System.out.println("Please input a corresponding numerical value from the above menu: ");
            digitValue = numIn.nextInt();
            /**
             * @param digitValue value user enters to get to proper interface
             */
            switch (digitValue) {
                //adding a business contact
                case 1:
                    //System.out.println("1 worked");
                    addContacts(aContact);
                    break;
                case 2:
                    //add a personal contact
                    System.out.println("2 worked");
                    addContacts(aContact);
                    break;
                /**
                 * right both contacts to a file have section for business and
                 * personal
                 */
                case 3:
                    System.out.println("3 worked");
                    getContacts(aContact);
                    break;
                //exit the program
                case 4:
                    System.exit(0);
                    break;
                //if user enters anything else other than mentioned above 
                default:
                    System.out.println("invalid selection please try again");
            }
        }
    }

    private static void addContacts(ArrayList<Contacts> aContact) {
        //creates a file for user output and input
//        Scanner fileIn = new Scanner(System.in);
//        System.out.println("Input File: ");
//        String fileInName = fileIn.next();
//        System.out.println("Output File: ");
//        String fileOutName = fileIn.next();

        //Scanner and PrintWriter objects for reading and Writing 
     
        Scanner textIn = new Scanner(System.in);
        Scanner numIn = new Scanner(System.in);
       
       // System.out.println("Enter 1 for Business contact or 2 for Personal contact");
       int choice = numIn.nextInt();
        
            if (choice == 1) {
                  System.out.println("Enter your First Name: ");
        String fName = textIn.nextLine();
        System.out.println("Enter your Last Name: ");
        String lName = textIn.nextLine();
        System.out.println("Enter your Address: ");
        String address = textIn.nextLine();
        System.out.println("Enter your Phone number in this format xxx-xxx-xxxx");
        String phoneNum = textIn.nextLine();
        System.out.println("Enter your e-mail address: ");
        String eMail = textIn.nextLine();
                System.out.println("what is your Job Title: ");
                String jobTitle = textIn.nextLine();
                System.out.println("what Department do you work in: ");
                String department = textIn.nextLine();
                Contacts aBiz = new Business(fName, lName, address, phoneNum, eMail, jobTitle, department);
                aContact.add(aBiz);
            } else if (choice == 2) {
                  System.out.println("Enter your First Name: ");
        String fName = textIn.nextLine();
        System.out.println("Enter your Last Name: ");
        String lName = textIn.nextLine();
        System.out.println("Enter your Address: ");
        String address = textIn.nextLine();
        System.out.println("Enter your Phone number in this format xxx-xxx-xxxx");
        String phoneNum = textIn.nextLine();
        System.out.println("Enter your e-mail address: ");
        String eMail = textIn.nextLine();
                System.out.println("Enter your BirthDate: ");
                String birthDate = textIn.nextLine();
                Contacts aFriend = new Personal(fName, lName, address, phoneNum, eMail, birthDate);
                aContact.add(aFriend);
            } else {
                System.out.println("You did not enter a valid selection");
            }
        }
    
        
     /**
      * 
      * @param aContact 
      */   
  public static void getContacts(ArrayList<Contacts> aContact) {
//              //creates a file for user output and input
        Scanner input = new Scanner(System.in);
//        System.out.println("Input File: ");
//        String fileInName = fileIn.next();
//        System.out.println("Output File: ");
//        String fileOutName=fileIn.next();
//        
//        //Scanner and PrintWriter objects for reading and Writing 
//        File inputFile = new File(fileInName);
        Scanner numIn = new Scanner(System.in);
        for (int i = 0; i < aContact.size(); i++) {
            System.out.println(i + " " + aContact.get(i).getfName() + " " + aContact.get(i).getlName());
           }
        // option used to write to file
                System.out.println("Please enter the ID Number of the Contact you wish to see: ");
                int choice = numIn.nextInt();
                System.out.println(aContact.get(choice).toString());
                
                

//        Scanner numIn = new Scanner(System.in);
    }

}

