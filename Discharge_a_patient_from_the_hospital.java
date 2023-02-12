import java.util.*;
class Discharge_a_patient_from_the_hospital extends Allocate_a_bed_for_a_patient{
    void Discharge(Allocate_a_bed_for_a_patient cc ){

        Scanner input1 = new Scanner (System.in); 
		System.out.print("Insert your patient ID :-"); //Nothing happens becouse no any database
		ID = input1.nextLine();
        System.out.println("Success");
        
        System.out.println(" ");

        Scanner input2 = new Scanner (System.in); 
		System.out.print("Are you sure about discharge from hospital (yes or no) :-");  
		String dischar = input2.nextLine();

        if(dischar.equals("yes")){
            System.out.println("Bed type :-"+choice);
            System.out.println("Bed number:-"+number);
            System.out.println("this bed is avelable againg");//this bed is avelable againg
        }
        System.out.println(" ");
    }
}