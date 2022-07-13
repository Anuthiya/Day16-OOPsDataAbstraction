package trainingday16OOPsDATAABSTRACTION;

public class TamilNadu extends Centralgov {
	public String stateCode(String a) {
		return a;
	}
	public String noPlateColor(String b) {
		if(b.equalsIgnoreCase("Black with White")) {
			return "Private Vehicle";
		}
		else if (b.equalsIgnoreCase("yellow with black")) {
			return "Public Vehicle";
		}
		else if(b.equalsIgnoreCase("Green with white")) {
			return "Electric Vehicle";
		}
		else {
			return "invalid";
		}
		
	}
	

}
