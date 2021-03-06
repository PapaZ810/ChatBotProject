package chat.controller;

import chat.view.ChatFrame;
import javax.swing.JOptionPane;
import chat.model.Chatbot;

public class ChatController
{
	private ChatFrame appFrame;
	private Chatbot simpleBot;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}

	public String interactWithChatbot(String text)
	{
		String userO = "";
		userO += simpleBot.processText(text);
		
		
		/*if(userInput == null)
		{
			userO += "You supplied null";
		}
		else
		{
			userO = JOptionPane.showInputDialog(null, "Hyello, how is do?");
			userO = simpleBot.processText(userInput);
		}*/
		
		//int yesNo = JOptionPane.showConfirmDialog(null, "Are you sure?", "STOP, YOU HAVE VIOLATED THE LAW. PAY A FINE OR FACE THE CONSEQUENCES!", yesNo);
		//JOptionPane.YES_NO_OPTION(null, );
		
		return userO;
	}
	
	public String useChatbotCheckers(String input)
	{
		String output = "";
		
		if(input == "spooky")
		{
			output = "Halloween";
		}
		
		return output;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
	
	public void start()
	{
		/*String userInput = "";
		
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}	*/
	}
	
	private void close()
	{
		System.exit(0);
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	public ChatFrame getAppFrame()
	{
		return appFrame;
	}
	
}
