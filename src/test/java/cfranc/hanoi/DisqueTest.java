package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	Disque petit = new Disque(1);
	Disque moyen = new Disque(2);
	Disque grand = new Disque(3);

	@Test
	public void negativeCompareTo(){
		int res = -1;
		assertEquals(res, petit.compareTo(moyen));
		assertEquals(res, petit.compareTo(grand));
		assertEquals(res, moyen.compareTo(grand));
	}

	@Test
	public void positiveCompareTo(){
		int res = 1;
		assertEquals(res, grand.compareTo(petit));
		assertEquals(res, grand.compareTo(moyen));
		assertEquals(res, moyen.compareTo(petit));
	}

	@Test
	public void equalCompareTo(){
		int res = 0;
		assertEquals(res, petit.compareTo(petit));
		assertEquals(res, moyen.compareTo(moyen));
		assertEquals(res, grand.compareTo(grand));
	}

}
