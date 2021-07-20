public class CarInsurance
{
	private long driverID;
	private String carModel;
	
	public CarInsurance(long id, String car)
	{
		setID(id);
		setCarModel(car);
		
	
	}
	public void setID(long drID)
	{
		if((Long.toString(drID)).length()==13)
			driverID = drID;
		else
			driverID = 0000000000000;

	}
	public void setCarModel(String car)
	{
		carModel= car;
	}
	public long getDriverID()
	{
		return driverID;
	}
	
	public String getCarModel()
	{
		return carModel;
	}
	public String toString()
	{
		return "Driver ID: "+getDriverID()+"\nCar Model: "+getCarModel();
	}
	

}