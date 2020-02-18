package orderTypes;


import orderSpecs.ClientId;
import orderSpecs.ClientOrderId;
import orderSpecs.Quantity;

import java.util.*;

/**
 * 
 * @author Simeon
 *
 */
public class RestingOrder {
	private SweepingOrder sweepingOrder;
	private static HashMap<ClientOrderId,SweepingOrder> order = new HashMap<ClientOrderId,SweepingOrder>();


	public RestingOrder(SweepingOrder sweepingOrder) {
		this.sweepingOrder = sweepingOrder;
	}
	
	public RestingOrder() {
		
	}

	public SweepingOrder getSweepingOrder() {
		return sweepingOrder;
	}

	
	public void addOrder(SweepingOrder sweepingOrder) {
		order.put(sweepingOrder.getClientOrderId(),sweepingOrder);
		
	}

	public  static SweepingOrder getOrder(ClientOrderId clientOrderId) {
		return order.get(clientOrderId);
	}

	public Quantity getQuantity() {
		// TODO Auto-generated method stub
		return order.get(sweepingOrder).getQuantity();
	}

	public static HashMap<ClientOrderId, SweepingOrder> getOrders() {
		return order;
	}

	public ClientId getClientId() {
		
		return sweepingOrder.getClientId();
	}

	
	 
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	
		

}
