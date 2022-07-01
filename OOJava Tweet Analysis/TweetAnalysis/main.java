package TweetAnalysis;

public class main {

	public static void main(String[] args) {
		//create an empty list of tweets
		TweetCollection myData = new TweetCollection("myTweets");
		
		//create some tweets and print them
		Tweet aTweet = new Tweet("2", "12345", "Joe", "Joe Mama HAHAH");
		Tweet aaTweet = new Tweet("2", "09876", "Joe", "Sorry I had to.");
		Tweet bTweet = new Tweet("0", "54321", "Punny", "When she told me I was average, she was just being mean.");
		System.out.println(aTweet);
		System.out.println(aaTweet);
		System.out.println(bTweet);
		
		
		//add aTweet and bTweet to the collection of Tweets
		myData.addTweet(aTweet);
		myData.addTweet(aaTweet);
		myData.addTweet(bTweet);
		
		//print aTweet and bTweet from the array using its id
		System.out.println("\nThese Tweets were found using their unique ids!: ");
		System.out.println(myData.getTweetById("12345"));
		System.out.println(myData.getTweetById("54321"));
		System.out.println(myData.getTweetById("09876"));
		
		//print the collection of Tweets using toString() Method
		System.out.println("\nThis is the collection of Tweets printed using toString!");
		System.out.println(myData.toString());
		
		//print all of the ids in the collection
		System.out.println(myData.getAllIds());
		
		//print all of the ids from the user named "Joe"
		System.out.println();
		System.out.println(myData.getTweetsByUsername("Joe"));
		
		//Print the polarity prediction
		System.out.println("Polarity Prediction: ");
		System.out.println(myData.polarityPrediction());
		
		//remove aTweet from the collection, then print the collection of Tweets
		System.out.println("\n\nThis is the collection of Tweets after removing the Tweet with id: 12345!");
		myData.removeTweetById("12345");
		System.out.println();
		System.out.println(myData);
		
		
	}

}
