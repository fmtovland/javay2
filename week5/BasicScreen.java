package com.labs.week5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;


public class BasicScreen extends JFrame implements MouseListener, ActionListener
{
	JButton button1;
	JButton button2;

	JCheckBox checkbox;

	public JTextField box;

	JPanel mypanel;
	JLabel mylabel;

	BasicScreen(String title)
	{
		super(title);
		setSize(1280,720);	//change window default size
		setLayout(new FlowLayout());

		//buttons 1&2
		button1=new JButton("Click me");
		button2=new JButton("No click me instead");
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);

		//the checkbox
		checkbox=new JCheckBox("ignore them?");
		add(checkbox);

		//the text field
		JTextField box= new JTextField("Name");
		box.addActionListener(this);
		add(box);

		//jpanel
		mypanel=new JPanel();
		mylabel=new JLabel("The panel is here");
		mypanel.addMouseListener(this);
		mypanel.setBackground(Color.red);
		mypanel.add(mylabel);
		add(mypanel);

		setVisible(true);	//forget this and the window wont appear
	}

	public void actionPerformed(ActionEvent event1)
	{
		if(event1.getSource()==button1)
		{
			JOptionPane.showMessageDialog(this, "MyFirstevent!");
			System.out.println("button1 clicked");
		}

		else if(event1.getSource()==button2)
		{
			System.out.println("button2 clicked");
			JOptionPane.showMessageDialog(this, "My Second event!");
		}

		else
		{
			JOptionPane.showMessageDialog(this, "you entered "+event1.getActionCommand());
		}

	}


	//implements MouseListener
	public void mousePressed(MouseEvent event2)
	{
	}

	public void mouseReleased(MouseEvent event3)
	{
	}

	public void mouseEntered(MouseEvent event4)
	{
		mylabel.setText("Mouse Entered the panel");
	}

	public void mouseExited(MouseEvent event5)
	{
		mylabel.setText("Mouse Exited the panel");
	}

	public void mouseClicked(MouseEvent event6)
	{
	}

}
