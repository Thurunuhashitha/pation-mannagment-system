import java.util.*;
class Admit_a_new_patient{
	static String name;
	static String age;
	static String address;
	static String sex;
	static String mo_no;
	static String ID;


	void admit(){
	    
		Scanner input1 = new Scanner (System.in); 
		System.out.print("what is your Name:-");
		name = input1.nextLine();
		
		Scanner input2 = new Scanner (System.in); 
		System.out.print("what is your Age:-");
		age = input2.nextLine();
		
		Scanner input3 = new Scanner (System.in); 
		System.out.print("what is your Address:-");
		address = input3.nextLine();
		
		Scanner input4 = new Scanner (System.in); 
		System.out.print("what is your Gender:-");
		sex = input4.nextLine();
		
		Scanner input5 = new Scanner (System.in); 
		System.out.print("what is your Mobile_No:-");
		mo_no = input5.nextLine();

		Scanner input6 = new Scanner (System.in); 
		System.out.print("Enter your patient ID:-");
		ID = input6.nextLine();

		//String [] patient={name,age,address,sex,mo_no};
		
		 
		System.out.println("Name :-"+name);
		System.out.println("Age :-"+age);
		System.out.println("Gender :-"+address);
		System.out.println("Address :-"+sex);
		System.out.println("Mobile_No :-"+mo_no);
		System.out.println("Patient ID :-"+ID);

		System.out.println("====================="); 
	}
	 
}