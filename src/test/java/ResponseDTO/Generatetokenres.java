package ResponseDTO;


	import java.util.Date;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	import com.fasterxml.jackson.annotation.JsonProperty;


		@JsonIgnoreProperties(ignoreUnknown = true)
		public class Generatetokenres {

		@JsonProperty("access_token")
		private String access_token;
		   @JsonProperty("token_type")
		private String token_type;
		   
		    @JsonProperty("refresh_token")
		private String refresh_token;
		   
		    @JsonProperty("expires_in")
		private long expires_in;
		   
		    @JsonProperty("created_at")
		private Date created_at;

			public String getAccess_token() {
				// TODO Auto-generated method stub
				return access_token;
			}
			public void setAccess_token(String access_token) {
				this.access_token=access_token;
			}

			public Date getCreated_at() {
				// TODO Auto-generated method stub
				return created_at;
			}
			public void setCreated_at(Date Created_at) {
				this.created_at=Created_at;
			}


			public long getExpires_in() {
				// TODO Auto-generated method stub
				return expires_in;
			}
			public void setExpires_in(long Expires_in) {
				this.expires_in=Expires_in;
			}


			public String getRefresh_token() {
				// TODO Auto-generated method stub
				return refresh_token;
			}
			public void setrefresh_token(String refresh_token) {
				this.refresh_token=refresh_token;
			}


			public String getToken_type() {
				// TODO Auto-generated method stub
				return token_type;
			}

			
			 public void setToken_type(String Token_type) {
				 this.token_type=Token_type;
			 
			 }
			 	public Generatetokenres() {
			}

			public Generatetokenres(String access_token, String token_type, String refresh_token, long expires_in,
					Date created_at) {
				super();
				this.access_token = access_token;
				this.token_type = token_type;
				this.refresh_token = refresh_token;
				this.expires_in = expires_in;
				this.created_at = created_at;
			}
			@Override
			public String toString() {
				return "Generatetokenres [access_token=" + access_token + ", token_type=" + token_type
						+ ", refresh_token=" + refresh_token + ", expires_in=" + expires_in + ", created_at=" + created_at
						+ "]";
			}
			


}
