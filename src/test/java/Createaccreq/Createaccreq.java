	package Createaccreq;

	import com.fasterxml.jackson.annotation.JsonProperty;

	public class Createaccreq{
		
			
			@JsonProperty("user")
			private User user;
			
			public User getUser() {
				return user;
			}


			public void setUser(User user) {
				this.user = user;
				user.setEmail("aki9874501295010@qapitol.com");
				user.setPassword("Admin1234");
				user.setPassword_confirmation("Admin1234");
			}

			public Createaccreq( ) {
			}
			
		}



