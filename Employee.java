package trainingday16OOPsDATAABSTRACTION;

public interface Employee {
	public int calculateSalary(int salaryPerHour, int workingHours);
}


class Contractor implements Employee {
	public int calculateSalary(int salaryPerHour, int workingHours) {
	return salaryPerHour*workingHours;
}
}

class GovernmentEmployee implements Employee {
	public int calculateSalary(int salaryPerHour, int workingHours) {
		return salaryPerHour*workingHours;
	}
}


class Usex{
	public static void main(String[] args) {
		Contractor c=new Contractor();
		GovernmentEmployee e=new GovernmentEmployee();
		System.out.println(c.calculateSalary(50,12));
		System.out.println(e.calculateSalary(120,8));
	}


}
