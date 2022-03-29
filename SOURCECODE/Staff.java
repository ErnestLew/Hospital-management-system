import java.util.Scanner;

public class Staff {
	String id, name, designation, sex;
	int salary;
	static int scount;
	String a, b, c;
	
	public void newStaff() {
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("Please enter the ID of staff (Ex: 123) : ");
		a = input.nextLine();
		}while(!a.matches("\\d{3}"));
		id = a;
		
		do {
		System.out.println("Please enter the name of staff: ");
		name = input.nextLine();
		}while(!name.matches("\\D{1,20}"));
		
		do {
		System.out.println("Please enter the designation of staff: ");
		designation = input.nextLine();
		}while(!designation.matches("\\D{1,20}"));
		
		do {
		System.out.println("Please enter the sex of staff (Male / Female) : ");
		b = input.nextLine();
		b = b.toUpperCase(); 
		}while(!b.matches("MALE|FEMALE"));
		sex = b;
		
		do {
		System.out.println("Please enter the salary of staff (Ex: 1000): ");
		c = input.nextLine();
		}while(!c.matches("\\d{4,10}"));
		salary = Integer.valueOf(c);
	}
	
	public Staff() {
		scount++;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void showStaffInfo() {
		System.out.printf("%-7s %-20s %-10s %12s %10s\n",id , name, designation, sex, salary );
	}
}