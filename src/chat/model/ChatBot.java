package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	private String currentUser, botName, joke, content;
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	
	public Chatbot()
	{
		this.currentUser = "unnamed user";
		this.botName = "c-bot";
		this.joke = "I'm so funny";
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello");
		responseList.add("Big Gay Boi.");
		responseList.add("huh?");
		responseList.add("Goodbye");
		responseList.add("That is unethical.");
		responseList.add("God you smell bad!");
		responseList.add("Do you like Fortnite?");
		responseList.add("Do you have a PC?");
		responseList.add("MineCraft");
		responseList.add("Ruski");
		responseList.add("add more codes next time");
		responseList.add("log out next time");
		responseList.add("please exit the session by typing 'quit' in the box");
		responseList.add("I do not like you");
		responseList.add("");
		responseList.add("I enjoy the summer");
		responseList.add("how are you?");
		
		spookyList.add("Halloween");
		spookyList.add("big spoop");
		spookyList.add("doot");
		spookyList.add("spoop");
		spookyList.add("calcium");
		spookyList.add("graveyard");
		spookyList.add("do you like the Night before Christmas?");
		spookyList.add("skele");
		spookyList.add("reaper");
	}
	
	public String processText(String userText)
	{
		String answer = "";
		
		answer += "You said: " + userText;
		
		return answer;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getJoke()
	{
		return joke;
	}
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	public String getBotName()
	{
		return botName;
	}
	
	public void setCurrentUser()
	{
		this.currentUser = currentUser;
	}
	
	public void setBotName()
	{
		this.botName = botName;
	}
	
	public void setJoke()
	{
		this.joke = joke;
	}
}
