package ResponseDTO;
	import com.fasterxml.jackson.annotation.JsonProperty;

import ResponseDTO.Attributes;
import ResponseDTO.Relationships;

	public class Data {
		@JsonProperty("id")
		private int id;
		@JsonProperty("type")
		private String type;
		@JsonProperty("attributes")
		private Attributes attributes;
		@JsonProperty("relationships")
		private Relationships relationships;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			 this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Attributes getAttributes() {
			return attributes;
		}
		public void setAttributes(Attributes attributes) {
			this.attributes = attributes;
		}
		public Relationships getRelationships() {
			return relationships;
		}
		public void setRelationships(Relationships relationships) {
			this.relationships = relationships;
		}
		public Data(int id, String type, Attributes attributes, Relationships relationships) {
			super();
			this.id = id;
			this.type = type;
			this.attributes = attributes;
			this.relationships = relationships;
		}
		public Data() {
			
		}
		@Override
		public String toString() {
			return "Data [id=" + id + ", type=" + type + ", attributes=" + attributes + ", relationships=" + relationships
					+ "]";
		}
		


	}