package singletonframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fereastra extends JFrame implements ActionListener
{
	public Fereastra()
	{
		super("Fereastra mea");
		this.setSize(400, 250);
		
		JButton buton = new JButton("Apasa");
		buton.setBounds(10, 10, 100, 50);
		buton.addActionListener(this);
		
		this.add(buton);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		/*Popup p = new Popup();*/
		Popup p = Popup.getInstance();
		p.setVisible(true);
		
	}
}
