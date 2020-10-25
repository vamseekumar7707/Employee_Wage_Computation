package Employee_Wage;

public class EmpWageBuilderArray
{
	public static final int IS_PART_TIME =1;
	public static final int IS_FULL_TIME =2;

	private int numOfCompany =0;
	private Employee_Wage[] companyEmpWageArray;

public EmpWageBuilderArray() 
	{
     companyEmpWageArray =new Employee_Wage[5];
	}
private void addCompanyEmpWage(String company,int empRatePerHour,int numOfworkingDays,int maxHoursPerMonth )
	{
	companyEmpWageArray[numOfCompany] = new Employee_Wage(company , empRatePerHour, numOfworkingDays, maxHoursPerMonth);
	
	numOfCompany++;
	
	}

private void computeEmpWage() 
	{
	for (int i =0 ; i< numOfCompany; i++)
		{
		companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		System.out.println(companyEmpWageArray[i]);
		}
	}

private int computeEmpWage(Employee_Wage companyEmpWage) {
	int empHours=0,totalEmpHours=0,totalWorkingDays=0;
// Computation
	while(totalEmpHours<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfworkingDays) {
		totalWorkingDays++;
		int check=(int) (Math.floor(Math.random()*10)%3);
		switch(check) {
		case IS_FULL_TIME :
			empHours=8;
			break;
		case IS_PART_TIME :
			empHours=4;
			break;
		default : empHours=0;
}
		totalEmpHours+=empHours;
		System.out.println("Day :"+ totalWorkingDays+  "Emp Hours :" + empHours);
}
	System.out.println("Total Employee work Hours :"+totalEmpHours);
	return totalEmpHours * companyEmpWage.empRatePerHour;

}

public static void main(String[] args) 
	{
	EmpWageBuilderArray empWageBuilder =new EmpWageBuilderArray();
	empWageBuilder.addCompanyEmpWage("Idea",15,20,125);
	empWageBuilder.addCompanyEmpWage("Airtel",15,10,150);
    empWageBuilder.computeEmpWage();  
	}




}