package trainingday16OOPsDATAABSTRACTION;

public class Lms {
	public static void main(String args[]) {
		String[] word= {"abcs","GJEGJE","khsfsg","ghghf"};
		int count=0;
		for(String names : word) {
			if(Character.isUpperCase(names.codePointAt(0))) {
				count=count+1;
				System.out.println(names);
				System.out.println(count);
			}
		
		
		}
	}

}
