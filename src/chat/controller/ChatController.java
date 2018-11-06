package chat.controller;

import javax.swing.JOptionPane;
import chat.model.Chatbot;
//import java.util.ArrayList;

public class ChatController
{
	private Chatbot simpleBot;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
	}

	public String interactWithChatbot(String userInput)
	{
		String userI = "";
		
		if(userInput == null)
		{
			userI += "You supplied null";
		}
		else
		{
			userI = JOptionPane.showInputDialog(null, "Hyello, how is do?");
			userI = simpleBot.processText(userInput);
		}
		
		//int yesNo = JOptionPane.showConfirmDialog(null, "Are you sure?", "STOP, YOU HAVE VIOLATED THE LAW. PAY A FINE OR FACE THE CONSEQUENCES!", yesNo);
		//JOptionPane.YES_NO_OPTION(null, );
		
		return userI;
	}
	
	public String useChatbotCheckers(String input)
	{
		
		return input;
	}
	
	public Chatbot getChatbot()
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
