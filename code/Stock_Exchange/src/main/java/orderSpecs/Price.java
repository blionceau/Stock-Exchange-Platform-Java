package orderSpecs;

import java.math.BigDecimal;

import orderTypes.SweepingOrder;

/**
 * 
 * @author Simeon
 *
 */
public class Price {

	

	private double priceofPriceLevel;
	
	public Price(double priceofPriceLevel) {
		this.priceofPriceLevel = priceofPriceLevel;
	}
	
	public double getPriceValue() {
		return priceofPriceLevel;
	}

	public void setPriceValue(double priceofPriceLevel) {
		this.priceofPriceLevel = priceofPriceLevel;
	}

}
