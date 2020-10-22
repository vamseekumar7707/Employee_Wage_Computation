package Employee_Wage;
public class Employee_Wage {
	static int workingDaysInMonth = 20;
	static int workingHoursinMonth = 100;
	static int empWagePerHour = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");
		int totalMonthlyWage = empWageForMonth();
		System.out.println("Employee's salary for the month is " + totalMonthlyWage);
	}

	public static int empWageForMonth() {
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
				System.out.println("Employee is present");
				System.out.println();
				empHrs = 8;
				break;
			case 2:
				System.out.println("Employee is present for Part time");
				System.out.println();
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
	