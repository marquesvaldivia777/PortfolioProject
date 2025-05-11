import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	ArrayList<Automobile> autoInventory;
	
	public Inventory () {
		autoInventory = new ArrayList<>();
	}

	public void addVehicle (Automobile auto1) {
		autoInventory.add(auto1); 
		System.out.println("Vehicle added successfully");
		System.out.println(autoInventory);
		System.out.println();
	} 
	
	public void addVehicle () {
		Scanner scnr = new Scanner(System.in); 
		try {
			System.out.println("Please enter vehicle informatin");
			System.out.println("Please enter Vehicle Vin Number");
			int VinNumber = scnr.nextInt();
			scnr.nextLine();
			System.out.println("Please enter vehicle model");
			String Model = scnr.nextLine();
			System.out.println("Please enter vehicle color");
			String Color = scnr.nextLine();
			System.out.println("Please enter vehicle make");
			String Make = scnr.nextLine();
			System.out.println("Please enter vehicle year");
			int Year = scnr.nextInt();
			System.out.println("Please enter vehicle mileage");
			int Mileage = scnr.nextInt();
			scnr.nextLine();
			
			Automobile auto2 = new Automobile (VinNumber, Model, Color, Make, Year, Mileage);
			autoInventory.add(auto2);
			
			System.out.println("Vehicle added successfully");
			System.out.println(autoInventory);
			System.out.println();
			
		} catch(Exception e) {System.out.println("Add Vehicle Failed Try Again!!!");
		scnr.close();}
		
	}		
	
	public void removeVehicle (Automobile auto) {
		int index = autoInventory.indexOf(auto);
		autoInventory.remove(index);
		System.out.println("Vehicle Removed Successfully");
		System.out.println(autoInventory);
	}
	
	public void removeVehicle () {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter Vin Number of Vehicle");
		int vinNumber = scnr.nextInt();
			try {
				for (Automobile car : autoInventory ) {
					
					if (car.getVinNumber() == vinNumber) {
					int index = autoInventory.indexOf(car);	
					autoInventory.remove(index);
					System.out.println("Vehicle Removed Successfully");
					System.out.println(autoInventory);
					System.out.println();
					}	
				}			
				}
				catch (Exception e) {
					System.out.println();
			}
			
		scnr.close();	
		}
	
	public void updateVehicle () {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter Vin Number of Vehicle you wish to update");
		int vinNumber = scnr.nextInt();
		scnr.nextLine();
		for (Automobile car : autoInventory) {
			if (car.getVinNumber() == vinNumber) {
				System.out.println("Please update car details starting with the Model");
				String Model = scnr.nextLine();
				System.out.println("Please enter updated Color");
				String Color = scnr.nextLine();
				System.out.println("Please enter updated Make");
				String Make = scnr.nextLine();
				System.out.println("Please enter updated Mileage");
				int Mileage = scnr.nextInt();
				car.setModel(Model);
				car.setColor(Color);
				car.setMake(Make);
				car.setMileage(Mileage);
				System.out.println("Vehicle Updated Successfully");
				System.out.println(autoInventory);
				scnr.close();
				
			}
		}
		
	}
	
	public void printFile() {
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to print to a file: yes/no ");
		String input = s.next();
		
		if (input.equalsIgnoreCase("yes")) {
		try {
			FileWriter writer = new FileWriter ("Inventory1.txt");
			for (Automobile a : autoInventory) {
				writer.write("Vin Number: " + a.getVinNumber());
				writer.write("\n\tMake: " + a.getMake());
				writer.write("\tColor: " + a.getColor());
				writer.write("\tModel: " + a.getModel());
				writer.write("\n\tYear: " + a.getYear());
				writer.write("\tMileage: " + a.getMileage());
				writer.write("\n");
			}
			writer.close();
			
		}
		catch (IOException e) {e.printStackTrace();}
		
	} else {System.out.println("Okay");}
	
		s.close();
	}
}
