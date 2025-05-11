

public class TestClass {

	public static void main(String[] args) {
		
		
		Inventory autoInventory = new Inventory();
		Automobile auto = new Automobile (1, "model", "color", "make", 12, 12345);
		Automobile car = new Automobile (2, "bmw", "yellow", "sedan", 123, 5321);
		Automobile truck = new Automobile (3, "ford", "black", "truck", 456, 45612);
		
		autoInventory.addVehicle(auto);
		autoInventory.addVehicle(car);
		autoInventory.addVehicle(truck);
		
		
								
		//autoInventory.removeVehicle(truck);
		//autoInventory.addVehicle();
		//autoInventory.updateVehicle();
		
		autoInventory.printFile();
	}

}
