
public class Coins {

	private double nickle = 0.05;
	private double dime = 0.10;
	private double quarter = 0.25;
	private Double totalMoney = 0.0;

	public boolean isNickle() {
		totalMoney += nickle;
		return true;
	}

	public boolean isDime() {
		totalMoney += dime;
		return true;
	}

	public boolean isQuarter() {
		totalMoney += quarter;
		return true;
	}

	public boolean isPenny() {
		return false;
	}

	public String getDisplay(double d) {
		if (totalMoney == 0.0) {
			return "INSERT COIN";
		}
		return totalMoney.toString();
	}

}
