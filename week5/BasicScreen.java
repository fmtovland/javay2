package com.labs.week5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JCheckBox;


public class BasicScreen extends JFrame implements ActionListener
{
	JButton button1;
	JButton button2;

	JCheckBox checkbox;

	BasicScreen(String title)
	{
		super(title);
		setSize(1280,720);	//change window default size
		setLayout(new FlowLayout());

		button1=new JButton("Click me");
		button2=new JButton("No click me instead");
		add(button1);
		add(button2);
		button1.addActionListener(this);

		checkbox=new JCheckBox("ignore them?");
		add(checkbox);

		setVisible(true);	//forget this and the window wont appear
	}

	public void actionPerformed(ActionEvent event)
	{
		System.out.println("button1 clicked");
	}
}
