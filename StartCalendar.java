/*
            * Jessie Alvey
            * Max
            * B?
            *
            * Assignment #4 - StartCalendar, CSc 210, Spring 2017
            * this program will take 2 user inputs and print a calendar
            * according to how many days and which day of the week the user 
            * tells it to start on
            */

package SingleMonth;
import java.util.*;

public class StartCalendar {


	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int monthLength, startDay, programFin = 0, count = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number of days in month (1-31): ");
		monthLength = scan.nextInt();
		System.out.print("Day of the week to start on (1-7): ");
		startDay = (scan.nextInt() - 1);
		
		printMonth(monthLength, startDay);
		

	}
	
	
	/*
	* printMonth
	* print the calendar looking text
	*
	* Arguments:
	* int monthLength - how many days are in the month
	*...
	* int startDay - day of the week the calendar should start on
	*
	* Return Value - void */
	private static void printMonth(int monthLength, int startDay)
	{
	           //Printing headers
	System.out.println(" Su  Mo  Tu  We  Th  Fr  Sa \n --  --  --  --  --  --  -- \n");
	          
	           //Printing the calendar
	          
	           //Skipping until firstDay
	           for (int i = 0; i < startDay; i++)
	               System.out.print("    ");
	          
	           //Printing calendar
	           for (int i = 1; i <= monthLength; i++)
	           {
	               //Printing day number
	               System.out.printf(" %2d ", i);
	              
	               //if end of the week is reached, reset first day to 0
	               if (((i + startDay) % 7 == 0) || (i == monthLength))
	                   System.out.println();
	           }
	}
	  
	
	

}
