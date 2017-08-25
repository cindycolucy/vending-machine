import static org.junit.Assert.*;

import org.junit.Test;

public class CoinsTest {
	public Coins createUnderTest() {
		return new Coins();
	}

	@Test
	public void ifCoinEnteredIsANickleReturnValid() {
		assertTrue(createUnderTest().isNickle());

	}
	@Test 
	public void ifCoinEnteredIsADimeReturnValid() {
		assertTrue(createUnderTest().isDime());
	}
	@Test 
	public void ifCoinEnteredIsAQuarterReturnValid() {
		assertTrue(createUnderTest().isQuarter());
	}
	@Test 
	public void ifCoinEnteredIsAPennyReturnNotValid() {
		assertFalse(createUnderTest().isPenny());
	}
}
