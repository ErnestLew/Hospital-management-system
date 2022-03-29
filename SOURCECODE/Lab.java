import java.util.Scanner;

public class Lab {
	String lab;
	int cost;
	static int lcount;
	String a;
	
	public void newLab() {
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Lab: ");
		lab = input.nextLine();
		}while(lab.matches("\\D{1,20}"));
		
		do {
		System.out.println("Cost (Ex: 100) : ");
		a = input.nextLine();
		}while(!a.matches("\\d{3,10}"));
		cost = Integer.valueOf(a);
	}
	
	public Lab() {
		lcount++;
	}
	
	public void setLab(String lab) {
		this.lab = lab;
	}
	
	public String getLab() {
		return lab;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void showLabInfo() {
		System.out.printf("%-20s %-10s\n",lab , cost);
	}
}

