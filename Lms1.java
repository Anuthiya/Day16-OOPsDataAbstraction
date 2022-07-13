package trainingday16OOPsDATAABSTRACTION;

public class Lms1 {
	public static void main(String args[]) {
		String a="fsjg:GAGAhg:gksg:sggg";
		String[] b=a.split(":");
		for(int i=0;i<b.length;i++) {
		if(b[i].equals(b[i].toLowerCase())) {
			System.out.println(b[i]);
		}
		else {
			System.out.println("This not in low case");
		}
	}
}
}
		

