package ResponseDTO;


	import com.fasterxml.jackson.annotation.JsonProperty;

	public class DefaultShippingAddress {
		@JsonProperty("data")
		private Object data;

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "DefaultShippingAddress [data=" + data + "]";
		}

		public DefaultShippingAddress(Object data) {
			super();
			this.data = data;
		}
		public DefaultShippingAddress() {
			
		}

	}