package Employee_Wage;
public class Employee_Wage {
	


	public static void main(String[] args) {
		System.out.println("Welcome to Employee Problem");
		int demart = empWage("demart" ,20,2,10);
		int Reliance = empWage("Reliance",21,4,20);
		
		
		System.out.println("for Dmart " + demart);
		System.out.println("For Reliance " + Reliance);

	
	}

	
	public static int empWage(String name, int empWagePerHour, int workingDaysInMonth, int workingHoursinMonth) {
	
		int end = 0;
		int empHrs = 0;
		int empDailyWage = 0;
		int totalEmpDays = 0;
		int totalHrs = 0;
		int totalMonthlyWage = 0;
		while (end >= 0) {
			++totalEmpDays;
			int attendance = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println(attendance);
			switch (attendance) {
			case 0:
				System.out.println("Employee is absent");
				System.out.println();
				empHrs = 0;
				break;
			case 1:
				System.out.println("Employee is present\n");
				empHrs = 8;
				break;
			case 2:
				System.out.println("Employee is present for Part time \n");
				empHrs = 4;
				break;
			}
			totalHrs += empHrs;
			empDailyWage = empWagePerHour * empHrs;
			System.out.println("Employee's salary for the day is " + empDailyWage);
			totalMonthlyWage += empDailyWage;
			if (totalEmpDays == workingDaysInMonth || totalHrs == workingHoursinMonth) {
				break;
			}
		}
		System.out.println("Total Employee Hours: " + totalHrs + " total Employee days " + totalEmpDays);
		return totalMonthlyWage;
	}
}
	