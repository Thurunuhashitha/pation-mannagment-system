import java.util.*;
class Allocate_a_doctor_for_a_patient extends Admit_a_new_patient{
	static String doctor;
    static String medicine;
	void allocate(Admit_a_new_patient aa){
		
        Scanner input1 = new Scanner (System.in); 
		System.out.print("Insert your patient ID :-"); //Nothing happens becouse no any database);
		String ID = input1.nextLine();
        System.out.println("Success");
        
        System.out.println(" ");
		
        System.out.println("Allocate your doctor");
		System.out.println("01)Regarding borns(doctor supipi) ");
		System.out.println("02)Regarding brain(doctor thurunu)  ");
		System.out.println("03)Regarding muscle(doctor saman)  ");
		System.out.println("04)Regarding nerves(doctor mali)  ");

        System.out.println(" ");

		Scanner input2 = new Scanner (System.in); 
		System.out.print("your choice:-");
		doctor = input2.nextLine();

        System.out.println(" ");

		if(doctor.equals("1")){
			System.out.println("wait a bit for a doctor supipi");
			System.out.println("--doctor examining "+name);
			System.out.println("--the doctor will prescribe you medicine");
            doctor="Regarding borns(doctor supipi)";
            medicine="--(medecine given by doctor supipi)";
            System.out.println(medicine );
		}
		else if(doctor.equals("2")){
			System.out.println("wait a bit for a doctor thurunu");
			System.out.println("--doctor examining "+name);
			System.out.println("--the doctor will prescribe you medicine");
            doctor ="Regarding borns(doctor thurunu)";
            medicine = "--(medecine given by doctor thurunu)";
            System.out.println(medicine );
		}
		else if(doctor.equals("3")){
			System.out.println("wait a bit for a doctor saman");
			System.out.println("--doctor examining "+name);
			System.out.println("--the doctor will prescribe you medicine");
            doctor ="Regarding borns(doctor saman)";
            medicine = "--(medecine given by doctor saman)";
            System.out.println(medicine );
		}
		else if(doctor.equals("4")){
			System.out.println("wait a bit for a doctor mali");
			System.out.println("--doctor examining "+name);
			System.out.println("--the doctor will prescribe you medicine");
            doctor ="Regarding borns(doctor mali)";
            medicine ="--(medecine given by doctor mali)";
            System.out.println(medicine );
		}
		System.out.println("=========================="); 

		
			
		
	}	   	
}