
public class Sundae extends IceCream {
	
	private String iceCreamName;
	private int iceCreamPrice;
	private String topping;
	private int toppingPrice;
	private int cost;
	
	public Sundae(String icIceCreamName, int icIceCreamPrice, String icTopping, int icToppingPrice)
	{
		super(icIceCreamName,icIceCreamPrice) ;
		icIceCreamName = iceCreamName ;
		icIceCreamPrice = iceCreamPrice ;
		icTopping = topping ;
		icToppingPrice = toppingPrice ;
	}
	
	public int getCost()
	{
		cost = (iceCreamPrice + toppingPrice);
		int a = (int) Math.round(cost);
		return a;
	}

}
