

import java.util.ArrayList;
import java.util.Arrays;

public class Checkout {

	ArrayList<DessertItem> checkout = new ArrayList<>();
	private DessertItem di;
	private double tCost;
	private DessertShoppe myDessert ;


	public Checkout()
	{

	}

	public void enterItem(DessertItem di)
	{
		checkout.add(di);
		
	}
	public int numberOfItems()
	{
		return checkout.size();

	}

	public double totalCost()
	{
		
		int tCost = 0 ;
		
		for (int i=0; i<checkout.size(); i++){
			tCost += checkout.get(i).getCost() ;
			
		}
	return Double.parseDouble(DessertShoppe.cents2dollarsAndCents(tCost)) ;
	}

	public double totalTax()
	{
		double tot ;
		tot = (myDessert.TAX_RATE ) * tCost ;
		return tot ;
		
	}
	

	public void clear()
	{
		checkout.clear();
	}
	


}

