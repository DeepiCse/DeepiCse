import java.io.*;
import java.lang.*;
import java.util.*;

class cricket
{
	public static void main(String [] args)
	{
		HashMap<Integer,String> ind=new HashMap<Integer,String>();
		HashMap<Integer,String> pak=new HashMap<Integer,String>();
		HashMap<Integer,String> aus=new HashMap<Integer,String>();
	  Scanner scan=new Scanner(System.in);
	  int n=0,count=0,z,y,ovr,wik=0,x,oppsc=0,mysc=0,count3=0,rem,i;
	  String s1,s2;
	  s1="";
	  s2="";
	  
	  while(count<=1)//for selecting team
	  {
		  if(count==0)
		  {
			System.out.println("\nCHOOSE YOUR TEAM\n1.India\n2.Pakistan\n3.Australia\n");
			n=scan.nextInt();
			if(n==1){s1="India";}
			else if(n==2){s1="Pakistan";}
			else{s1="Australia";}
		  }
		  else
		  {
			  System.out.println("\nCHOOSE OPPONENT TEAM\n1.India\n2.Pakistan\n3.Australia\n");
				  n=scan.nextInt();
				  if(n==1){s2="India";}
				  else if(n==2){s2="Pakistan";}
				  else{s2="Australia";}
		  }
	  
	  switch(n)
	  {
		  case 1:
		  {
			  System.out.println("\nINDIAN SQUAD\n-----------------------------------");
			  //System.out.println("\nINDIAN SQUAD\n------------\n1.Virat Kohli(Captain)\n2.Rohit Sharma\n3.Shikhar Dhawan\n4.Ajinkya Rahane\n5.Shreyas Iyer\n6.Manish Pandey\n7.Kedar Jadhav\n8.MS Dhoni(wk)\n9.Dinesh Karthik\n10.Hardik Pandya\n11.Kuldeep Yadav\n12.Yuzvendra Chahal\n13.Mohammed Shami\n14.Jasprit Bumrah\n15.Bhuvaneshwar Kumar\n");
			  ind.put(1,"Virat kohli(cap)"); ind.put(2,"Rohit Sharma"); ind.put(3,"Shikar Dhawan"); ind.put(4,"Ajinkya Rahane"); ind.put(5,"Shreyas Iyer"); ind.put(6,"Manish Pandey"); ind.put(7,"Kedar Jadhav"); ind.put(8,"MS Dhoni(wk)"); ind.put(9,"Dinesh Karthik"); ind.put(10,"Hardik Pandya"); ind.put(11,"Kuldeep Yadav"); ind.put(12,"Yuzvendra Chahal");
			  ind.put(13,"Jasprit Bumrah"); ind.put(14,"Mohammad Shami"); ind.put(15,"Bhuvaneshwar Kumar");
			  
			  for(Map.Entry m:ind.entrySet())
			  {  
				System.out.println(m.getKey()+" "+m.getValue());  
			  }  
			  System.out.println("\nCHOOSE YOUR BEST 11 BY REMOVING 4 PLAYERS\n");
			  
			  for(i=0;i<4;i++)
			  {
				  rem=scan.nextInt();														//for selecting best 11
				  ind.remove(rem);
			  }
			  
			  System.out.println("\nINDIAN TEAM\n-----------");
			  for(Map.Entry m:ind.entrySet())
			  {  
				System.out.println(m.getValue());  
			  } 
			  
			  

			  
		  }break;
		  
		  case 2:
		  {
			  System.out.println("\nPAKISTAN SQUAD\n-----------------------------------");
			  //System.out.println("\nPAKISTAN SQUAD\n--------------\n1.Sarfraz Ahmed(captain,wk)\n2.Azhar Ali\n3.Fakhar Zaman\n4.Imam Ul Haq\n5.Babar Azam\n6.Shoaib Malik\n7.Muhammad Hafeez\n8.Haris Sohail\n9.Faheem Ashraf\n10.Shadab Khan\n11.Mohammad Nawaz\n12.Mohammad Amir\n13.Hasan Ali\n14.Aamir Yamin\n15.Rumman Raees\n");
			  pak.put(1,"Sarfraz Ahmed(captain,wk)"); pak.put(2,"Azhar Ali"); pak.put(3,"Fakhar Zaman"); pak.put(4,"Imam Ul Haq"); pak.put(5,"Babar Azam"); pak.put(6,"Shoaib Malik"); pak.put(7,"Muhammad Hafeez"); pak.put(8,"Haris Sohail"); pak.put(9,"Faheem Ashraf"); pak.put(10,"Shadab Khan"); pak.put(11,"Mohammad Nawaz"); pak.put(12,"Mohammad Amir");
			  pak.put(13,"Hasan Ali"); pak.put(14,"Aamir Yamin"); pak.put(15,"Rumman Raees");
			  
			  for(Map.Entry u:pak.entrySet())
			  {  
				System.out.println(u.getKey()+" "+u.getValue());  
			  }  
			  System.out.println("\nCHOOSE YOUR BEST 11 BY REMOVING 4 PLAYERS\n");
			  
			  for(i=0;i<4;i++)
			  {
				  rem=scan.nextInt();														//for selecting best 11
				  pak.remove(rem);
			  }
			  
			  System.out.println("\nPAKISTAN TEAM\n---------------");
			  for(Map.Entry u:pak.entrySet())
			  {  
				System.out.println(u.getValue());  
			  } 
		  }break;
		  
		  case 3:
		  {
			  System.out.println("\nAUSTRALIAN TEAM\n-----------------------------------");
			  //System.out.println("\nAUSTRALIAN SQUAD\n----------------\n1.Steve Smith(captain)\n2.David Warner\n3.Ashton Agar\n4.Hilton Cartwright\n5.Nathan Coulter-Nile\n6.Patrick Cummins\n7.James Faulkner\n8.Aaron Finch\n9.Josh Hazlewood\n10.Travis Head\n11.Glenn Maxwell\n12.Marcus Stoinis\n13.Matthew Wade(wk)\n14.Adam Zampa\n15.Mitchell starc\n");
			  aus.put(1,"Steve Smith(captain)"); aus.put(2,"David Warner"); aus.put(3,"Ashton Agar"); aus.put(4,"Hilton Cartwright"); aus.put(5,"Nathan Coulter-Nile"); aus.put(6,"Patrick Cummins"); aus.put(7,"James Faulkner"); aus.put(8,"Aaron Finch"); aus.put(9,"Josh Hazlewood"); aus.put(10,"Travis Head"); aus.put(11,"Glenn Maxwell"); aus.put(12,"Marcus Stoinis");
			  aus.put(13,"Matthew Wade(wk)"); aus.put(14,"Adam Zampa"); aus.put(15,"Mitchell starc");
			  
			  for(Map.Entry v:aus.entrySet())
			  {  
				System.out.println(v.getKey()+" "+v.getValue());  
			  }  
			  System.out.println("\nCHOOSE YOUR BEST 11 BY REMOVING 4 PLAYERS\n");
			  
			  for(i=0;i<4;i++)
			  {
				  rem=scan.nextInt();														//for selecting best 11
				  aus.remove(rem);
			  }
			  
			  System.out.println("\nAUSTRALIAN TEAM\n---------------");
			  for(Map.Entry v:aus.entrySet())
			  {  
				System.out.println(v.getValue());  
			  } 
		  }break;
	  }
	  
	  count++;
	  }
	  
	  System.out.println("\nCHOOSE HOW MANY OVERS\n---------------------\n");
	  ovr=scan.nextInt();
	  System.out.println("\nCHOOSE YOUR SIDE FOR TOSS \n1.Head \n2.Tail\n----------\n");
	  z=scan.nextInt();
	  
	  if (Math.random() < 0.5)//for toss
	  {
			System.out.println(s1+"  WON THE TOSS\n1.Bat\n2.Bowl\n----------\n");
			y=scan.nextInt();
			switch(y)
			{
				case 1:
				{
					mysc=batting(ovr,s1);
					count3++;
					
				}break;
				
				case 2:
				{
					oppsc=batting(ovr,s2);
					
				}break;
			}
			
	  }
	  else
	  {
			System.out.println(s2+"  WON THE TOSS & THEY CHOOSE TO BAT FIRST\n------------------------------------------------\n");
			oppsc=batting(ovr,s2);
			
	  }		
	  
	  
	  System.out.print("\nINNINGS BREAK\nPRESS 1 TO BAT->\t");
	  x=scan.nextInt();
	  if(count3==0)
	  {
		  mysc=batting(ovr,s1);
	  }
	  else
	  {
		  oppsc=batting(ovr,s2);
	  }
	  
	  
	  
	  
	  System.out.println("MATCH COMPLETED\n");
	  if(mysc>oppsc)
	  {
		  System.out.println(s1+"  WON THE MATCH ");
	  }
	  else
	  {
		  System.out.println(s2+" WON THE MATCH ");
	  }
	  
	  
	}
	
	
	
	public static int batting(int a,String s)//for batting
	{
		int count1=0,count2=0;
		Random rand=new Random();
		System.out.println();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<6;j++)
			{
				int r=rand.nextInt(9);
				
				if(r==5)
				{
					System.out.print("out\t");
					count1++;
					
				}
				else if(r==7)
				{
					System.out.print("0Wd\t");
					j--;
					count2=count2+1;
				}
				else if(r==8)
				{
					System.out.print("0NB\t");
					j--;
					count2=count2+1;
				}
				else
				{
					System.out.print(r+"\t");
					count2=count2+r;
				}
				
				if(count1==10)
				{
					break;
				}
				
			}
			System.out.println();
			System.out.println();
			if(count1==10)
			{
				break;
			}
			
		}
		System.out.println(s+"  SCORE IS:"+count2+"/"+count1);
		System.out.println("----------------------------------------------------------------------------");
		return count2;
	}

}

