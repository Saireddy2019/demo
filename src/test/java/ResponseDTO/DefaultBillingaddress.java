package ResponseDTO;


	import com.fasterxml.jackson.annotation.JsonProperty;

	public class DefaultBillingaddress {
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
			return "DefaultBillingAddress [data=" + data + "]";
		}

		public DefaultBillingaddress(Object data) {
			super();
			this.data = data;
		}
	public DefaultBillingaddress() {
		
	}

	}