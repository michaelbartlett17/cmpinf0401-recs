public class Truck extends Vehicle { 
    protected int hauling;
    protected int seating;

    public void setSeating(int seating)
    {
        this.seating = seating;
    }

    public void setHauling(int hauling)
    {
        this.hauling = hauling;
    }

    public int getSeating()
    {
        return seating;
    }

    public int getHauling()
    {
        return hauling;
    }

    public void stats(){
		System.out.println("Vehicle Make: " + make);
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println("Vehicle seating capacity: " + seating); //extra line of output to show the extra datafield
        System.out.println("Vehicle Hauling Capacity: " + hauling);
		System.out.println(notes);
        // add line to print out the vclass;
		
		
	}
    
}
