package nisch;

import java.util.*;


public class StudTest
{
public static void read(Stud s)
{
s.read();
}
public static void calculate(Stud s)
{
	s.calculate();
}
public static void display(Stud s)
{
	s.display();
}
public static void sellSearch(Stud s)
{
	s.sellSearch();
}
public static void aesOrder(Stud s)
{
	s.aesOrder();
}
public static void sortedDisplay(Stud s)
{
	s.sortedDisplay();
}


public static int menu()
{
	Scanner sa=new Scanner(System.in);
	System.out.println("1.Read");
	System.out.println("2.calculate");
	System.out.println("3.display");
	System.out.println("4.Sell an item");
	System.out.println("5.Lowest price");
	System.out.println("6.Sorted Display");
	System.out.println("7.Exit");
	
	int n=sa.nextInt();
	return n;
}

	public static void main(String[]args)
{
	Stud t= new Stud();
	int c=menu();
	while(c!=7)
	{
		switch(c)
		{
			case 1:
			         read(t);
			break;
			   case 2:
			         calculate(t);
			break;
			   case 3:
			         display(t);
			break;
			   case 4:
			         sellSearch(t);
			break;
			
			   case 5:
				   aesOrder(t);
			break;	  
			   case 6:
				   sortedDisplay(t);
			break;	 
			   case 7:
			         System.exit(0);
			break;
		}
			c=menu();
}
}
}

