package trainingday16OOPsDATAABSTRACTION;

public class Lms3Palendrom {
	public static void main(String args[]) {
		String word="radar";
		String reverse=" ";
		for(int i=word.length()-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
		}
		if(word.equals(reverse)) {
			System.out.println(word+"is palandrom");
		}
		
	}

}
