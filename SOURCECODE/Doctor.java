import java.util.Scanner;

public class Doctor {

	String id, name, spec, worktime, quali;
	int room;
	static int dcount=0;
	String a, b, c;
	
	public void newDoctor() {
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Please enter the ID of doctor (Ex: 123) : ");
		a = input.nextLine();
		}while(!a.matches("\\d{3}"));
		id = a;
		
		do {
		System.out.println("Please enter the name of doctor: ");
		name = input.nextLine();
		}while(!name.matches("\\D{1,20}"));
		
		do {
		System.out.println("Please enter the specialization of doctor: ");
		spec = input.nextLine();
		}while(!spec.matches("\\D{1,20}"));
		
		do {
		System.out.println("Please enter the worktime of doctor (Ex: 08:00am-05:00pm): ");
		worktime = input.nextLine();
		}while(!worktime.matches("^\\d\\d:\\d\\d(am|pm)-\\d\\d:\\d\\d(am|pm)"));
		
		do {
		System.out.println("Please enter the qualification of doctor: ");
		quali = input.nextLine();
		}while(!quali.matches("\\D{1,20}"));
	}
	
	
	public Doctor() {
		dcount++;
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
	
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	public String getSpec() {
		return spec;
	}
	
	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}
	
	public String getWorktime() {
		return worktime;
	}
	
	public void setQuali(String quali) {
		this.quali = quali;
	}
	
	public String getQuali() {
		return quali;
	}
	
	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
	public void showDoctorInfo() {
		System.out.printf("%-7s Dr.%-15s %-20s %-15s %-12s %5s\n",id , name, spec, worktime, quali, room );
	}
}
