import java.util.*;
class Generate_the_bill extends Record_medication_prescriptions_for_a_patient{
    void bill(Record_medication_prescriptions_for_a_patient ee){
        Scanner input = new Scanner (System.in); 
		System.out.print("Insert your patient ID :-"); //Nothing happens becouse no any database
		ID = input.nextLine();
        System.out.println("Success");

        System.out.println(" ");

        System.out.println("Medecine given by doctor :-"+medicine);
        System.out.println("price of medicine" );
        System.out.print("Calculate price of this medicine " );
        System.out.print("Your billed Amount :-_____/= " );

        System.out.println(" ");
        System.out.println(" ");
    }
     
}