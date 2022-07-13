package trainingday16OOPsDATAABSTRACTION;

public class UseEmployee {
	public static void main(String[] args) {
	
		Contractor c=new Contractor();
		GovernmentEmployee e=new GovernmentEmployee();
		System.out.println(c.calculateSalary(50,10));
		System.out.println(e.calculateSalary(120,8));
	}


}
