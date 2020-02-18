package exchangeStructures;

import java.util.*;

import orderSpecs.ClientOrderId;
import orderSpecs.MarketId;
import orderSpecs.Side;
import orderTypes.RestingOrder;
import orderTypes.SweepingOrder;
import fills.Fill;
/**
 * Exchange contains market
 * @author Simeon
 *
 */

public class Exchange {

	private HashMap<MarketId, Market> markets = new HashMap<MarketId, Market>();
	private OfferBook offerBook = new OfferBook();
	private BidBook bidBook = new BidBook();
	private Fill fill = new Fill();
	// private RestingOrder restingOrder = new RestingOrder();

	/**
	 * This method adds market orders to the exchange
	 * 
	 * @param market
	 */
	public void addMarket(Market market) {
		markets.put(market.getMarketId(), market);

	}

	/**
	 * This methods returns market by using marketId
	 * 
	 * @param marketId
	 * @return
	 */

	public Market getMarket(MarketId marketId) {
		return markets.get(marketId);
	}

	/**
	 * Method to sweep a sweeping order in the offer or bid book
	 * 
	 * @param sweepingOrder
	 */
	public void sweep(SweepingOrder sweepingOrder) {

		RestingOrder restingOrder = new RestingOrder(sweepingOrder);
		restingOrder.addOrder(sweepingOrder);

		Side side = sweepingOrder.getSide();
		
		if (side == Side.BUY) {

			if (this.offerBook.getPriceLevels().size() == 0) {

				this.bidBook.getPriceLevels().add(sweepingOrder);

			}

			else {

				List<SweepingOrder> priceLevels = offerBook.getPriceLevels();
				boolean isFound = false;
				boolean isMarketIdFound = false;

				for (SweepingOrder priceLevel : priceLevels) {

					if (priceLevel.getMarketId() == sweepingOrder.getMarketId()) {
						isMarketIdFound = true;
						break;
					}
				}

				if (isMarketIdFound == true) {

					for (SweepingOrder priceLevel : priceLevels) {

						if (priceLevel.getPrice().getPriceValue() == sweepingOrder.getPrice().getPriceValue()) {
							isFound = true;
							break;
						}
					}

					if (isFound == false) {

						this.bidBook.getPriceLevels().add(sweepingOrder);
					}

					else {
							// if order if executed then remove it totally or partially from the offer book
						// I need to add more functionality here to change order quantity

						this.offerBook.getPriceLevels().remove(sweepingOrder);

					}

				} else {

					this.bidBook.getPriceLevels().add(sweepingOrder);
				}

			}

		}

		else {

			this.offerBook.getPriceLevels().add(sweepingOrder);

		}

	}

	public SweepingOrder getOrder(ClientOrderId clientOrderId) {

		return RestingOrder.getOrder(clientOrderId);
	}

	public void getComms() {

	}

}
