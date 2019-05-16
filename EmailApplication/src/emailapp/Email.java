package emailapp;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private String companyEmail = "thecompany.com";
	private int mailboxCapacity = 500;
	private String altEmail;
	
	public Email() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter employees first name.");
		this.firstName = in.nextLine();
		System.out.println("Enter employees second name.");
		this.lastName = in.nextLine();
		
		this.department = setDepartment();
		this.password = setPassword();
		System.out.println("Your current password is: " + password);
		this.password = changePassword();
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyEmail;
		
	}
	
	private String setDepartment() {
		System.out.println("Enter Department Code: " +
							"\nPress 1 for sales" +
							"\nPress 2 for development" +
							"\nPress 3 for accounting");
		Scanner in = new Scanner(System.in);
		int departCode = in.nextInt();
		
		if(departCode == 1) {
			return department = "sales";
			
		}else if(departCode == 2){
			return department = "development";
		}else if(departCode == 3) {
			return department = "accounting";
		}else {
			return "Department does not exist";
		}
	}
	
	//generate password
	private String setPassword() {
		String passwordSet = "ABCDEFGHIJILMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#$%";
		int length = (int) (Math.random() * 12 + 6); //randomizes length of password
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//change password
	public String changePassword() {
		System.out.println("If you wish to change your password, press 1, if not, press any other number");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if(choice == 1) {
			this.password = setPassword();
			System.out.println("Your new password is " + password);
		}else {
			System.out.println("You have decided to keep your password as " + password);
		}
		return password;
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String altEmail() {
		return altEmail;
	}
	
	//override toString method
	public String toString() {
		return "Name:" + firstName + " " + lastName + "\n" +
	"Email:" + email + "\n" + "Mailbox memory available:" + mailboxCapacity + "mb";
	}
}
