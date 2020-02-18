package exchangeStructures;

import java.util.ArrayList;
import java.util.List;

import orderTypes.SweepingOrder;

/**
 * Offerbook class contains any arraryList of resting orders obtained from sweeping orders with SELL side.
 * @author Simeon
 *
 */
public class OfferBook {
	
	private List<SweepingOrder> priceLevels = new ArrayList<SweepingOrder>();

	public List<SweepingOrder> getPriceLevels() {
		
		//Collections.sort(priceLevels,PriceLevel.priceLevelsComparator);
		return priceLevels;
	}

	
}
