package chapter4;

import java.util.Scanner;

public class CompanyInfo {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String companyName = input.nextLine();
		
		System.out.print("Enter address: ");
		String address = input.nextLine();
		
		System.out.print("Enter web site: ");
		String site = input.nextLine();
		
		System.out.print("Enter name of manager: ");
		String managerName = input.nextLine();
		
		System.out.print("Enter phone number: ");
		int phone = input.nextInt();
		
		System.out.print("Enter fax number: ");
		long fax = input.nextLong();

		System.out.printf("%s is one of the best software companies in Bulgaria. " + "Its address is \"%s\".\n" + 
				"You can contact it via phone number %d or fax number %d.\n" + 
				"The company also has a web site - www.%s. " + "The manager of it is %s.", 
				companyName, address, phone, fax, site, managerName);
		
		input.close();
	}
}
