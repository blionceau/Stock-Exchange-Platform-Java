package orderSpecs;
/**
 * 
 * @author Simeon
 *
 */
public class ClientOrderId {
	private String clientOrderId;

	public ClientOrderId(String clientOrderId) {
		this.clientOrderId = clientOrderId;
	}

	public String getClientOrderId() {
		return clientOrderId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientOrderId == null) ? 0 : clientOrderId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientOrderId other = (ClientOrderId) obj;
		if (clientOrderId == null) {
			if (other.clientOrderId != null)
				return false;
		} else if (!clientOrderId.equals(other.clientOrderId))
			return false;
		return true;
	}
	
	
	
}
