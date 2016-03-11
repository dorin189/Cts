package singletonframe;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Popup extends JFrame 
{
	private static Popup instance = null;
	private Popup()
	{
		super("Alerta");
		this.setSize(300, 150);
		
		
		JLabel label = new JLabel(new Date().toString());
		label.setBounds(10, 10, 200, 100);
		this.add(label);
		
	}
	
	public static Popup getInstance()
	{
		if(instance==null)
			instance = new Popup();
		return instance;
	}
	
}
