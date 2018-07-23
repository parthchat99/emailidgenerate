package emailapp;

import java.util.Scanner;

public class Email 
{
	private String firstname;
	private String lastname;
	private int birthyear;
	private String password;
	private String department;
	private String email;
	private int mailboxcapacity=500;
	private int defaultpasswordlength=10;
	private String alternateemail;
	private String companySuffix="essar.com";
	private String altpassword;
	private String newpassword;
	private String c;
		
	//Constructor to receive first name and last name
	public Email()
	{	
		//Name of employee whose mail is to be created
		Scanner name=new Scanner(System.in);
		System.out.println("Enter Firstname of employee :-");
		firstname=name.nextLine();
		Scanner name1=new Scanner(System.in);
		System.out.println("Enter Lastname of employee :-");
		lastname=name1.nextLine();
		Scanner dob=new Scanner(System.in);
		System.out.println("Enter Date of Birth of employee :-");
		//for(int i = 0;i<birthyear.length;i++)
		{
			birthyear=dob.nextInt();
		}
		System.out.println("Name of employee whose email has to be created: "+firstname+" "+lastname);
		
		//Call the method asking for a department
		this.department=setDepartment();
		System.out.println("Department= "+this.department);
		
		//Call the method for a random password
		this.password=randomPassword(defaultpasswordlength);
		System.out.println("Your Password is : "+this.password);
		
		//Combine elements to generate email
		email=firstname.toLowerCase()+lastname.toLowerCase()+birthyear+"@"+department.toLowerCase()+"."+companySuffix;
		System.out.println("YOUR EMAIL ID IS :- "+email);
		
		//Call method to reveal mail box capacity
		this.mailboxcapacity=500;
		System.out.println("Mail box capacity is :- "+this.mailboxcapacity);
		
		//Call method to change password
		this.alternateemail=firstname.toLowerCase()+lastname.toLowerCase()+birthyear+"@gmail.com";
		System.out.println("Alternate email ID is :- "+this.alternateemail);
		
		//Call method to change password
		this.password=passcodechange();
	}
	
	//Ask for department
	private String setDepartment()
	{
		System.out.println("DEPARTMENT CODES\n1. For Sales\n2. For Purchase\n3. Accounts\n" +
				"4. Human Resource\n5. Administration\n6. Operations\n7. Electrical\n8. Mechanical\n" +
				"9. Civil\n10. Instrumentation\n11. Warehouse\n12. Safety\n13. Health\n14. Environment\n" +
				"Enter the department =");
		Scanner In=new Scanner(System.in);
		int deptchoice=In.nextInt();
		if (deptchoice==1)
		{
			return "sales";
		}
		else if (deptchoice==2) 
		{
			return "purchase";
		}
		else if (deptchoice==3) 
		{
			return "accounts";
		}
		else if (deptchoice==4) 
		{
			return "hr";
		}
		else if (deptchoice==5) 
		{
			return "admin";
		}
		else if (deptchoice==6) 
		{
			return "operations";
		}
		else if (deptchoice==7) 
		{
			return "electrical";
		}
		else if (deptchoice==8) 
		{
			return "mechanical";
		}
		else if (deptchoice==9) 
		{
			return "civil";
		}
		else if (deptchoice==10) 
		{
			return "instrumentation";
		}
		else if (deptchoice==11) 
		{
			return "warehouse";
		}
		else if (deptchoice==12) 
		{
			return "safety";
		}
		else if (deptchoice==13) 
		{
			return "health";
		}
		else if (deptchoice==14) 
		{
			return "environment";
		}
		else 
		{
			return "";
		}
	}

	//Generate random password
	private String randomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Password change
	private String passcodechange()
	{
		Scanner doyou=new Scanner(System.in);
		System.out.println("Do you want to change your password?\n1. Yes\n2. No\n");
		int passchoice=doyou.nextInt();
		if(passchoice==1)
		{
			Scanner pass=new Scanner(System.in);
			System.out.println("Enter old password :- ");
			this.altpassword=pass.nextLine();
			if(this.altpassword!=this.password)
			{
				Scanner newpass=new Scanner(System.in);
				System.out.println("Enter new password :-");
				newpassword=newpass.nextLine();
				this.password=c;
				this.password=newpassword;
				System.out.println("Your new password is :- "+this.newpassword);
			}
			else
			{
				System.out.println("Invalid old password entered");
			}
		}
		else
		{
			System.out.println("No password changed");
		}
		return new String(password);
	}
}

