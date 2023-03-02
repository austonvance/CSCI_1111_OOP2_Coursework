import java.io.*;

public class Exercise1707 {
	public static void main(String[] args) 
			throws FileNotFoundException, ClassNotFoundException, IOException{
				
				Loan loan1 = new Loan();
					Loan loan2 = new Loan(1.8, 10, 10000);
				
				
		try ( // Create an input stream for file Exercise17.07.dat
			ObjectInputStream input = new ObjectInputStream(new 
				BufferedInputStream(new FileInputStream("Exercise17_07.dat")))
		) { // Read Loan objects from file and display the total loan amount
			while (true) {
				Loan loan = (Loan)input.readObject();
				System.out.println(loan);
				System.out.printf("Total loan amount: $%.2f\n", 
					loan.getTotalPayment());
				System.out.println();
			}
		}
		catch (EOFException ex) {
			// Use EOFExecption to end the loop
		}
	}
}

 class Loan implements java.io.Serializable {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	/** Construct a loan with specified annual interest rate, 
	    number of years, and loan amount
	 */
	public Loan(double annualInterestRate, int numberOfYears,
		double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/** Set an new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	
	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}
	
	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	} 
	
	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	
	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	
	@Override /** Override the toString method in the Object class */
	public String toString() {
		return "Date: " + loanDate + "\nAnnual interest Rate: " + 
			annualInterestRate + "\nYears: " + numberOfYears +
			"\nLoan amount: " + loanAmount;
	}
}