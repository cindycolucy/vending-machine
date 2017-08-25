
public class Coins {
	
	private double nickle = 0.05;
	private double dime = 0.10;
	private double quarter = 0.25;
	private Double totalMoney = 0.0;

	public boolean isNickle() {
		return true;
	}

	public boolean isDime() {
		return true;
	}

	public boolean isQuarter() {
		return true;
	}

	public boolean isPenny() {
		return false;
	}

	public String getDisplay() {
		return "INSERT COIN";
	}

}
