/* Names; Griffin Lige, Fatou Sonko, Shishir Paudel, Yazan Bader
 * Overview: sets the name and location of the buffet
 * Input: name, zip code 
 * Output: full name of buffet, location of buffet
 * Varibles: name, zip
 */

public class Buffet {

	private String name, location ;


	public Buffet(String name, String zip){

	setName(name);
	setLocation(zip);

	}

	public void setName(String name1){
		name = name1.substring(0,1).toUpperCase() + name1.substring(1).toLowerCase() + " Buffet";
	}


	public void setLocation (String zip)
	{
	if (zip.equals("21204")) 
	{
		location = "Towson \n" + "\t ~~~~~~";
	}
	else if (zip.equals("21237")) 
	{
		location = "Rosedale \n" + "\t ~~~~~~~~";
	}
	else
	{
		location = "Baltimore \n" + "\t ~~~~~~~~~";
	}
	}


	public String toString(){
		return "\t" + name + "\n\t " + location + "\n All you can eat buffet at a great price!";
	}
	

	}



