package controller;

import model.ChatBot;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ChatController
{
	private ChatBot simpleBot;
	
	public ChatController()
	{
		simpleBot = new ChatBot();
	}

	public void interactWithChatBot(String userInput)
	{
		int yesNo = JOptionPane.showConfirmDialog(null, "Are you sure?", "STOP, YOU HAVE VIOLATED THE LAW. PAY A FINE OR FACE THE CONSEQUENCES!", yesNo);
		//JOptionPane.YES_NO_OPTION(null, );
	
	}
	
	public void start()
	{
		String userInput = "";
		
		while(!userInput.equals("quit"))
		{
			userInput = JOptionPane.showInputDialog(null, "Type quit to leave.");
		}	
	}
}
