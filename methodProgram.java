import java.util.Scanner;
/**
 * methods programming exercise
 *
 * @Manaal Lakhani
 * @April 26 2024
 */
public class methodProgram
{
    /**
     * This method accepts 2 integers: x and y
     * then returns the product of the integers.
     */
    public static void product() {
        Scanner scan = new Scanner(System.in);
            // Creates a new scanner. 
        
        System.out.println("Enter the first number: ");
            int intx = scan.nextInt();
                // Prompts user to enter the first number and saves it as an int, "intx".
        System.out.println("Enter the second number: ");
            int inty = scan.nextInt();
                // Prompts user to enter the second number and saves it as an int, "inty".
           
        scan.close();      
            // Closes the scanner 
            
        int product = intx * inty;
            // A new int named "product" is equals to intx and inty multiplied together.
        
        System.out.println("The product of the two numbers is " + product +"!");
            // Prints out the product of the two numbers.
    }
    /**
     * This method accepts 1 integer: the temperature in celsius,
     * then returns the temperature in fahrenheit
     */
    public static void toFahrenheit(){
        Scanner scan = new Scanner(System.in);
            // Creates a new scanner.
        System.out.println("Enter a temperature in degrees celsius: ");
            double c = scan.nextDouble();
                // Prompts the user to enter a temperature in degrees celsius, then saves it as a double, "c".
       
        scan.close();
            // Closes the scanner 
                
        double f = c* 9/5 + 32;
            // A double "f", which is the temperature in fahrenheit which is the temp in celsius times 9/5, then added with 32.
        
        System.out.println("In fahrenheit, your temperature is " + f + "°!");
            // Prints out the temperature in farenheit.
    }
    /**
     * This method accepts 1 integer: the temperature in fahrenheit,
     * then returns the temperature in celsius 
     */
    public static void toCelsius(){
        Scanner scan = new Scanner(System.in);
            // Creates a new scanner.
        System.out.println("Enter a temperature in degrees fahrenheit: ");
            double f = scan.nextDouble();
                // Prompts the user to enter a temperature in degrees farenheit, then saves it as a double, "f".
        
        scan.close();
            // Closes the scanner 
        
        double c = (f - 32) * 5/9;
            // A double "c", which is the temperature in celsius which is the temp in farenheit subtracted by 32, then times 5/9.
        
        System.out.println("In celsius, your temperature is " + c + "°!");
            //Prints out the temperature in celsius. 
    }
    /**
     * This method accepts 2 integers: i (initial amount of bacteria), t (time in hours).
     * Then since the  bacteria doubles every hour, it will return the amount of bacteria after t hours.
     */
    public static void bacteria(){
        Scanner scan = new Scanner(System.in);
            // Creates a new scanner.
        System.out.println("Enter the intial amount of bacteria to start with: ");
            double i = scan.nextDouble();
                // Prompts the user to enter the initial amount of bacteria to start and saves it as a double "i".
        System.out.println("Enter the amount of time in hours to let the bacteria double for: ");
            double t = scan.nextDouble();
                // Prompts the user to enter the amount of time in hrs to let the bacteria double for and saves it as "t.
        
        scan.close();
            // Closes the scanner 
        
        double p = i * Math.pow(2,t);
            // To create the product/ result of the bacteria doubling, it multiplies i (initial bacteria) to 2 to the power of t (the amount of time).
        
        System.out.println("The amount of bacteria after " + t + " hours is " + p + "!");
            // Prints out the result of the amount of bacteria along with how many hours we let it double for
        }
    /**
     * This method accepts 1 integer, the amount of money in cents
     * Then returns the minimum number of coins required to make up the amount.
     * For example, an amount of 116 would return 7 (4 quarters + 1 dime + 1 nickel + 1 penny) 
     */
    public static void coins(){
        Scanner scan = new Scanner(System.in);
            //Creates a new scanner. 
        System.out.println("Enter the amount of money you have in cents: ");
            int amount = scan.nextInt();
                // Prompts user to enter the amount of money the user has in cents 
        
        scan.close();
            // Closes the scanner 
        
        final int quarterValue = 25;
        final int dimeValue = 10;
        final int nickelValue = 5;
        final int pennyValue = 1;
            // saves the coin price value as a final integer that cannot be changed (value in cents)
        
        int amountOfQuarters = 0;
        int amountOfDimes = 0;
        int amountOfNickels = 0;
        int amountOfPennies = 0;
            // Sets the amount of the coins to 0.
        
        amountOfQuarters = amount / quarterValue;
        amount %= quarterValue;
            // Calculates the amount of quarters by dividng the amount (which is provided by the user) by the quartervalue (price)
            // Then makes the amount the modulus from the quarter value
        
        amountOfDimes = amount / dimeValue;
        amount %= dimeValue;
            // Calculates the amount of dimes by repeating the same process.
        
        amountOfNickels = amount / nickelValue;
        amount %= nickelValue;
            // Calculates the amount of nickel by repeating the same process.
        
        amountOfPennies = amount;
            // Calculates the amount of pennies from making it equal to the amount leftover
        
        int totalOfCoins = amountOfQuarters + amountOfDimes + amountOfNickels + amountOfPennies;
            // Calculates the total amount of coins by adding the amount of all the coins together 
            
        System.out.println("The amount of quarters is: " + amountOfQuarters);
        System.out.println("The amount of dimes is: " + amountOfDimes);
        System.out.println("The amount of nickels is: " + amountOfNickels);
        System.out.println("The amount of pennies is: " + amountOfPennies);
            // Prints out the amount of all the coins on individual lines
        
        System.out.println("--------------------------------");
            // Prints out a divider with dashes
        
        System.out.println("The total amount of coins is: " + totalOfCoins);
            // Prints out the total amount of coins 
    }
    /**
     * This method accepts 1 integer (the number of cookies that you want)
     * Then calculates and returns the total cost in cents according to the rules that:
     * A single cookie costs 25 cents.
     * A box of 12 cookies costs 180 cents
     * A carton of 6 boxes of cookies costs 864 cents.
     * Example output: The cost of 99 cookies is 1299 (864 + 360 + 75) -> Includes (1 carton, 2 boxes, 3 single cookies) 
     */
    public static void cookie(){
        Scanner scan = new Scanner(System.in);
            //Creates a new scanner. 
        System.out.println("Enter the amount of cookies you want: ");
            int numberOfCookies = scan.nextInt();
                // Prompts the user to enter the amount of cookies you want and saves it as "number of cookies"
            
        scan.close();
            // Closes the scanner 
        
        int numberOfCartons = numberOfCookies / (6 * 12);
        int numberOfBoxes = (numberOfCookies % (6 * 12)) / 12;
        int numberOfSingleCookies = (numberOfCookies % (6 * 12)) % 12;  
            // Calculates the number of cartons, boxes and single cookies
        
        int totalCosts = (numberOfCartons * 864) + (numberOfBoxes * 180) + (numberOfSingleCookies * 25);
            // Calcualates the total cost of all of the cartons, boxes, and single cookies
        
        System.out.println("The cost of "+ numberOfCookies + " cookies is " + totalCosts + " cents.");
            // Prints the total cost in cents
    }
    /**
     * This method returns the distance from point (x1,y1) to another point (x2, y2)
     */
    public static void distance(){
        Scanner scan = new Scanner (System.in);
            // Creates a new scanner 
        
        System.out.println("Enter the x1: ");
            double x1 = scan.nextDouble();
                // Prompts the user to enter the x1 and saves it as a double 
        
        System.out.println("Enter the y1: ");
            double y1 = scan.nextDouble();
                // Prompts the user to enter the y1 and saves it as a double 
        
        System.out.println("Enter the x2: ");
            double x2 = scan.nextDouble();
                // Prompts the user to enter the x2 and saves it as a double 
    
        System.out.println("Enter the y2: ");
            double y2 = scan.nextDouble();
                // Prompts the user to enter the y2 and saves it as a double 
        
        scan.close();
            // Closes the scanner 
        
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            // Calculates the distance by using the distance formula
        
        System.out.println("The distance between the points is " + distance);
            // Prints out the distance between the points
    }
    /**
     * This method takes a date: m (month), d (day), and y (year), and returns the day of the week that this date falls on.
     */
    public static void dayOfTheWeek(){
        Scanner scan = new Scanner(System.in);
            // Creates a new scanner
        
        System.out.println("Enter the month (1-12): ");
            int m = scan.nextInt();
                // Prompts user to enter the month in numbers 1 to 12 and saves it as an int m
            
        System.out.println("Enter the day: ");
            int d = scan.nextInt();
                // Prompts user to enter the day and saves it as int d
            
        System.out.print("Enter the year: ");
            int y = scan.nextInt();
                // Prompts user to enter the year and saves it as int y
        
        scan.close();
            // Closes the scanner 
        
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/ 12) % 7;
            // Calculates y0, x, m0, and d0, using the formula provided
        
        String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayName = daysOfTheWeek[d0];
            // Saves the days of the week as strings
        
        System.out.print("The day of the week for " + m + "/" + d + "/" + y + " is " + dayName);
            // Prints out what day of the week the provided date by the user falls on
    }
}