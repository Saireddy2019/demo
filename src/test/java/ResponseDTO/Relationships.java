package ResponseDTO;


	import com.fasterxml.jackson.annotation.JsonProperty;

import ResponseDTO.DefaultBillingaddress;
import ResponseDTO.DefaultShippingAddress;

	public class Relationships {
		@JsonProperty("default_billing_address")
		private DefaultBillingaddress defaultBillingAddress;
		@JsonProperty("default_shipping_address")
		private DefaultShippingAddress defaultShippingaddress;
		public DefaultBillingaddress getDefaultBillingaddress() {
			return defaultBillingAddress;
		}
		public void setDefaultBillingAddress(DefaultBillingaddress defaultBillingaddress) {
			this.defaultBillingAddress = defaultBillingaddress;
		}
		public DefaultShippingAddress getDefaultShippingAddress() {
			return defaultShippingaddress;
		}
		public void setDefaultShippingAddress(DefaultShippingAddress defaultShippingAddress) {
			this.defaultShippingaddress = defaultShippingAddress;
		}
		public Relationships(DefaultBillingaddress defaultBillingAddress, DefaultShippingAddress defaultShippingAddress) {
			super();
			this.defaultBillingAddress = defaultBillingAddress;
			this.defaultShippingaddress = defaultShippingAddress;
		}
		@Override
		public String toString() {
			return "Relationships [defaultBillingAddress=" + defaultBillingAddress + ", defaultShippingAddress="
					+ defaultShippingaddress + "]";
		}

	public Relationships() {
		
	}
	}