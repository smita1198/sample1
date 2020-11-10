package miniproject;

import java.util.Scanner;

public class email {
	
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String alternateEmail ;
	int defaultPasswordLength=10;
	private String email;
	private String phonenumber;
	private String companyName ="ltts.com";
	private int  mailBoxCapacity=500;

	
	//constructor to receive first and last name
	public email(String firstname ,String lastname){
		this.firstname= firstname;
		this.lastname= lastname;
		System.out.println("EMAIL CREATED: "+ this.firstname +" "+ this.lastname);
		
		//call a method asking for the department --return the department
		
		this.department=setDepartment();
		//System.out.println("Department: " +this.department);
		
		
		//call a method to return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is:" + this.password);
		
		this.phonenumber = phoneNumber();
		System.out.println("Your PhoneNumber is:" + this.phonenumber);
		
		//combine elements to generate email
		email= firstname.toLowerCase() + "." + lastname.toLowerCase()+"@"+companyName;
		//System.out.println("Your email is: " + email);
	}
	
	//ask for the department
	private String setDepartment() {
		System.out.println("NEW Worker:" + firstname + " " + "\nDepartment Code\n1 for ICP\n2 for Developer\n3 for tester\n4 for sales\nEnter the department code:");
		Scanner in =new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1){ return "ICP";}
		else if (depChoice==2){ return "developer";}
		else if (depChoice==3){ return "tester";}
		else if (depChoice==4){ return "sales";}
		else {return "";}
		
		
		
		
	}
	
	//set the password
	private String randomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNOPRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789@#$%!";
		char[] password = new char[length];
		for(int i=0; i<length;i++){
			int random=(int)(Math.random()*passwordSet.length());
			password[i]= passwordSet.charAt(random);
		}
		return new String(password);


		
	}
	private String phoneNumber()
	{
		String phoneNumber = "9937421056";
	      String regex = "(0/91)?[7-9][0-9]{9}";
	      //System.out.println("The phone number is: " + phoneNumber);
	     // System.out.println("Is the above phone number valid? " + phoneNumber.matches(regex));
		return phoneNumber;
		
	}
	
	
	// set the mailbox capacity
	public void setMailBoxCapacity(int capacity){
		this.mailBoxCapacity=capacity;
		
	}
	
	
	
	
	//set alternate email
	public void setalternateEmail(String altemail){
		this.alternateEmail=altemail;
		//System.out.println("Your alternate email is:" + this.alternateEmail);
	}
	
	//change the password
		public void changePassword(String password){
			this.password=password;
		}
		
		public int getMailBoxCapacity(){return mailBoxCapacity; }
		public String getalternateEmail(){return alternateEmail;}
		public String getPassword(){return password;}
		
		public String showdetails(){
			return "NAME:" + firstname + " " + lastname+
			       "\nDepartment Name:" + department +
			       "\nOfficial Email-ID:" +  email+
			       "\nPhone Number:" + phonenumber;
					
			
}

		
		
}
