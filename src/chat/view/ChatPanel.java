package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.*;
import java.awt.*;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private SpringLayout appLayout;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController app)
	{
		super();
		
		this.appController = app;
		appLayout = new SpringLayout();
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check");
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		appLayout = new SpringLayout();
		chatField = new JTextField("Talk to Bot here", 50);
		chatArea = new JTextArea("chat Area", 20, 50);
		chatPane = new JScrollPane();
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.BLUE);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(chatField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
