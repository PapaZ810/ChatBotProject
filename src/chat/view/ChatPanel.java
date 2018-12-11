package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.*;
import java.awt.*;
import chat.controller.IOController;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private JButton resetButton;
	private SpringLayout appLayout_1;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController app)
	{
		super();
		
		this.appController = app;
		
		resetButton = new JButton("Reset");
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check");
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		appLayout_1 = new SpringLayout();
		
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
		this.setLayout(appLayout_1);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(new Color(0, 128, 128));
		this.add(chatPane);
		this.add(chatButton);
		this.add(resetButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(chatField);
	}
	
	private void setupLayout()
	{
		appLayout_1.putConstraint(SpringLayout.NORTH, resetButton, 10, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, resetButton, 10, SpringLayout.WEST, this);
		appLayout_1.putConstraint(SpringLayout.WEST, loadButton, 82, SpringLayout.EAST, checkerButton);
		appLayout_1.putConstraint(SpringLayout.EAST, loadButton, -420, SpringLayout.EAST, this);
		appLayout_1.putConstraint(SpringLayout.NORTH, chatButton, 38, SpringLayout.SOUTH, chatField);
		appLayout_1.putConstraint(SpringLayout.NORTH, saveButton, 38, SpringLayout.SOUTH, chatField);
		appLayout_1.putConstraint(SpringLayout.NORTH, loadButton, 38, SpringLayout.SOUTH, chatField);
		appLayout_1.putConstraint(SpringLayout.NORTH, checkerButton, 38, SpringLayout.SOUTH, chatField);
		appLayout_1.putConstraint(SpringLayout.SOUTH, checkerButton, 109, SpringLayout.SOUTH, chatField);	
		appLayout_1.putConstraint(SpringLayout.WEST, chatButton, 82, SpringLayout.EAST, saveButton);
		appLayout_1.putConstraint(SpringLayout.EAST, chatButton, -85, SpringLayout.EAST, this);
		appLayout_1.putConstraint(SpringLayout.WEST, saveButton, 82, SpringLayout.EAST, loadButton);
		appLayout_1.putConstraint(SpringLayout.EAST, saveButton, -265, SpringLayout.EAST, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, chatButton, -61, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.EAST, checkerButton, -610, SpringLayout.EAST, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, saveButton, -61, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, checkerButton, 82, SpringLayout.WEST, this);
		appLayout_1.putConstraint(SpringLayout.SOUTH, loadButton, -61, SpringLayout.SOUTH, this);
		appLayout_1.putConstraint(SpringLayout.NORTH, chatField, 30, SpringLayout.SOUTH, chatPane);
		appLayout_1.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatPane);
		appLayout_1.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, chatPane);
		appLayout_1.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		appLayout_1.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		appLayout_1.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		resetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click) 
			{
				chatArea.setText("");
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click) 
			{
				String chatText = chatArea.getText();
				String path = ".";
				IOController.saveText(appController, path, chatText);
				chatArea.setText("Chat Saved!");
			}
		});
		
		checkerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click) 
			{
				
			}
		});
		
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click) 
			{
				
			}
		});
		
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = chatField.getText();
				String output = "";
				output = appController.interactWithChatbot(input);
				chatArea.append(output);
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
		});
		
		
	}
}
