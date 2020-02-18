package messages;

import orderSpecs.ClientId;
import orderSpecs.ClientOrderId;

/**
 * 
 * @author Simeon
 *
 */
public class CancelRejected {
	private ClientId clientId;
	private ClientOrderId ClientOrderId;

	public CancelRejected(ClientId clientId, ClientOrderId clientOrderId) {
		this.clientId = clientId;
		this.ClientOrderId = clientOrderId;

	}

	public ClientId getClientId() {
		return clientId;
	}

	public ClientOrderId getClientOrderId() {
		return ClientOrderId;
	}

}