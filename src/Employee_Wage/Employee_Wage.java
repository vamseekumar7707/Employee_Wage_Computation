package Employee_Wage;
import java.util.*;
public class Employee_Wage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");

		int attendance = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println(attendance);
		int empWagePerHour = 20;
		int empHrs = 0;
		int empDailyWage = 0;
		switch (attendance) {
		case 0:
			System.out.println("Employee is absent");
			System.out.println();
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
		empDailyWage = empWagePerHour * empHrs;
		System.out.println("Employee's salary for the day is " + empDailyWage);
	}
}