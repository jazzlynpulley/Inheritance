
public class Cookie extends DessertItem{
	
	private String name ;
	private int quantity ;
	private int dozenAmount ;
	private double cost ;
	
	public Cookie(String cookieName, int cookiePrice, int cookieAmount)
	{
		name = cookieName ;
		quantity = cookiePrice ;
		dozenAmount = cookieAmount ;
	}
	
	public int getCost()
	{
		cost = (dozenAmount *((double)quantity/12));
		int a = (int) Math.round(cost);
		return a;
	}

}
