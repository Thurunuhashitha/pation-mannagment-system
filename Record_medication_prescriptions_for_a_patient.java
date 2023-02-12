import java.util.*;
class Record_medication_prescriptions_for_a_patient extends Allocate_a_bed_for_a_patient{
    void record( Allocate_a_bed_for_a_patient cc ){
        Scanner input1 = new Scanner (System.in); 
		System.out.print("Insert your patient ID :-"); //Nothing happens becouse no any database
		ID = input1.nextLine();
        System.out.println("Success");

        System.out.println(" ");

        System.out.println("Name:- "+name);  
		System.out.println("Patient ID :-"+ID);
        System.out.println("Doctor is :-"+doctor);
        System.out.println("Medicine :-"+medicine);

        System.out.println(" ");
         
       
    }
     
    
}