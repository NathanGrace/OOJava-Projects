package TweetAnalysis;

public class Tweet {
	//declare private data members of a Tweet
	private String id;
	private String polarity;
	private String username;
	private String message;
	
	//initialize private data members that we just created
	public Tweet(String polarity, String id, String username, String message) {
		this.polarity = polarity;
		this.id = id;
		this.username = username;
		this.message = message;
	}	
	
	//checks to make sure the Object given can be found in the actual ArrayList
	public boolean equals(Object rhs) {
		Tweet rhsT = (Tweet)rhs;		
		return rhsT.getId().equals(this.getId());
	}
	
	//Prints all data members as a string 
	//(but like I made them Strings already so this is only half as useful for me, but it still prints everything neatly!)
	public String toString () {		
		String toReturn = "Polarity: " + polarity + ", " + "Id: " + id + ", ";
		toReturn += "Username: " +  username + ", ";
		toReturn += "Message: " + message;
		return toReturn;
	}

	
	//GETTERS AND SETTERS
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setPolarity(String polarity) {
		this.polarity = polarity;
	}
	public String getPolarity() {
		return polarity;
	}
	
}
