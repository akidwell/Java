import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		
		//welcome
		System.out.println("Welcome to Interest Calc App!");
		
		//scanner
		Scanner sc = new Scanner(System.in);
		
		//loop
		String choice = "y";
		while(choice.equalsIgnoreCase("Y")) {
			
		//prompt for input-- loanAmt = sc.nextdouble(); original
			System.out.println("Enter loan amount: ");
			String loanAmtStr = sc.next();
			BigDecimal loanAmt = new BigDecimal(loanAmtStr);
			loanAmt = loanAmt.setScale(2,RoundingMode.HALF_UP);
			System.out.println("Enter interest rate:");
			String intRateStr =sc.next();
			BigDecimal intRate = new BigDecimal(intRateStr).setScale(3, RoundingMode.HALF_UP);
			
		//biz logic
			BigDecimal interestAmt = loanAmt.multiply(intRate);
			
			
		//display results
			NumberFormat cf = NumberFormat.getCurrencyInstance();
			cf.setRoundingMode(RoundingMode.HALF_UP);
			NumberFormat pf = NumberFormat.getPercentInstance();
			pf.setMaximumFractionDigits(3);
			pf.setMinimumFractionDigits(3);
			
			System.out.println("Loan Amount:" +cf.format(loanAmt));
			System.out.println("Enter Interest rate: "+pf.format(intRate));
			System.out.println("Interest Amount:  " +cf.format(loanAmt.multiply(intRate)));
			
		System.out.println("Continue (y/n)?");	
		choice = sc.next();
			
		}
		
		//bye
		
		System.out.println("Bye!");

	}

}
