package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciSeriesTest {

	@Test
	public void nEqualsZero() {
		//arrange
		FibonacciSeries f=new FibonacciSeries();
		int expected = 0;
		//act
		int actual= f.series(0);
		// Assert
		assertEquals(expected, actual);
	}
	@Test
	public void nEqualsOne() {
		//arrange
		FibonacciSeries f=new FibonacciSeries();
		int expected = 1;
		//act
		int actual= f.series(1);
		// Assert
		assertEquals(expected, actual);
	}
	@Test
	public void nEqualsFive() {
		//arrange
		FibonacciSeries f=new FibonacciSeries();
		int expected = 5;
		//act
		int actual= f.series(5);
		// Assert
		assertEquals(expected, actual);
	}
	@Test
	public void nEqualsEight() {
		//arrange
		FibonacciSeries f=new FibonacciSeries();
		int expected = 21;
		//act
		int actual= f.series(8);
		// Assert
		assertEquals(expected, actual);
	}

}
