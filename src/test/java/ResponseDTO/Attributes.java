package ResponseDTO;

	import com.fasterxml.jackson.annotation.JsonProperty;

	public class Attributes {
		@JsonProperty("email")
		private String email;
		@JsonProperty("store_credits")
		private Integer storeCredits;
		@JsonProperty("completed_orders")
		private Integer completedOrders;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Integer getStoreCredits() {
			return storeCredits;
		}
		public void setStoreCredits(Integer storeCredits) {
			this.storeCredits = storeCredits;
		}
		public Integer getCompletedOrders() {
			return completedOrders;
		}
	public void setCompletedOrders(Integer completedOrders) {
			this.completedOrders = completedOrders;
		}
	public Attributes(String email, Integer storeCredits, Integer completedOrders) {
		super();
		this.email = email;
		this.storeCredits = storeCredits;
		this.completedOrders = completedOrders;
	}
	public Attributes() {
		
	}
	@Override
	public String toString() {
		return "Attributes [email=" + email + ", storeCredits=" + storeCredits + ", completedOrders=" + completedOrders
				+ "]";
	}


	}
