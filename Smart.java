package trainingday16OOPsDATAABSTRACTION;

public interface Smart {
	public void camera1(String a);


class Viv1 implements SmartPhone {
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
class Sme {
	public static void main(String args[]) {
		Vivo v=new Vivo();
		v.camera("Sigletap");
	}

}
}

