import java.util.Scanner;

public class Facility {
	String facility;
	static int fcount;
	
	public void newFacility() {
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Facility: ");
		facility = input.nextLine();
		}while(!facility.matches("\\D{1,20}"));
	}
	
	public Facility() {
		fcount++;
	}
	
	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}
	
	public void showFacilityInfo() {
		System.out.println(facility);
	}
}