package emailapp;

import java.util.Scanner;



public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Email e1 = new Email("Mike", "Shin");
		//System.out.println(e1.toString());
	
		System.out.println("How many new employees are being hired?");
		Scanner in = new Scanner(System.in);
		int numEmails = in.nextInt();
		Email emails[] = new Email[numEmails];
		
		for(int i = 0; i < numEmails; i++) {
			emails[i] = new Email();
			System.out.println(emails[i].toString());
			System.out.println("***************************");
		}
	}

}
