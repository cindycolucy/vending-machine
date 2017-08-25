
public class Coins {

	private String nickel;
	private String dime;
	private String quarter;
	private String penny;


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

	public String getDisplay() {
		return "INSERT COIN";
	}

}
