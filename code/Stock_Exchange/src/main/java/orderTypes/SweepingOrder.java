package orderTypes;

import java.util.List;

import orderSpecs.*;
/**
 * 
 * @author Simeon
 *
 */
public class SweepingOrder {
	private ClientId clientId;
	private ClientOrderId ClientOrderId;
	private MarketId marketId;
	private Side side;
	private Quantity quantity;
	private Price price;
	
	public SweepingOrder(ClientId clientId, ClientOrderId clientOrderId, MarketId marketId, Side side,
			Quantity quantity, Price price) {
		super();
		this.clientId = clientId;
		ClientOrderId = clientOrderId;
		this.marketId = marketId;
		this.side = side;
		this.quantity = quantity;
		this.price = price;
	}

	public SweepingOrder() {
		
	}


	public ClientId getClientId() {
		return clientId;
	}

	public ClientOrderId getClientOrderId() {
		return ClientOrderId;
	}

	public MarketId getMarketId() {
		return marketId;
	}

	public Side getSide() {
		return side;
	}

	public Quantity getQuantity() {
		return quantity;
	}

	public Price getPrice() {
		return price;
	}

	public List<SweepingOrder> getOrders() {
		
		return null;
	}
	
}
