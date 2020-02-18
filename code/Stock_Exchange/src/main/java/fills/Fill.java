package fills;

import orderSpecs.ClientId;
import orderSpecs.Quantity;

/**
 * 
 * @author Simeon
 *
 */
public class Fill {
	
	private ClientId clientId;
	private ClientId counterPartyId;
	private Quantity quantity;
	
	public Fill() {
		
		
	}

	public ClientId getClientId() {
		return clientId;
	}

	public ClientId getCounterPartyId() {
		return counterPartyId;
	}

	public Quantity getQuantity() {
		return quantity;
	}
	
	

}
