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
import javax.swing.JLabel;


class BasicScreen extends JFrame implements ActionListener
{
	public JTextField textbox1,textbox2;
	public JButton button1;
	public JLabel label1;

	BasicScreen(String title)
	{
		super(title);
		setSize(360,240);
		setLayout(new FlowLayout());

		//textbox 1 and 2
		textbox1=new JTextField(20);
		textbox2=new JTextField(1);
		textbox1.addActionListener(this);
		textbox2.addActionListener(this);
		add(textbox1);
		add(textbox2);

		//button1
		button1=new JButton("clickme");
		button1.addActionListener(this);
		add(button1);

		//label
		label1=new JLabel("");
		add(label1);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent event1)
	{
		String content1="",content2="";	//the contents of both boxes

		if(event1.getSource()==button1)
		{
			content1=textbox1.getText();
			content2=textbox2.getText();

			if(content1.charAt(0) == content2.charAt(0))
				label1.setText("Contents of boxes are the same");
			else
				label1.setText("Contents of boxes are not the same");
		}
	}
}
