
public class Candy extends DessertItem {
	
	private String name ;
	private double quantity ;
	private int pricePerLbs ;
	private double cost ;
	
	
	public Candy(String candyName, double candyWeight, int candyPrice)
	{
		name = candyName ;
		quantity = candyWeight ;
		pricePerLbs = candyPrice ;
	}
	
	public int getCost()
	{
		cost = (quantity * pricePerLbs) ;
		int a = (int) Math.round(cost) ;
		return a ;
	}
	

}
     