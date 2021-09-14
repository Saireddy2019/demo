package ResponseDTO;


	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	import com.fasterxml.jackson.annotation.JsonProperty;


	@JsonIgnoreProperties(ignoreUnknown = true)


	public class Createacc {

		@JsonProperty("data")
		private Data data;

		public Data getData() {
			return data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public Createacc(Data data) {
			super();
			this.data = data;
		}
		
		public Createacc() {
			
		}

		@Override
		public String toString() {
			return "Createacc [Data=" + data + "]";
		}
	}
