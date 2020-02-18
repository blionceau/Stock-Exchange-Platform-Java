package exchangeStructures;

import java.util.*;


import orderTypes.SweepingOrder;


/**
 * Bidbook class contains any arraryList of resting orders obtained from sweeping orders with BUY side.
 * @author Simeon
 *
 */
public class BidBook {
	
	private static List<SweepingOrder> priceLevels = new ArrayList<SweepingOrder>();// static
	
	
	/**
	 * 
	 * @return priceLevels
	 */
	public List<SweepingOrder> getPriceLevels(){
		
		return priceLevels;
		
	}
	
}