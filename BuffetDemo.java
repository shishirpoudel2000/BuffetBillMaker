/*Names: Griffin Lige, Shishir Paudel, Fatou Sonko, Yazan Bader
 * Overview: Prints out the buffet bill
 * Input: name, zip code, amount of adults and children
 * Output: Bill total (name, location, prices)
 * Variables: nameOfBuffet, zipCode, children, adults, subtotal
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class BuffetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberFormat totalformat = NumberFormat.getCurrencyInstance();
		
		String nameOfBuffet, zipCode;
        int  children, adults;


        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the name of the Buffet: ");
        
        nameOfBuffet = scan.nextLine();


        System.out.println("Enter the zip code: ");
        zipCode = scan.nextLine();
    
        Buffet buffet = new Buffet(nameOfBuffet, zipCode);
       
        
        System.out.println("Enter the number of Adults (-1 to stop).....");
        adults = scan.nextInt();
        
        while (adults != -1) {

            System.out.println("Enter the number of children......");
            children = scan.nextInt();
            
        Bill adultBill = new Bill();
        Bill childBill = new Bill();
        
        double subtotal = adultBill.calcAdultCost("Adults", adults, 31.5) + childBill.calcChildCost("Children", children, 15);
        
        System.out.print(buffet.toString());
        
        System.out.println("\n\n" + "\t\t\tPrice\tTotal");
        
        //Print out the adult and child bill details here
        adultBill.display();
        childBill.display();
        
        System.out.println("\n" + "Sub-Total\t\t\t "+totalformat.format(subtotal));
        
        Bill tax = null;
		System.out.println("Tax(6%)\t\t\t\t "+totalformat.format(tax.calcTax(subtotal)));
		
        System.out.println("\n\tTotal Bill\t\t "+totalformat.format(subtotal+tax.calcTax(subtotal)));
        System.out.println("\n\n\n");
        
        System.out.println("Enter the number of Adults (-1 to stop).....");
        adults = scan.nextInt();
	}
	}
}
