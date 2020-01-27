package com.ex.arrays;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int number=20;  
		     
		 switch(number){  
		     
		    case 10: System.out.println("10");  
		    break;  
		    case 20: System.out.println("20");  
		    break;  
		    case 30: System.out.println("30");  
		    break;  
		      
		    default:System.out.println("Not in 10, 20 or 30");  
		 } 
		 
		 for(int i=1;i<=10;i++){  
			 if(i==5){  
		            //breaking the loop  
				 break;  
		      }  
		        System.out.println(i);  
		 }  
		 
		 for(int i=1;i<=10;i++){  
		     if(i==5){  
		            //using continue statement  
		       continue;//it will skip the rest statement  
		     }  
		     System.out.println(i);  
		 }  

	}

}
