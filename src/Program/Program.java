package Program;

import singletonframe.Fereastra;
import clase.Caine;
import clase.EmailList;
public class Program
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Caine c1 = Caine.getInstance("Dona", 1, 2.3,"Alb", 3);
		System.out.println(c1.toString());*/
		/*Caine c2 = Caine.getInstance("Ham", 2, 3.1, "rosu", 3);
		System.out.println(c2.toString());
		Fereastra f = new Fereastra();
		f.setVisible(true);*/
		EmailList list = EmailList.getInstance();
		list.adaugaEmail("dorin@run.ro");
		System.out.println(list.getEmails());
		EmailList list2 = EmailList.getInstance();
		list2.adaugaEmail("aaa@run.ro");
		System.out.println(list2.getEmails());
	}

}
