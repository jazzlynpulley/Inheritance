
public class IceCream extends DessertItem {
	
	private String iceCreamName;
	private int price ;

	
	public IceCream(String inIceCreamName,int inIceCreamPrice)
	{
		super();
		iceCreamName = inIceCreamName ;
	    price = inIceCreamPrice ;
	}
	
	public int getCost()
	{
		return price ;
	}
	
	

}