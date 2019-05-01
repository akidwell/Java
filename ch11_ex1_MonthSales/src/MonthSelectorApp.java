import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String [] monthName = new String [12];
        monthName [0]= "January";
        monthName [1]= "February";
        monthName [2]= "March";
        monthName [3]= "April";
        monthName [4]= "May";
        monthName [5]= "June";
        monthName [6]= "July";
        monthName [7]= "August";
        monthName [8]= "September";
        monthName [9]= "October";
        monthName [10]= "November";
        monthName [11]= "December";
        		
        
        double [] monthSales = new double [12];
        monthSales [0] = 10.00;
        monthSales [1] = 20.00;
        monthSales [2] = 30.00;
        monthSales [3] = 40.00;
        monthSales [4] = 50.00;
        monthSales [5] = 60.00;
        monthSales [6] = 70.00;
        monthSales [7] = 80.00;
        monthSales [8] = 90.00;
        monthSales [9] = 100.00;
        monthSales [10] = 200.00;
        monthSales [11] = 300.00;
        

        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales   
            
       
            //Arrays.sort(monthName);
            //int index = Arrays.binarySearch(monthName, "December");
            System.out.println(monthName[monthNumber]);
            System.out.println(monthSales[monthNumber]);
            
            
            


            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        
        
        Console.displayLine();
    }    

}
