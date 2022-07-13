package trainingday16OOPsDATAABSTRACTION;

public interface Amount {
	public String AccountBalance(int amount);
}

abstract class mainBalance implements Amount {
	int balance;
}

class Credit extends mainBalance {
	public String AccountBalance(int amount) {
		if(amount>25000) {
			return "Can not credit above 25000";
		}
		else {
			return "Balance="+(balance+amount);
		}
	}
}

class Debit extends mainBalance {
	public String AccountBalance(int amount) {
		if(amount>balance) {
			return "can not debit amount ot the range";
		}
		else {
			return "Balance="+(balance-amount);
		}
	}
}
