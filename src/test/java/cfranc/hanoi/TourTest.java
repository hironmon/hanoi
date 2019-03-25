package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Queue;

public class TourTest {


	Disque petit = new Disque(1);
	Disque moyen = new Disque(2);
	Disque grand = new Disque(3);

	@Test
	public void empilerVide() {
		Tour tour = new Tour();
		assertEquals(true, tour.empiler(petit));
		tour.depiler();
		assertEquals(true, tour.empiler(moyen));
		tour.depiler();
		assertEquals(true, tour.empiler(grand));
	}

	@Test
	public void empilerPlace(){
		Tour tour = new Tour();
		tour.empiler(grand);
		assertEquals(true, tour.empiler(petit));
		tour = new Tour();
		tour.empiler(grand);
		assertEquals(true, tour.empiler(moyen));
		assertEquals(true, tour.empiler(petit));
		tour = new Tour();
		tour.empiler(moyen);
		assertEquals(true, tour.empiler(petit));
	}

	@Test
	public void empilerFail(){
		Tour tour = new Tour();
		tour.empiler(petit);
		assertEquals(false, tour.empiler(moyen));
		tour.depiler();
		tour.empiler(grand);
		tour.empiler(moyen);
		tour.empiler(petit);
		assertEquals(false, tour.empiler(petit));
		assertEquals(false, tour.empiler(moyen));
		assertEquals(false, tour.empiler(grand));
	}

}
