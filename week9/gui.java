//a graphical test class for person

package com.labs.week9;
import java.util.ArrayList;

//event handlers
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//gui elemnets
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

class gui extends JFrame implements ActionListener
{
	ArrayList people=new ArrayList(0);
	JTextField firstnameBox, surnameBox, cityBox;
	JButton addButton, showOutputButton;
	JLabel output;

	gui(String title)
	{
		super(title);
		setSize(360,240);
		setLayout(new FlowLayout());
		setVisible(true);

		firstnameBox=new JTextField(10);
		surnameBox=new JTextField(10);
		cityBox=new JTextField(10);
		firstnameBox.addActionListener(this);
		surnameBox.addActionListener(this);
		cityBox.addActionListener(this);
		add(firstnameBox);
		add(surnameBox);
		add(cityBox);

		addButton=new JButton("Add Person");
		showOutputButton=new JButton("show people");
		addButton.addActionListener(this);
		showOutputButton.addActionListener(this);
		add(addButton);
		add(showOutputButton);

		output=new JLabel("");
		add(output);
	}

	public void actionPerformed(ActionEvent event1)
	{
		if(event1.getSource()==addButton)
		{
			people.add(new Person(firstnameBox.getText(),surnameBox.getText(),cityBox.getText()));
		}

		else if(event1.getSource()==showOutputButton)
		{
			int i;
			String returnme="<html>";	// \n wasnt working so this was stack overflow's solution

			for(i=0; i<people.size(); i++)
			{
				returnme=returnme+people.get(i).toString();
				returnme=returnme+"<br>";
			}
			returnme=returnme+"</html>";

			output.setText(returnme);
		}
	}
}
