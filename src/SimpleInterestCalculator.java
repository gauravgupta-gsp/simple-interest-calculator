
public class SimpleInterestCalculator {

	public double calculate(int principalAmount, int tenure) {
		double rateOfInterest = 5.3;
		double tenureInyears = tenure / 365.0;
		
		if(tenure < 365) {
			rateOfInterest = 5.2;
		}
		return principalAmount * rateOfInterest *tenureInyears / 100;
		
	}
	
	public double calculate(int principalAmount, int tenure,int age) {
		double rateOfInterest = 5.3;
		double tenureInyears = tenure / 365.0;
		
		if(tenure < 365) {
			rateOfInterest = 5.2;
		}
		 
		return principalAmount * rateOfInterest *tenureInyears / 100;
		
	}

}
