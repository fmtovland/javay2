//a graphical screen
package com.labs.week7;


//event handlers
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//gui elemnets
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;


class BasicScreen extends JFrame implements ActionListener
{
	public JTextField textbox1,textbox2;
	public JButton button1;

	BasicScreen(String title)
	{
		super(title);
		setSize(1280,720);
		setLayout(new FlowLayout());

		//textbox 1 and 2
		textbox1=new JTextField("box1");
		textbox2=new JTextField("box2");
		textbox1.addActionListener(this);
		textbox2.addActionListener(this);
		add(textbox1);
		add(textbox2);

		//button1
		button1=new JButton("clickme");
		button1.addActionListener(this);
		add(button1);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent event1)
	{
	}
}
