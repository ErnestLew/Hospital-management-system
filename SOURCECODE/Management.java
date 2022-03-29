import java.time.format.DateTimeFormatter;  
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
import java.time.LocalDateTime;  
import java.util.ArrayList;

public class Management {
	int count =0;
	  static Doctor[] doctor = new Doctor[25];
	  static Patient[] patient = new Patient[100];
	  static Lab[] lab = new Lab[20];
	  static Facility[] facility = new Facility[20];
	  static Medical[] medical= new Medical[100];
	  static Staff[] staff = new Staff[100];
	public static void main(String[] args) {
		   DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime date = LocalDateTime.now();  

		   //IntValidationResult[] validInt = new IntValidationResult[];
  
		   for(int a = 0; a < 3; a++) {
			   doctor[a] = new Doctor();
			   patient[a] = new Patient();
			   lab[a] = new Lab();
			   facility[a] = new Facility();
			   medical[a] = new Medical();
			   staff[a] = new Staff();
		   }
	
    doctor[0].setId("111");
    doctor[0].setName("Lew Jun Xian");
    doctor[0].setQuali("MBBS, MD");
    doctor[0].setSpec("Surgeon");
    doctor[0].setWorktime("8-2pm");
    doctor[0].setRoom(11);
    
    
    doctor[1].setId("112");
    doctor[1].setName("Edward");
    doctor[1].setQuali("MBBS, MD");
    doctor[1].setSpec("Surgeon");
    doctor[1].setWorktime("8-2pm");
    doctor[1].setRoom(45);
     
    doctor[2].setId("113");
    doctor[2].setName("Ivan");
    doctor[2].setQuali("MBBS, MS");
    doctor[2].setSpec("Surgeon");
    doctor[2].setWorktime("9-2pm");
    doctor[2].setRoom(8);
   
    staff[0].setId("211");
    staff[0].setName("Lew Jun Xian");
    staff[0].setDesignation("Doctor");
    staff[0].setSex("Male");
    staff[0].setSalary(5000);
        
    staff[1].setId("212");
    staff[1].setName("Brandon");
    staff[1].setDesignation("Doctor");
    staff[1].setSex("Male");
    staff[1].setSalary(5000);
    
    staff[2].setId("213");
    staff[2].setName("Sean");
    staff[2].setDesignation("Doctor");
    staff[2].setSex("Male");
    staff[2].setSalary(6000);
    
    patient[0].setId("311");
    patient[0].setName("Lew Jun Xian");
    patient[0].setDisease("Headache");
    patient[0].setSex("Male");
    patient[0].setAdmitStatus("Discharge");
   
    patient[1].setId("312");
    patient[1].setName("Teddy");
    patient[1].setDisease("Heart Attack");
    patient[1].setSex("Male");
    patient[1].setAdmitStatus("Admit");
    
    patient[2].setId("313");
    patient[2].setName("Betty");
    patient[2].setDisease("Diabetes");
    patient[2].setSex("Male");
    patient[2].setAdmitStatus("Discharge");
    
    medical[0].setName("Paracetomol");
    medical[0].setManucfacturer("Medlife");
    medical[0].setExpiryDate("20-03-2021");
    medical[0].setCost(20);
    medical[0].setccount(50);
    
    medical[1].setName("Panadol");
    medical[1].setManucfacturer("Hamacis");
    medical[1].setExpiryDate("07-03-2021");
    medical[1].setCost(20);
    medical[1].setccount(50);
    
    medical[2].setName("Piriton");
    medical[2].setManucfacturer("Medlife");
    medical[2].setExpiryDate("22-10-2021");
    medical[2].setCost(10);
    medical[2].setccount(50);
    
    lab[0].setLab("General Lab");
    lab[0].setCost(10000);
    
    lab[1].setLab("General Lab 2");
    lab[1].setCost(20000);
    
    lab[2].setLab("General Lab 3");
    lab[2].setCost(100000);
    
    facility[0].setFacility("ICU Room");
    facility[1].setFacility("Emergency Room");
    facility[2].setFacility("Trauma Room");
    
    Scanner scan=new Scanner(System.in);
    String Input;
    String repeat1;
    int input1 = 0, repeat = 0;
    String choice1;
    System.out.append("Welcome to the Hospital Management System \n "+ time.format(date));
      
    do
    {
    	System.out.append("\n\nWelcome, Mr/Ms  \n"+ time.format(date));
    	System.out.println("\n--------------------------");
    	System.out.append("Main menu ");
    	System.out.println("\n--------------------------");
    	System.out.append("1. Doctors\n2. Patients\n3. Staffs\n4. Medicals\n5. Laboratories \n6. Facilities \n7. Exit");
    	System.out.println("\nPlease make your choice that you wish to: ");
        choice1 = scan.nextLine();
        
    	switch(choice1) {
    	case "1": 
    		do {
   		 		do {
   		 			System.out.println("\n--------------------------");
   		 			System.out.println("Doctor Records");
   		 			System.out.println("--------------------------");
   		 			System.out.println("Please enter your choice\n 1. List of doctors\n 2. Add new record\n 3. Search\n 4. Back");
   		 			Input = scan.nextLine();
   		 			if(Input.matches("1|2|3|4")) {
   		 				input1 = Integer.parseInt(Input);
   		 			}
   		 			else {
   		 				System.out.println("Error ! Please key in again !");
   		 			}
   		 		}while(!Input.matches("1|2|3|4"));
   		 	
   		 		int b = Doctor.dcount;
   		 		switch(input1)
   		 		{
   		 		case 1:
   		 			System.out.println("\n--------------------------------------------------------------------------------------");
   		 			System.out.println("ID\tName\t\t   Specialization\tWork time\tQualification\tRoom");
   		 			System.out.println("--------------------------------------------------------------------------------------");
   		            for (int i = 0; i < Doctor.dcount; i++) {
   		            	doctor[i].showDoctorInfo();
   		            }
   		            break;
   		            
   		 		case 2:
   		 			doctor[b] = new Doctor();
   		 			doctor[b].newDoctor();
   		 			break;
   		 		
   		 		case 3:
   		 			Scanner newScan1 = new Scanner(System.in);
   		 			String dsearch;
   		 			System.out.println("Please enter the id you want to search: ");
   		 			dsearch = newScan1.nextLine();
   		 			for(b = 0; b < Doctor.dcount; b++) {
   		 				if(doctor[b].getId().equals(dsearch)) {
   		 					System.out.println("\n--------------------------------------------------------------------------------------");
   		 					System.out.println("ID\tName\t\t   Specialization\tWork time\tQualification\tRoom");
   		 					System.out.println("--------------------------------------------------------------------------------------");
   		 					doctor[b].showDoctorInfo();
   		 				}		 				
   		 			}
   		 				break;
   		 				
   		 		case 4:
   		 			break;
   		 				
   		 		default:
   		 			System.out.println("Input Error !");
   		 				break;
   		 		}
   		 		
   		 		System.out.println("Do you want to reuse the page? (Press 1 for yes, Press 2 for no): ");
   		 		repeat1 = scan.nextLine();
   		 		while(!repeat1.matches("1|2")) {
   		 			System.out.println("Error ! Please enter again !");
   		 				repeat1 = scan.nextLine();
   		 		}
    		}while(!repeat1.matches("2"));
    		break;

    	case "2":
    		do {
    			do {
    				System.out.println("\n--------------------------");
   		 			System.out.println("Patient Records");
   		 			System.out.println("--------------------------");
    				System.out.println("Please enter your choice\n 1. List of patient\n 2. Add new record\n 3. Search\n 4. Back");
    				Input = scan.nextLine();
    				if(Input.matches("1|2|3|4")) {
   		 				input1 = Integer.parseInt(Input);
   		 			}
   		 			else {
   		 				System.out.println("Error ! Please key in again !");
   		 			}
   		 		}while(!Input.matches("1|2|3|4"));
    			
    				int b = Patient.pcount;
    				switch(input1)
    				{
	 				case 1:
	 					System.out.println("\n--------------------------------------------------------------------------------------");
	 					System.out.println("ID\tName\t\tDisease\t\t     Sex\tAdmit Status ");
	 					System.out.println("--------------------------------------------------------------------------------------");
	   		            for (int i = 0; i < Patient.pcount; i++) {
	   		            	patient[i].showPatientInfo();
	   		            }
	   		            break;
	   		            
	 				case 2:
	 					patient[b] = new Patient();
	   		 			patient[b].newPatient();
	   		 			break;
	   		 			
	 				case 3:
	 					Scanner newScan2 = new Scanner(System.in);
	 					String psearch;
	 					System.out.println("Please enter the id you want to search: ");
		 				psearch = newScan2.nextLine();
		 				for(b = 0; b < patient.length; b++) {
		 						if(patient[b].getId().equals(psearch)) {
		 							System.out.println("\n--------------------------------------------------------------------------------------");
		 							System.out.println("ID\tName\t\tDisease\t\t     Sex\tAdmit Status ");
		 							System.out.println("--------------------------------------------------------------------------------------");
		 							patient[b].showPatientInfo();
		 						}
		 				}
		 				break;
		 				
	 				case 4:
	 					break;
		 				
	 				default:
	   		 			System.out.println("Input Error !");
	   		 				break;
	   		 		}
	   		 		
	   		 		System.out.println("Do you want to reuse the page? (Press 1 for yes, Press 2 for no): ");
	   		 		repeat1 = scan.nextLine();
	   		 		while(!repeat1.matches("1|2")) {
	   		 			System.out.println("Error ! Please enter again !");
	   		 			repeat1 = scan.nextLine();
	   		 		}
	    		}while(!repeat1.matches("2"));
	    		break;
	 
	  case "3":
		  do {
  			do {
  				System.out.println("\n--------------------------");
		 		System.out.println("Staff Records");
		 		System.out.println("--------------------------");
  				System.out.println("Please enter your choice\n 1. List of staff\n 2. Add new record\n 3. Search\n 4. Back");
  				Input = scan.nextLine();
  				if(Input.matches("1|2|3|4")) {
 		 				input1 = Integer.parseInt(Input);
 		 			}
 		 			else {
 		 				System.out.println("Error ! Please key in again !");
 		 			}
 		 		}while(!Input.matches("1|2|3|4"));
  			
  				int b = Staff.scount;
  				switch(input1)
  				{
	 				case 1:
	 					System.out.println("\n--------------------------------------------------------------------------------------");
	 					System.out.println("ID\tName\t\t     Designation\tSex\t   Salary ");
	 					System.out.println("--------------------------------------------------------------------------------------");
	   		            for (int i = 0; i < Staff.scount; i++) {
	   		            	staff[i].showStaffInfo();
	   		            }
	   		            break;
	   		            
	 				case 2:
	 					staff[b] = new Staff();
	   		 			staff[b].newStaff();
	   		 			break;
	   		 			
	 				case 3:
	 					Scanner newScan3 = new Scanner(System.in);
	 					String ssearch;
	 					System.out.println("Please enter the id you want to search: ");
		 				ssearch = newScan3.nextLine();
		 				for(b = 0; b < staff.length; b++) {
		 						if(staff[b].getId().equals(ssearch)) {
		 							System.out.println("\n--------------------------------------------------------------------------------------");
		 							System.out.println("ID\tName\t\t     Designation\tSex\t   Salary ");
		 							System.out.println("--------------------------------------------------------------------------------------");
		 							staff[b].showStaffInfo();
		 						}
	 						}
		 				break;
		 				
	 				case 4:
	 					break;
	 					
	 				default:
	   		 			System.out.println("Input Error !");
	   		 				break;
	   		 		}
	   		 		
	   		 		System.out.println("Do you want to reuse the page? (Press 1 for yes, Press 2 for no): ");
	   		 		repeat1 = scan.nextLine();
	   		 		while(!repeat1.matches("1|2")) {
	   		 			System.out.println("Error ! Please enter again !");
	   		 			repeat1 = scan.nextLine();
	   		 		}
	    		}while(!repeat1.matches("2"));
	    		break;
 		    
	  case "4":
		  do {
	  			do {
	  				System.out.println("\n--------------------------");
   		 			System.out.println("Medical Records");
   		 			System.out.println("--------------------------");
	  				System.out.println("Please enter your choice\n 1. List of medical\n 2. Add new record\n 3. Search\n 4. Back");
	  				Input = scan.nextLine();
	  				if(Input.matches("1|2|3|4")) {
	 		 				input1 = Integer.parseInt(Input);
	 		 			}
	 		 			else {
	 		 				System.out.println("Error ! Please key in again !");
	 		 			}
	 		 		}while(!Input.matches("1|2|3|4"));
	  			
	  				int b = Medical.mcount;
	  				switch(input1)
	  				{
	  				case 1:
	  					System.out.println("\n--------------------------------------------------------------------------------------");
	  					System.out.println("Name\t\tManufacturer\tExpiryDate\tCost\t   Value");
	  					System.out.println("--------------------------------------------------------------------------------------");
	   		            for (int i = 0; i < Medical.mcount; i++) {
	   		            	medical[i].showMedicalInfo();
	   		            }
	   		            break;
	   		            
		 		 		case 2:
		 		 			medical[b] = new Medical();
		   		 			medical[b].newMedical();
		   		 			break;
		   		 			
		 		 		case 3:
		 		 			Scanner newScan4 = new Scanner(System.in);
		 		 			String msearch;
		 		 			System.out.println("Please enter the name you want to search: ");
		 		 			msearch = newScan4.nextLine();
		 		 			for(b = 0; b < medical.length; b++) {
		 		 				if(medical[b].getName().equals(msearch)) {
		 		 					System.out.println("\n--------------------------------------------------------------------------------------");
		 		 					System.out.println("Name\t\tManufacturer\tExpiryDate\tCost\t   Value");
		 		 					System.out.println("--------------------------------------------------------------------------------------");
		 		 					medical[b].showMedicalInfo();
		 		 				}
		 		 			}
		 		 			break;
		 		 			
		 		 		case 4:
		 		 			break;
		 		 			
		 		 		default:
		   		 			System.out.println("Input Error !");
		   		 				break;
		   		 		}
		   		 		
		   		 		System.out.println("Do you want to reuse the page? (Press 1 for yes, Press 2 for no): ");
		   		 		repeat1 = scan.nextLine();
		   		 		while(!repeat1.matches("1|2")) {
		   		 			System.out.println("Error ! Please enter again !");
		   		 			repeat1 = scan.nextLine();
		   		 		}
		    		}while(!repeat1.matches("2"));
		    		break;
	    
	  case "5":
		  do {
	  			do {
	  				System.out.println("\n--------------------------");
   		 			System.out.println("Lab Records");
   		 			System.out.println("--------------------------");
	  				System.out.println("Please enter your choice\n 1. List of lab\n 2. Add new record\n 3. Search\n 4. Back");
	  				Input = scan.nextLine();
	  				if(Input.matches("1|2|3|4")) {
	 		 				input1 = Integer.parseInt(Input);
	 		 			}
	 		 			else {
	 		 				System.out.println("Error ! Please key in again !");
	 		 			}
	 		 		}while(!Input.matches("1|2|3|4"));
	  			
	  				int b = Lab.lcount;
	  				switch(input1)
	  				{
	 		 		case 1:
	 		 			System.out.println("\n--------------------------------------------------------------------------------------");
	 		 			System.out.println("Lab\t\t     Cost");
	 		 			System.out.println("--------------------------------------------------------------------------------------");
	   		            for (int i = 0; i < Lab.lcount; i++) {
	   		            	lab[i].showLabInfo();
	   		            }
	   		            break;
	   		            
	 		 		case 2:
	 		 			lab[b] = new Lab();
	   		 			lab[b].newLab();
	   		 			break;
	   		 			
	 		 		case 3:
	 		 			Scanner newScan5=new Scanner(System.in);
	 		 			String lsearch;
	 		 			System.out.println("Please enter the lab you want to search: ");
	 		 			lsearch = newScan5.nextLine();
	 		 			for(b = 0; b < lab.length; b++) {
	 		 				if(lab[b].getLab().equals(lsearch)) {
	 		 					System.out.println("\n--------------------------------------------------------------------------------------");
	 		 					System.out.println("Lab\t\t     Cost");
	 		 					System.out.println("--------------------------------------------------------------------------------------");
	 		 					lab[b].showLabInfo();
	 		 				}
	 		 			}
	 		 				break;
	 		 				
	 		 		case 4:
	 		 			break;
	 		 				
	 		 			
	 		 		default:
	   		 			System.out.println("Input Error !");
	   		 				break;
	   		 		}
	   		 		
	   		 		System.out.println("Do you want to reuse the page? (Press 1 for yes, Press 2 for no): ");
	   		 		repeat1 = scan.nextLine();
	   		 		while(!repeat1.matches("1|2")) {
	   		 			System.out.println("Error ! Please enter again !");
	   		 			repeat1 = scan.nextLine();
	   		 		}
	    		}while(!repeat1.matches("2"));
	    		break;
	    
	  case "6":
		  do {
	  			do {
	  				System.out.println("\n--------------------------");
   		 			System.out.println("Facility Records");
   		 			System.out.println("--------------------------");
	  				System.out.println("Please enter your choice\n 1. List of facilities\n 2. Add new record\n 4. Back");
	  				Input = scan.nextLine();
	  				if(Input.matches("1|2|3")) {
	 		 				input1 = Integer.parseInt(Input);
	 		 			}
	 		 			else {
	 		 				System.out.println("Error ! Please key in again !");
	 		 			}
	 		 		}while(!Input.matches("1|2|3"));
	  			
	  				int b = Facility.fcount;
	  				switch(input1)
	  				{
	 		 		case 1:
	 		 			System.out.println("\n--------------------------------------------------------------------------------------");
	 		 			System.out.println("Facility ");
	 		 			System.out.println("--------------------------------------------------------------------------------------");
	   		            for (int i = 0; i < Facility.fcount; i++) {
	   		            	facility[i].showFacilityInfo();
	   		            }
	   		            break;
	   		            
	 		 		case 2:
	 		 			facility[b] = new Facility();
	   		 			facility[b].newFacility();
	   		 			break;
	   		 			
	 		 		case 3:
	 		 			break;
	   		 			
	 		 		default:
	   		 			System.out.println("Input Error !");
	   		 				break;
	   		 		}
	   		 		
	   		 		System.out.println("Do you want to reuse the page? (Press 1 for yes, Press 2 for no): ");
	   		 		repeat1 = scan.nextLine();
	   		 		while(!repeat1.matches("1|2")) {
	   		 			System.out.println("Error ! Please enter again !");
	   		 			repeat1 = scan.nextLine();
	   		 		}
	    		}while(!repeat1.matches("2"));
	    		break;	
	 		 		
	  case "7":
		  System.out.println("Thank you for using this Hospital Management System");
		  System.exit(0);
		  
	  default:
	  		System.err.println("Sorry ! This option is not recognized ! Please enter again !");
	  		break;
    	}
    }while(choice1 != "7");
	}
}
	
    

	
