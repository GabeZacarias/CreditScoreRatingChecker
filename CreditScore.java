/**
 * 
 */
import java.util.Scanner;
/**
 * @author GabrielZacarias
 *
 */
public class CreditScore 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		double PoorScore = 300;
		double FairScore = 580;
		double GoodScore = 670;
		double VeryGoodScore = 740;
		double ExcellentScore = 800;
		double highestExcellentScore = 850;
		double creditScore;
		
		System.out.print("\nEnter the Credit Score: ");
		creditScore = input.nextDouble();
		
		if (creditScore >= PoorScore && creditScore < FairScore)
			System.out.println("\nThe credit score is Poor");
		
		else if (creditScore >= FairScore && creditScore < GoodScore)
			System.out.println("\nThe credit score is Fair");
		
		else if (creditScore >= GoodScore && creditScore < VeryGoodScore)
			System.out.println("\nThe credit score is Good");
		
		else if (creditScore >= VeryGoodScore && creditScore < ExcellentScore)
			System.out.println("\nThe credit score is Very Good");
		
		else if (creditScore >= ExcellentScore && creditScore <= highestExcellentScore)
			System.out.println("\nThe credit score is Excellent");
			
		else
			System.out.println("\nThe credit score is Invalid");
				
	}
}
