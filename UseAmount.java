package trainingday16OOPsDATAABSTRACTION;

public class UseAmount {
	public static void main(String args[]) {
		Credit c=new Credit();
		Debit d=new Debit();
		c.balance=50000;
		d.balance=70000;
		System.out.println(c.AccountBalance(500));
		System.out.println(d.AccountBalance(700000));
	}

}
