package chat.model;

import java.util.ArrayList;

public class ChatBot
{
	private String userName, botName, joke;
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	
	public ChatBot()
	{
		this.userName = "unnamed user";
		this.botName = "c-bot";
		this.joke = "I'm so funny";
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello?");
		responseList.add("Big Gay Boi.");
		responseList.add("huh?");
		responseList.add("");
		responseList.add("That is unethical.");
		responseList.add("God you smell bad!");
		
		spookyList.add("spoop");
		spookyList.add("big spoop");
	}
	
	public String processText(String userText)
	{
		String answer = "";
		
		answer += "You said: " + userText;
		
		return answer;
	}
	
	public String getJoke()
	{
		return joke;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getBotName()
	{
		return botName;
	}
	
	public void setUserName()
	{
		this.userName = userName;
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
