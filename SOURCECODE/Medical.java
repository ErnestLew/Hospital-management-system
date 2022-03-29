import java.util.Scanner;

public class Medical {
	String name, manucfacturer, expiryDate;
	static int mcount;
	static int ccount;
	int cost;
	String a, b;
	
	public void newMedical() {
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Please enter the name of medical: ");
		name = input.nextLine();
		}while(!name.matches("\\D{1,20}"));
		
		do {
		System.out.println("Please enter the manucfacturer of medical: ");
		manucfacturer = input.nextLine();
		manucfacturer = manucfacturer.toUpperCase();
		}while(!manucfacturer.matches("\\D{1,20}"));
		
		do {
		System.out.println("Please enter the expiry date of medical (Ex: dd/mm/yyyy): ");
		expiryDate = input.nextLine();
		}while(!expiryDate.matches("^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$"));
		
		do {
		System.out.println("Please enter the cost of medical: ");
		a = input.nextLine();
		}while(!a.matches("\\d{1,10}"));
		cost = Integer.valueOf(a);
		
		do {
		System.out.println("Please enter the value of medical: ");
		b = input.nextLine();
		}while(!b.matches("\\d{1,10}"));
		ccount = Integer.valueOf(b);

	}
	
	public Medical() {
		mcount++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManucfacturer() {
		return manucfacturer;
	}

	public void setManucfacturer(String manucfacturer) {
		this.manucfacturer = manucfacturer;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getccount() {
		return ccount;
	}

	public void setccount(int ccount) {
		Medical.ccount = ccount;
	}

	public void showMedicalInfo() {
		System.out.printf("%-15s %-15s %-15s %-10s %-11s\n",name, manucfacturer, expiryDate, cost, ccount  );
	}
}