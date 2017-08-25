
public class Coins {

	private String nickel;
	private String dime;
	private String quarter;
	private String penny;
	private Double totalMoney;
	private String input;

	public boolean isNickel() {
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

	public String getDisplay(Double totalMoney) {
		if(input == "nickel") {
			totalMoney += 0.05;
		}
		return "INSERT COIN";
	}
	

}
