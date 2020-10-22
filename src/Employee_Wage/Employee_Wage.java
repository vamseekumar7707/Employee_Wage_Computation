package Employee_Wage;
import java.util.*;
public class Employee_Wage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Problem");

		int IS_FULL_TIME = 1;
		int attendance = (int) (Math.round(Math.random()));
		if (attendance == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
   }
}