
public class SimpleInterestCalculator {

	private double calculateSimpleInterest(int principalAmount , double rateOfInterest, double tenureInYears) {
		return principalAmount * rateOfInterest *tenureInYears / 100;
	}
	
	private double convertDaysToYears(int tenureInDays) {
		return tenureInDays / 365.0;
	} 
	public double calculate(int principalAmount, int tenureInDays) {
		double rateOfInterest = 5.3;
		double tenureInyears = convertDaysToYears(tenureInDays);
		
		if(tenureInDays < 365) {
			rateOfInterest = 5.2;
		}
		return calculateSimpleInterest(principalAmount, rateOfInterest, tenureInyears);
		
	}
	
	public double calculate(int principalAmount, int tenureInDays,int age) {
		double rateOfInterest = 5.3;
		double tenureInyears = convertDaysToYears(tenureInDays);
		
		if(tenureInDays < 365) {
			rateOfInterest = 5.2;
		}
		 
		return calculateSimpleInterest(principalAmount, rateOfInterest, tenureInyears);
		
	}
	

}
