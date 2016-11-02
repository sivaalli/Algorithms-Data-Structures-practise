package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionEvaluationTest {

	@Test
	public void MultiplicationFollowedByAddition()
	{
		// Arrange
				ExpressionEvaluation ee = new ExpressionEvaluation();
				String expression = "1+2*3";
				int expected = 7;
				
				// Act
				int actual = ee.evaluate(expression);
				
				// Assert
				assertEquals(expected, actual);
	}

	@Test
	public void OnlyAddition() {
		// Arrange
		ExpressionEvaluation ee = new ExpressionEvaluation();
		String expression = "1+2+3";
		int expected = 6;
		
		// Act
		int actual = ee.evaluate(expression);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void ComplexExpression()
	{
		// Arrange
				ExpressionEvaluation ee = new ExpressionEvaluation();
				String expression = "1+2*3-4/2*5+7";
				int expected = -10;
				
				// Act
				int actual = ee.evaluate(expression);
				
				// Assert
				assertEquals(expected, actual);
	}

	@Test
	public void InvalidExpressionShouldThrow()
	{
		
		// Arrange
		ExpressionEvaluation ee = new ExpressionEvaluation();
		String expression = "1++2*3";
		Boolean exceptionCaught = false;
		
		// Act
		try {
			ee.evaluate(expression);
		}
		catch (Exception ex)
		{
			exceptionCaught = true;
		}

		// Assert
		assertTrue(exceptionCaught);
	}
	@Test
	public void withSpacesString()
	{
		
		// Arrange
		ExpressionEvaluation ee = new ExpressionEvaluation();
		String expression = "1  + 2 *3";
		
		
		// Act
		
	int expected = 7;
		
		// Act
		int actual = ee.evaluate(expression);
		
		// Assert
		assertEquals(expected, actual);
	}
}
