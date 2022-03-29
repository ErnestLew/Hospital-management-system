import java.util.Scanner;

public class Patient {
	String id, name, disease, sex, admitStatus;
	int age;
	static int pcount;
	
	public void newPatient() {
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Please enter the ID of patient: ");
		id = input.nextLine();
		}while(!id.matches("\\d{3}"));
		
		do {
		System.out.println("Please enter the name of patient: ");
		name = input.nextLine();
		}while(!name.matches("\\D{1,20}"));
		
		do {
		System.out.println("Please enter the disease of patient: ");
		disease = input.nextLine();
		}while(!disease.matches("\\D{1,20}"));
		
		do {
		System.out.println("Please enter the sex of patient: ");
		sex = input.nextLine();
		sex = sex.toUpperCase(); 
		}while(!sex.matches("MALE|FEMALE"));
		
		do {
		System.out.println("Please enter the admit status of patient: ");
		admitStatus = input.nextLine();
		admitStatus = admitStatus.toUpperCase();
		}while(!admitStatus.matches("ADMIT|DISCHARGE"));

	}
	
	public Patient() {
		pcount++;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	public String getDisease() {
		return disease;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setAdmitStatus(String admitStatus) {
		this.admitStatus = admitStatus;
	}
	
	public String getAdmitStatus() {
		return admitStatus;
	}
	
	public void showPatientInfo() {
		System.out.printf("%-7s %-15s %-20s %-10s %-10s\n",id , name, disease, sex, admitStatus );
	}
}
