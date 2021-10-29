/**
 * 
 */
package Week1.stuff;

/**This is the week 1 demo
 * @author HP z420
 * 
 */
public class JavaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double jeepSoftTopPrice = 1995.00;
		double debitAcctBalance = 2100.00;
		int tireSizeInInches = 35;
		int weightOfJeep = 3970;
		char directionImGettingLostIn = 'E';
		String lastKnownLocation = "Moab, UT";
		float engineSizeinLiters = 2.0F;
		
		debitAcctBalance = buySoftTop(jeepSoftTopPrice, debitAcctBalance);

		String balance = String.format("%.2f", debitAcctBalance);
		String price = String.format("%.2f", jeepSoftTopPrice);
		
		System.out.println("After buying a $" + price + " soft top, I have $" + balance + " left.");
		
		double weightOnTire = weightOfJeep/4.0;
		System.out.println("Weight on each tire: " + weightOnTire + " pounds");
		
	}

	private static double buySoftTop(double price, double balance) {
		
		return balance - price;
	}

}
