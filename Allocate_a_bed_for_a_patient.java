import java.util.*;
class Allocate_a_bed_for_a_patient extends Allocate_a_doctor_for_a_patient{
    static String ID;
    static String choice;
    static String number;
    void bed(Allocate_a_doctor_for_a_patient bb){

        Scanner input1 = new Scanner (System.in); 
		System.out.print("Insert your patient ID :-"); //Nothing happens becouse no any database
		ID = input1.nextLine();

        System.out.println(" ");

        System.out.println("What is your bed type :-");
		System.out.println("01)Manual ");
		System.out.println("02)Semi-electric  ");
		System.out.println("03)Fully-electric ");

        System.out.println(" ");

        Scanner input2 = new Scanner (System.in); 
		System.out.print("Enter your choice :-"); 
		choice = input2.nextLine();
		 
        if(choice.equals("1")){
            System.out.println("Free beds - ______"); //Nothing happens becouse no any database
            choice="Manual";
            
        }
        else if(choice.equals("2")){
            System.out.println("Free beds - ______"); //Nothing happens becouse no any database
            choice="Semi-electric ";    
        }
        else if(choice.equals("3")){
            System.out.println("Free beds - ______"); //Nothing happens becouse no any database
            choice="Fully-electric"; 
        }
        
        System.out.println(" ");

        Scanner input3 = new Scanner (System.in); 
		System.out.print("Enter bed number you want:-"); 
	    number = input3.nextLine();
        System.out.println("Name:- "+name); 
        System.out.println("ID:- "+ID);
        System.out.println("Bed type:- "+choice); 
        System.out.println("Bed number:- "+number);

        System.out.println(" ");
        
    }
}