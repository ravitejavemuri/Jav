package nisch;

import java.util.*;
public class Stud
{

private int ids;	
private int []id=new int[5];
private String []name=new String[5];
private int []quant=new int[10];
private double []factory =new double[10];
private double []discount  =new double[10];
private double []total  =new double[10];

Scanner sa=new Scanner(System.in);
public void read()
{

for(int i=0;i<id.length;i++)
{
System.out.print("Enter item name:");
	name[i]=sa.next();
System.out.print("Enter item id:");
id[i]=sa.nextInt();
while(id[i]<1 || id[i]>333)
{
	System.out.print("Enter a id between 1 - 333");
	id[i]=sa.nextInt();
}
System.out.print("Enter quantity in stock");
quant[i]=sa.nextInt();
System.out.print("Enter factory price");
factory[i]=sa.nextDouble();

while(factory[i]<1 || factory[i]>1000)
{
	System.out.print("Re-Enter factory price 1.0 to 1000.0:");
factory[i]=sa.nextDouble();
}

}
}
public void calculate()
	{
	
		
		
		for(int i = 0;i<id.length;i++)
		{
			System.out.println("Enter the discount for:"+name[i]);
			discount[i]=sa.nextDouble();
			total[i] = factory[i]-(discount[i]/100*factory[i]); ;
			System.out.println("After the discount:"+total[i]);
		}
	}

	public void display()
	{
		System.out.printf("id\t name\t quant\t price\t\n ");
		for(int i = 0;i<name.length;i++)
		{
			
			System.out.printf("%d\t %s\t %.2f\t %.2f\t\n ",id[i],name[i],quant[i],factory[i]);
		}
		System.out.println("\n");
	}
	
	public void sellSearch()
	{
		System.out.println("Entet the id to search");
		ids=sa.nextInt();
		
		for(int i=0;i<id.length;i++)
		{
			if(ids==id[i])
			{
				if(quant[i]!=0)
				{
					System.out.println("id: "+id[i]+"quant: "+quant[i]);
					quant[i]=quant[i]-1;
					System.out.println("Item Sold!");
				}
				
				else
					System.out.println("out of stock");
			}
			
			else
				System.out.println("id not found");
				break;
		}
	}
	
	public void aesOrder()
	{
		double temp;
        for (int i = 0; i < id.length; i++) 
        {
            for (int j = i + 1; j < id.length; j++) 
            {
                if (factory[i] > factory[j]) 
                {
                    temp = factory[i];
                    factory[i] = factory[j];
                    factory[j] = temp;
                }
            }
        }
        System.out.print("Lowest price order:");
        for (int i = 0; i < id.length - 1; i++) 
        {
            System.out.print(factory[i] + ",");
        }
        System.out.print(factory[id.length - 1]);
        System.out.println("");
    }
	
	public void sortedDisplay()
	{
		double temp;
        for (int i = 0; i < id.length; i++) 
        {
            for (int j = i + 1; j < id.length; j++) 
            {
                if (factory[i] < factory[j]) 
                {
                    temp = factory[i];
                    factory[i] = factory[j];
                    factory[j] = temp;
                }
            }
        }

        
        System.out.printf("id\t name\t quant\t price\t\n ");
		for(int i = 0;i<name.length;i++)
		{
			
			System.out.printf("%d\t %s\t %.2f\t %.2f\t\n ",id[i],name[i],quant[i],factory[i]);
		}
	}
}


