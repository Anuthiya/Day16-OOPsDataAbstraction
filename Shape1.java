package trainingday16OOPsDATAABSTRACTION;

public interface Shape1 {
	public float area(int a);
}

 class Circle1 implements Shape1 {
	@Override
	public float area(int a) {
		// TODO Auto-generated method stub
		return 22/7*a*a;
	}

}
 class Square1 implements Shape1 {
	public float area(int a) {
		return a*a;
		
	}
}

