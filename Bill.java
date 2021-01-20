/* Names: Griffin Lige, Shishir Paudel, Fatou Sonko, Yazan Bader
 * Overview: calculates the cost and tax at buffet
 * Input: quantities of adults and children
 * Output: prices and tax totals
 * Variables: mealQty, mealCost, mealPrice
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Bill {
	
	private String category;
	private int mealQty;
	private double mealCost;
	private double mealPrice;
	final static double TAX_RATE = .06;
	
	 public Bill(){
	    	category = null;
	    	mealQty = 0;
	    	mealCost = 0;
	    	mealPrice = 0;

		}
	
	 
	 
	 public double calcAdultCost(String category, int mealQty, double mealCost){

			this.category = "Adults  ";
			this.mealQty = mealQty;
			this.mealCost = mealCost;
			
			if ( mealQty < 9)
				mealPrice = mealQty * mealCost;
			if (mealQty >= 9)
				mealPrice = (mealQty * mealCost) - 5;
			
			return mealPrice;
		}
	 
	 
	 public double calcChildCost(String category, int mealQty, double mealCost){

			this.category = "Children";
			this.mealQty = mealQty;
			this.mealCost = mealCost;
			
			if ( mealQty < 3)
				mealPrice = mealQty * mealCost;
			if (mealQty >= 3)
				mealPrice = 45.00;
			
			return mealPrice;
		}
	 
	 public static double calcTax(double total){

			return total * TAX_RATE;
	 }
	 
	 public void display() {
		 NumberFormat fmt = NumberFormat.getCurrencyInstance();
		 System.out.println(category + "\t" + mealQty + "\t" + fmt.format(mealCost) + "\t" + fmt.format(mealPrice));
		
		
			

			
		}
	 



		


}
