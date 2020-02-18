package exchangeStructures;

import orderSpecs.MarketId;
/**
 * Market class contains offer and bid book. 
 * @author Simeon
 *
 */
public class Market {
	
	private Exchange exchange;
	private MarketId marketId;
	private OfferBook offerBook = new OfferBook();
	private BidBook bidBook =new BidBook();
	
	/**
	 * Market method takes the following parameters
	 * @param exchange
	 * @param marketId
	 */
	public Market(Exchange exchange, MarketId marketId) {
		super();
		this.exchange = exchange;
		this.marketId = marketId;
	}


	public Exchange getExchange() {
		return exchange;
	}


	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}


	public MarketId getMarketId() {
		return marketId;
	}


	public void setMarketId(MarketId marketId) {
		this.marketId = marketId;
	}


	public OfferBook getOfferBook() {
		return offerBook;
	}


	public void setOfferBook(OfferBook offerBook) {
		this.offerBook = offerBook;
	}


	public BidBook getBidBook() {
		return bidBook;
	}


	public void setBidBook(BidBook bidBook) {
		this.bidBook = bidBook;
	}
	
	
}
