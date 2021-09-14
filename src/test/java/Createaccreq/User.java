	package Createaccreq;

	import com.fasterxml.jackson.annotation.JsonProperty;



		public class User {
			//@JsonProperty("user")
			
			@JsonProperty("email")
			private String email;
			@JsonProperty("password")
			private String password;
			@JsonProperty("password_confirmation")
			private String password_confirmation;
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public String getPasswordconf() {
				return password_confirmation;
			}
			public void setPassword_confirmation(String password_confirmation) {
				this.password_confirmation = password_confirmation;
			}
			public User() {
			}
			
			@Override
			public String toString() {
				return "Createacc [email=" + email + ", password=" + password + ", password_confirmation=" + password_confirmation + "]";
			}
			public User(String email, String password, String passwordconf) {
				super();
				this.email = email;
				this.password = password;
				this.password_confirmation = passwordconf;
			}
		}
