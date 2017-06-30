//Write a program to print the “X” pattern

package com.acadgild.assignment3;

public class Assignment3 {

	//main method 
		public static void main (String args[]){
			
			 int i,j;
			
			 //For loop to print upper half part of X
			 for(i=3; i>=1; i--)
			 {
		        //Prints trailing spaces
		        for(j=i; j<3; j++)
		        {
		        	System.out.print(" ");
		        }
		 
		        //Prints upper part
		        for(j=1; j<=(2*i-1); j++)
		        {
		            if(j==1 || j==(2*i-1))
		            {
		            	System.out.print("*");
		            }
		            else
		            {
		            	System.out.print(" ");
		            }
		        }
		 
		        System.out.print("\n");
			 }
			
			 	//For loop to print lower part
			 	for(i=2; i<=3; i++)
			 	{
			 	//Prints trailing spaces
		        for(j=i; j<3; j++)
		        {
		        	System.out.print(" ");
		        }
		 
		        //Prints lower part
		        for(j=1; j<=(2*i-1); j++)
		        {
		            if(j==1 || j==(2*i-1))
		            {
		            	System.out.print("*");
		            }
		            else
		            {
		            	System.out.print(" ");
		            }
		        }
		 
		        System.out.print("\n");
		    }
			
		}
	}
