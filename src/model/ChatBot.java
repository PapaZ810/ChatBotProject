package model;

import java.util.ArrayList;

public class ChatBot
{
	private String userName, botName, joke;
	private ArrayList<String> responseList;
	
	public ChatBot()
	{
		this.userName = "unnamed user";
		this.botName = "c-bot";
		this.joke = "I'm so funny";
		
		this.responseList = new ArrayList<String>();
		
		buildTheLists();
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello?");
		responseList.add("Big Gay Boi.");
		responseList.add("huh?");
		responseList.add("");
		responseList.add("That is unethical.");
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
