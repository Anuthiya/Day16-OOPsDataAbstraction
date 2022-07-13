package trainingday16OOPsDATAABSTRACTION;

public class Vivo implements SmartPhone {
	public void camera(String a) {
	switch(a) {
	case "doubletap":
		System.out.println("camera on");
		break;
	case "longpress":
		System.out.println("Screen on");
		break;
	case "Sigletap":
		System.out.println("enterPassword");
		break;
	default:
		System.out.println("invalid");
	}

	
}
}