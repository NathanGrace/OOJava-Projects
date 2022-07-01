package TweetAnalysis;

import java.io.BufferedReader;
import java.util.ArrayList;


public class TweetCollection {
	private ArrayList<Tweet> myData;
	
	//initialize the ArrayList
	public TweetCollection(String string) {
		myData = new ArrayList<Tweet>();
		//TweetCollection trainingData = new TweetCollection("./testProcessed.txt");
	}
	
	//add a Tweet to the ArrayList
	public void addTweet(Tweet t) {
		myData.add(t);
	}
	
	//Remove a Tweet using it's id
	public void removeTweetById(String id)  {
		for(int i = 0; i < myData.size(); i++) {
			Tweet t = myData.get(i);
			if(t.getId().equals(id))
				myData.remove(i);
		}
	}
	
	//Return a Tweet using it'd id
	public String getTweetById(String id) {
		for(int i = 0; i < myData.size(); i++) {
			Tweet t = myData.get(i);
			if(t.getId().equals(id)) {
				return t.toString();
			}
		}
		
		return "Error: input id cannot be found in list of tweets.";
	}
	
	/*public String getTweetByUsername(String username) {
		Tweet tempTweet = new Tweet(username);
		for(int i = 0; i < myData.size(); i++) {
			Tweet t = myData.get(i);
			if(t.getUsername().equals(username)) {
				tempTweet = t;
				return tempTweet.toString();
			}
		}
		return tempTweet.toString();				//FIX THIS
	}*/
	
	//returns all Tweets that one person has in the ArrayList
	public String getTweetsByUsername(String username) {
		String toReturn = "Collection of ids from user: " + username + "\n";
		
		for (Tweet t : myData) {
			if(t.getUsername().equals(username)) {
				toReturn += t + "\n";
				
			}
		}
		
		return toReturn;		
	}
	
	//Return all ids in the ArrayList
	public String getAllIds() {
		String toReturn = "Collection of all ids: \n";
		for (Tweet t : myData) {
			toReturn += t.getId() + ",";
		}
		return toReturn;
	}
	
	//Prints all of the Tweets in the Collection
	public String toString() {
		
		String toReturn = "Collection of Tweets: \n";
		
		for (Tweet t : myData) {
			toReturn += t.toString() + "\n";
		}
		
		return toReturn;
		
		/*for(int i = 0; i < 100; i++) {
			
		}
		
		for(int i = 0; i < 100; i++) {
			
		}*/
			
		//myData.size(); maybe?
		//myData.lastIndexOf(o); maybe?
		//welp, I never could read the files so I never needed to test anything, nor could I test even if I wanted to
	}
	
	//This "predicts" the polarity of a tweet and returns the accracy of the prediction
	public double polarityPrediction() {
		String polPrediction = "0";
		double counter = 0;
		double accuracy = 0;
		
		for (Tweet t : myData) {
			if(t.getPolarity().equals(polPrediction)) {
				counter += 1;
			}
		}
		accuracy = counter/myData.size();
		return accuracy;
	}
	
	
	/*private void readFile() {
		BufferedReader lineReader = null;
		try {
			FileReader fr = new FileReader(fileName);
			lineReader = new BufferedReader(fr);
			String line = null;
			while ((line = lineReader.readLine())!=null) {
				String [] tokens = line.split(",");
				int polarity = Integer.parseInt(tokens[0]);
				String id = tokens[1];
				myData.addTweet(new Tweet(polarity, id, tokens[2], tokens[3]));
			}
			}
		catch{
			
			
		}
		
	}*/
	
}
