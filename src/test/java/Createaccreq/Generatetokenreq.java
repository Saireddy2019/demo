package Createaccreq;


	import com.fasterxml.jackson.annotation.JsonProperty;

	public class Generatetokenreq{

		@JsonProperty("grant_type")
		private String grant_type;

		@JsonProperty("username")
		private String username;
		@JsonProperty("password")
		private String password;

		public void setGrant_type(String grant_type) {
			// TODO Auto-generated method stub
			this.grant_type = grant_type;
		}

		public String getGrant_type() {
			return grant_type;
		}

		public void setUsername(String username) {
			// TODO Auto-generated method stub
			this.username = username;
		}

		public String getUsername() {
			return username;
		}

		public void setPassword(String password) {
			// TODO Auto-generated method stub
			this.password = password;
		}

		public String getPassword() {
			return password;
		}

		public Generatetokenreq() {
		}

		public Generatetokenreq(String grant_type, String username, String password) {
			super();
			this.grant_type = grant_type;
			this.username = username;
			this.password = password;
		}

		@Override
		public String toString() {
			return "Generatetokenreq [grant_type=" + grant_type + ", username=" + username + ", password=" + password
					+ "]";
		}

	}