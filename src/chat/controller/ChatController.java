package chat.controller;

import javax.swing.JOptionPane;

import chat.model.ChatBot;

import java.util.ArrayList;

public class ChatController
{
	private ChatBot simpleBot;
	
	public ChatController()
	{
		simpleBot = new ChatBot();
	}

	public String interactWithChatbot(String userInput)
	{
		userInput = "";
		
		userInput = JOptionPane.showInputDialog(null, "Hyello, how is do?");
		userInput = simpleBot.processText(userInput);
		
		//int yesNo = JOptionPane.showConfirmDialog(null, "Are you sure?", "STOP, YOU HAVE VIOLATED THE LAW. PAY A FINE OR FACE THE CONSEQUENCES!", yesNo);
		//JOptionPane.YES_NO_OPTION(null, );
		
		
		return userInput;
	}
	
	public ChatBot getChatbot()
	{
		return simpleBot;
	}
	
	public void start()
	{
		String userInput = "";
		
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}	
	}
}
