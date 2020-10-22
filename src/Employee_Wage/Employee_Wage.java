package Employee_Wage;
import java.util.*;
public class Employee_Wage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");

		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int attendance = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println(attendance);
		int empWagePerHour = 20;
		int empHrs = 0;
		int empDailyWage = 0;
		if (attendance == IS_FULL_TIME) {
			System.out.println("Employee is present");
			System.out.println();
			empHrs = 8;
		} else if (attendance == IS_PART_TIME) {
			System.out.println("Employee is present for Part time");
			System.out.println();
			empHrs = 4;

		} else {
			System.out.println("Employee is absent");
			System.out.println();
		}
		empDailyWage = empWagePerHour * empHrs;
		System.out.println("Employee's salary for the day is " + empDailyWage);
	}

}