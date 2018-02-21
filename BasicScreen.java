package com.labs.week5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BasicScreen extends JFrame implements ActionListener
{
	JButton button1;
	JButton button2;

	BasicScreen(String title)
	{
		super(title);
		setSize(300,300);
		setLayout(new FlowLayout());
		button1=new JButton("Click me");
		add(button1);
		button1.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent event)
	{
		System.out.println("button1 clicked");
	}
}
