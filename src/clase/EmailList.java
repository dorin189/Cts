package clase;

import java.util.ArrayList;
import java.util.List;

public class EmailList
{
	private List<String> lista;
	private static EmailList instance = null;
	
	private EmailList()
	{
		lista = new ArrayList<String>();
	}
	
	public static EmailList getInstance()
	{
		if(instance==null)
			instance = new EmailList();
		return instance;
	}
	
	
	public void adaugaEmail(String email)
	{
		lista.add(email);
	}
	
	
	public String getEmails()
	{
		String aux = "";
		for(String email:lista)
			aux+=email+"; ";
		return aux;

	}
}
