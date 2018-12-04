package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.*;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private JButton chatButton;
	private SpringLayout appLayout;
	private JTextField inputField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController appController)
	{
		super();
		
		this.appController = appController;
		this.chatButton = new JButton("it do");
		this.appLayout = new SpringLayout();
		this.inputField = new JTextField();
		this.chatArea = new JTextArea();
		this.chatPane = new JScrollPane();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
