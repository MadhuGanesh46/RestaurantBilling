package Project;

import java.util.Scanner;

public class Restaurant {
	 public static void main(String[] args) {
		  int sum=0; 
	        Scanner sc = new Scanner(System.in);
	        int qty[] = new int[11];
	        String[] s = new String[] {"idly    ","wada    ","dosa    ","puri     ","friedrice",
	        		                   "noodels ","bonda     ","tea   ","coffee    ","water   ","Quit     "};
    		int rate[] = new int[]{30,35,40,30,80,70,25,10,15,20,0};
    		
    		
		
    	    System.out.println("ITEMList"+"\t\tPrice");
			for(int i=0;i<11;i++)
	            System.out.println((i+1)+"."+s[i]+"\t\t"+rate[i]);
			
			
			boolean quit = true;
	        do{
	        	System.out.println(" ");
	             System.out.println("Enter your choice from above list: ");
	            int j=sc.nextInt();
	           
		    if(j>0 && j<11)
		    {
		   
			System.out.println("enter the no of quantites of "+s[j-1]);
	                 int q=sc.nextInt();
		         qty[j-1]+=q;
		    	
		    }
		    else
		    {
	               quit=false;
	              
	         }
	        
	        }while(quit);
		
		   
	        System.out.println("Your Orders are:\n");
	        System.out.println("ITEM   "+"Price   "+"qty   "+"SubTotal   ");
		    for(int i=0;i<10;i++)
		    {
	             if(qty[i]!=0)
	           
		     {
	            	
		      sum=sum+qty[i]*rate[i];
		         
	              System.out.println(s[i] +"  "+ rate[i]+"   *   "+qty[i]+"  == "+qty[i]*rate[i]+"rs");
		     }
		    }
	        System.out.println(" ");  
	        System.out.println("Your total bill="+sum);
	        System.out.println(" ");
	         System.out.println("Thank you Visit Again");
	    
	    }
}
