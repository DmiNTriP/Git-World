import java.util.*;
import java.nio.channels.*;
import java.text.*;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Contacts>aContact = new ArrayList();
		//create scanneds fir user input 
		Scanner textIn =new Scanner(System.in);
		Scanner numIn =new Scanner(System.in);
		//displays the menu options for the user 
		
		System.out.println("======== choose 1 for personal contact");
		System.out.println("======== choose 2 for business contact");
		System.out.println("======== choose 3 to get your Contacts");
		System.out.println("======== choose 4 to quit application");
		
		//prompt the user for input 
		System.out.println("======== please select a usable value");
		int choice = numIn.nextInt();
		//if user selects one of the options 
		switch(choice){
			//add contacts from friends list
			case 1:
				aContact.add(friendContact);
				
				//add contacts from business contacts
			case 2:
				aContact.add(bizContact);
				//get all contacts from contacts method
			case 3:
				aContact.add(getContacts);
				
			case 4:
				//close the application 
				System.exit(0);
				
				
						
						
				
		}
		
		}
		
		
		
		
		
}
