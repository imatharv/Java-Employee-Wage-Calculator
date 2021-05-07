public class EmployeeWage {

	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	public final String companyName;
	public final int empWagePerHour;
	public final int workingDays;
	public final int workingHours;

	public EmployeeWage(String companyName, int empWagePerHour, int workingHours, int workingDays)
	{
		this.companyName = companyName;
		this.empWagePerHour = empWagePerHour;
		this.workingHours = workingHours;
		this.workingDays = workingDays;
	}

	public int calculateWage() 
	{
		int empHours = 0;
		int empWage = 0;
		int totalWorkingDays = 0;
		int totalEmpWage = 0;
		int totalWorkingHours = 0;

		while(totalWorkingHours<workingHours && totalWorkingDays<workingDays)
		{	
			totalWorkingDays++;
			int empCheck=((int)Math.floor(Math.random()*10))%3;
			switch(empCheck)
			{
				case isFullTime:
					empHours = 8;
					break;
				case isPartTime:
					empHours = 4;
					break;
				default:
					empHours = 0;
			}
			totalWorkingHours += empHours;
		}
		return totalWorkingHours * empWagePerHour;
	}

	public static void main(String[] args)
	{
		EmployeeWage dmart = new EmployeeWage("Dmart", 20, 100, 30);
		EmployeeWage walmart = new EmployeeWage("Walmart", 30, 100, 30);
		System.out.println("Total employee's wage of " + dmart.companyName + " for maximum of " + dmart.workingHours + " hours or " + dmart.workingDays + " days is: " + dmart.calculateWage());
		System.out.println("Total employee's wage of " + walmart.companyName + " for maximum of " + walmart.workingHours + " hours or " + walmart.workingDays + " days is: " + walmart.calculateWage());
	}
}