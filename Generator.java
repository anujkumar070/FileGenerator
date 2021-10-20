 
import java.io.FileWriter;  
import java.util.*;
public class Generator {  
    public static void main(String args[]){ 
    	int n;
    	System.out.println("Enter the number files you want to generate");
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
    	for(int i=1;i<=n;i++)
	    	{
	    	
	         try{ 
	        	 //Enter your destination folder here!!!!!!!!!!!!!!!!!!!!!!!!!!
	        	 //Also Don't forgot to replace "\" with "/" in address as Java may give error if address has "\" in it.!!!!!!!!!!!!
	        	 String file_name="//Enter your folder location here//"+i+".txt";
	           FileWriter fw=new FileWriter(file_name);  
	           String text="";
	           
	           String p1="German was a German colonial protectorate established in 1884 in the northeastern part of the island of New Guinea and several nearby island groups. The German New Guinea Company was founded in Berlin by Adolph von Hansemann and a syndicate of German bankers for the purpose of colonizing and exploiting the protectorate's resources";
	           String p2="Forces of the First Crusade arrived at Antioch, beginning an eight-month siege of the city.\r\n" + 
	           		"1740 – Under the terms of the Pragmatic Sanction, Maria Theresa (pictured) ascended the Habsburg throne.\r\n" + 
	           		"1951 – African-American college football player Johnny Bright was the victim of an on-field assault that eventually provoked changes in NCAA football rules that mandated the use of more protective helmets with face guards";
	           String p3=" of 4 Times Square, made partly of glass and partly of stone, was compared to the two-faced god Janus?\r\n" + 
	           		"... that the first prayer of \"Hilf, Herr meines Lebens\", a Christian song written ";
	           for(int j=0;j<5555;j++)
	           {
	        	   int r= (int)(65+(Math.random()*(125-65+1)));
	        	   char s=(char)(r);
	        	   text=text+s;
	        	   //int k=(int)((Math.random()*200)+1);
	        	   if(j%1111==0)
	        	   {
	        		   text=text+"\n"+p1;
	        	   }
	        	   if(j%2222==0)
		        	   {
		        		   text=text+"\n"+p2;
		        	   }
	        	   
	        	   if(j%3333==0)
	        		   
		        	   {
		        		   text=text+"\n"+p3;
		        	   }
	        	   
	        	   
	           }
	           fw.write("This is file. " +
	           "It is written in English probably"+"This is an Demo file for an Assignment file "+text+"This marks the conclusion");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
    }
}
