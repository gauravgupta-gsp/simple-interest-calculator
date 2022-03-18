import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class SimpleInterestCalculatorTest {

	@Test
	public void calculate_shouldReturnSimpleInterestForGivenAmountAndTenure() {
		// AAA 
		// Arrange
		int principalAmount = 5000;
		
		int tenure = 365;
		double expectedOutput = 265;
		
		SimpleInterestCalculator object = new SimpleInterestCalculator();
		
		// Act
		double actualInterest = object.calculate(principalAmount, tenure);
		// Assert
		
		Assert.assertEquals(expectedOutput, actualInterest, 0.1);
	}

	@Test
	public void calculate_rateOfInterestShouldlessIncaseTenureIsLessThan365Days() {
		// Arrange
				int principalAmount = 6100;
				int tenure = 350;
				double expectedOutput = 304.16;
				
				SimpleInterestCalculator object = new SimpleInterestCalculator();
				
				// Act
				double actualInterest = object.calculate(principalAmount, tenure);
				// Assert
				
				Assert.assertEquals(expectedOutput, actualInterest, 0.1);
	}
	
	@Test
	public void calculate_forSeniorCitizenInterestRateShouldBeMore() {
		// Arrange
				int principalAmount = 6100;
				int tenure = 350;
				double expectedOutput = 304.16;
				
				SimpleInterestCalculator object = new SimpleInterestCalculator();
				
				// Act
				double actualInterest = object.calculate(principalAmount, tenure);
				// Assert
				
				Assert.assertEquals(expectedOutput, actualInterest, 0.1);
	}
}
