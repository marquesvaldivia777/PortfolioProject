
public class Automobile {
	private int VinNumber;
	private String Model;
	private String Color;
	private String Make;
	private int Year;
	private int Mileage;

	//default constructor
	public Automobile () {
		this.VinNumber = 0;
		this.Model = null;
		this.Color = null;
		this.Make = null;
		this.Year = 0;
		this.Mileage = 0;
	}
	//parametrized constructor
	public Automobile (int VinNumber, String Model, String Color, String Make, int Year, int Mileage) {
		this.VinNumber = VinNumber;
		this.Model = Model;
		this.Color = Color;
		this.Make = Make;
		this.Year = Year;
		this.Mileage = Mileage;
	}
	
	//getters and setters
	public int getVinNumber() {
		return VinNumber;
	}
	public void setVinNumber(int vinNumber) {
		VinNumber = vinNumber;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	
	@Override
	public String toString () {
		return "Vin Number : " + VinNumber +"\n\tModel: " + Model + "\tColor: " 
				+ Color + "\tMake: " + Make + "\n\tYear : " + Year + "\tMileage: " + Mileage + "\n";
	}
	
	
}
