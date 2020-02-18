package exchangeStructures;

import java.sql.Timestamp;
import java.util.Comparator;

import orderSpecs.Price;
import orderSpecs.Quantity;
/**
 * PriceLevel class contains pricelLevelComparator to compare price values
 * @author Simeon
 *
 */
public class PriceLevel {
	private Price price;
	private Quantity quantity;
	private Timestamp timestamp;
	
	public PriceLevel(Price price, Quantity quantity) {
		this.price = price;
		this.quantity = quantity;
		this.timestamp = new Timestamp(System.currentTimeMillis());
	}

	public Price getPrice() {
		return price;
	}

	public Quantity getQuantity() {
		return quantity;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}
	
	public static Comparator<PriceLevel> priceLevelsComparator = new Comparator<PriceLevel>() {
		
		public int compare(PriceLevel pl1, PriceLevel pl2) {
			
			double price1 = pl1.getPrice().getPriceValue();
			double price2 = pl2.getPrice().getPriceValue();
			
			if(price1 == price2) {
				
				return pl1.getTimestamp().compareTo(pl2.getTimestamp());
			}
			
			else {
				return (int) (price1-price2);
			}
		}
		
	};
	
}
