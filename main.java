import java.text.BreakIterator;
import java.util.*;
class main{
	
	public static void main(String[]args){

		boolean x=true; 
		while(x){
		
		System.out.println("01) Admit a new patient");
		System.out.println("02) Allocate a doctor for a patient");
		System.out.println("03) Allocate a bed for a patient");
		System.out.println("04) View the history of a patient");
		System.out.println("05) Record medication prescriptions for a patient");
		System.out.println("06) Discharge a patient from the hospital");
		System.out.println("07) Generate the bill");
		System.out.println("0) Exit");

		System.out.println(" ");
		
		 

		Scanner input1 = new Scanner (System.in); 
		System.out.print("what you want :-");
		int want = input1.nextInt();

		

		System.out.println(" ");

		Admit_a_new_patient aa=new Admit_a_new_patient();
		Allocate_a_doctor_for_a_patient bb=new Allocate_a_doctor_for_a_patient();
		Allocate_a_bed_for_a_patient cc=new Allocate_a_bed_for_a_patient();
		View_the_history_of_a_patient dd=new View_the_history_of_a_patient();
		Record_medication_prescriptions_for_a_patient ee=new Record_medication_prescriptions_for_a_patient();
		Discharge_a_patient_from_the_hospital ff=new Discharge_a_patient_from_the_hospital();
		Generate_the_bill gg=new Generate_the_bill();

		switch(want){

			case 1:
				aa.admit();	
				break;

			case 2:
				bb.allocate(aa);
				break;

			case 3:
				cc.bed(bb);
				break;

			case 4:
				dd.history(cc);
				break;

			case 5:
				ee.record(dd);
				break;

			case 6:
				ff.Discharge(cc);
				break;

			case 7:
				gg.bill(ee);
				break;

			case 0:
				x=false;
				break;

			default:
				System.out.println("Invalid input Please try again!");
		}	
		}
	}
}

