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

//files
import java.io.FileNotFoundException;


class BasicScreen extends JFrame implements ActionListener
{
	public JTextField textbox1,textbox2,textbox3;
	public JButton button1,button2,fbutton;
	public JLabel label1;
	public ReadFile filestring;

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

		//second textbox and button
		textbox3=new JTextField(20);
		button2=new JButton("OKAY");
		textbox3.addActionListener(this);
		button2.addActionListener(this);
		add(textbox3);
		add(button2);
		setVisible(true);

		//read file button
		fbutton=new JButton("read file");
		fbutton.addActionListener(this);
		add(fbutton);
	}

	public void actionPerformed(ActionEvent event1)
	{
		String content1="",content2="";	//the contents of both boxes
		String[] content3;

		if(event1.getSource()==button1)
		{
			content1=textbox1.getText();
			content2=textbox2.getText();

			if(content1.charAt(0) == content2.charAt(0))
				label1.setText("Contents of boxes are the same");
			else
				label1.setText("Contents of boxes are not the same");
		}

		if(event1.getSource()==button2)
		{
			boolean sucess=false;
			content1=textbox1.getText();
			content2=textbox3.getText();

			content3=content1.split("\\s+");

			for(int i=0; i<content3.length; i++)
			{
				if(content3[i].equals(content2))
					sucess=true;
			}

			if(sucess)
				label1.setText("string found in sentence");
			else
				label1.setText("string not found in sentence");
		}

		try
		{
			if(event1.getSource()==fbutton)
			{
				filestring=new ReadFile();
				label1.setText(filestring.content);
			}
		}

		catch(FileNotFoundException e)
		{
			System.out.println("USING THIS LANGUAGE IS LIKE BEING AT THE DMV!");
		}
	}
}
