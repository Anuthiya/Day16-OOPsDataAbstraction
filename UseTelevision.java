package trainingday16OOPsDATAABSTRACTION;

public class UseTelevision {
	public static void main(String args[]) {
		String brand=args[0];
		int price=Integer.parseInt(args[1]);
		int deliveryCharge=Integer.parseInt(args[2]);
		String access = args[3];
		String cool=args[4];
		Television t=new Television();
		System.out.println("Brand="+brand+", DeliveryCharge="+deliveryCharge+", Price="+price+", netPrice="+t.getNetPrice(price,deliveryCharge));
		System.out.println("WIFI="+t.wifiAccess(access)+", COOL="+t.autoCooling(cool));
	}

}

interface SmartTelevision {
	public String wifiAccess(String access);
	public String autoCooling(String cool);
	
}

class Television implements SmartTelevision {
	String brand;
	int price;
	int deliveryCharge;
	int netPrice;
	public String getNetPrice(int price, int deliveryCharge) {
		int netPrice=price+deliveryCharge;
	
		if(netPrice>50000) {
			return "Heavy";
		}
		else {
			return "Below 50000";
		}
	}
	public String wifiAccess(String access) {
		return access;
	}
	public String autoCooling(String cool) {
		return cool;
	}
}