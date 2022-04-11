import java.util.*;
// Add necessary import for java io
public class Fleet{
	
	public static void main(String[] args){ // throws Exception; // necessary for file access
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); // create an arraylist of our objects we create from the Vehicle class
		Scanner in = new Scanner(System.in);
		System.out.print(" "); // Change this to ask the user for the name of the db file
		int numVehicles; // Don't need an int numVehicles anymore, change this to be a String that stores the name of the db file.
		int count = numVehicles = in.nextInt(); // Don't need a count variable anymore, get rid of this line.

		// Initialize a SECOND SCANNER called dbread to read the file "db"
		
		while (count > 0) // Change this while loop, instead of using count, make it run until you reach the end of the file
		{
			// Save the line to a string variable and split it, by a space -> line = DBread.nextLine() 
			//																	String[] line = line.split("\\s+");
			// Save the vClass -> line[0]
			// Do if tests to check what the vClass is, then use the proper setters for each type of vehicle
			// Make the last line in the if an add call on the vehicles arrayList
		}


		// Use your input scanner to ask the user for the type of vehicle class they would like to list and save to a variable called "search"
		// Initialize a count variable
		
		System.out.println("Now we will go through all the objects created from the superclass Vehicle");
		for (Vehicle v : vehicles)
	/* 	{
			if v.getvclass() is equal to search
			{
				increment count
				v.stats(); 
			}
		}

		System.out.println( count + " vehicles of the " + search + " class have been found and returned by your search");
			
		*/
		in.close();
		// Close dbRead()

		
	}
	
}

/*

Sample Output:
michaelbartlett@Michaels-MacBook-Pro-2 solution-A-5 % java Fleet  
What's the name of the db file? VDB.txt
What vehicle class would you like to list?(C: Car, T: Truck, MC: Motorcycle, B: Bus, CT: Commercial Truck): C
Now we will go through all the objects created from the superclass Vehicle
Vehicle Make: TESLA
Vehicle model name: MODELS
Vehicle model year: 2020
Vehicle vClass: C
Vehicle weight is: 2700
Vehicle color is: Cobalt
Vehicle EPA rated MPG: 75.0
Vehicle seating capacity: 4
System notes: 

Vehicle Make: FORD
Vehicle model name: FIESTA
Vehicle model year: 2021
Vehicle vClass: C
Vehicle weight is: 2600
Vehicle color is: Red
Vehicle EPA rated MPG: 29.0
Vehicle seating capacity: 2
System notes: 

Vehicle Make: FORD
Vehicle model name: MUSTANG
Vehicle model year: 2017
Vehicle vClass: C
Vehicle weight is: 2950
Vehicle color is: Silver
Vehicle EPA rated MPG: 25.0
Vehicle seating capacity: 4
System notes: 

Vehicle Make: SATURN
Vehicle model name: SL2
Vehicle model year: 2002
Vehicle vClass: C
Vehicle weight is: 2600
Vehicle color is: Blue
Vehicle EPA rated MPG: 24.0
Vehicle seating capacity: 5
System notes: 

4 vehicles of the C class have been found and returned by your search

*/
